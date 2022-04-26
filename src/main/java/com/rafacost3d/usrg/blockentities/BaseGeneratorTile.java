package com.rafacost3d.usrg.blockentities;

import com.rafacost3d.usrg.setup.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class BaseGeneratorTile extends BlockEntity {
    private int tickCount;
    private final ConfigCache configCache;
    protected ItemStackHandler handler;
    private int ticksPerGenCycle;

    protected BaseGeneratorTile(Config.Tiers tiers, BlockEntityType<?> tileEntityTypeIn, BlockPos pos, BlockState state) {
        super(tileEntityTypeIn, pos, state);
        this.configCache = new ConfigCache(tiers);
        this.ticksPerGenCycle = configCache.getInterval();
    }

    public void tickServer(Block block) {
        tickServer(block.asItem(), block);
    }

    public void tickServer(Item item, Block block) {
        tickServer(new ItemStack(item), new ItemStack(block));
    }

    public void tickServer(Item item) {
        tickServer(new ItemStack(item), new ItemStack(item));
    }

    public void tickServer(ItemStack item, ItemStack block) {
        if(tickCount % ticksPerGenCycle == 0) {
            ticksPerGenCycle = configCache.getInterval();
            ItemStack stack;

            if (Boolean.TRUE.equals(Config.GENERATE_DUST.get())) {
                stack = item;
            } else {
                stack = block;
            }

            ItemHandlerHelper.insertItemStacked(getHandler(), stack, false);
            tickCount = 1;
        }
        tickCount += 1;
    }

    @Override
    protected void saveAdditional(@Nonnull CompoundTag tag) {
        CompoundTag compound = getHandler().serializeNBT();
        tag.put("inv", compound);
    }

    protected ItemStackHandler getHandler(){
        if (handler == null) {
            handler = new ItemStackHandler(1);
        }
        return handler;
    }

    @SuppressWarnings("unchecked")
    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            return LazyOptional.of(() -> (T) getHandler());
        }
        return super.getCapability(cap, side);
    }

    static class ConfigCache {
        private final Config.Tiers tiers;
        private int interval;

        ConfigCache(Config.Tiers tiers) {
            this.tiers = tiers;
            update();
        }

        private void update() {
            this.interval = this.tiers.interval.get();
        }

        public int getInterval() {
            return interval;
        }
    }
}
