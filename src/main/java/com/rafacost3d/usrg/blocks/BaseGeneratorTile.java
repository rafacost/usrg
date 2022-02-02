package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class BaseGeneratorTile extends BlockEntity {

    protected ItemStackHandler handler;
    protected Integer ticksPerGenCycle = Config.BLOCK_PER_TICK.get();
    protected Integer tickCount = 0;
    protected Integer itemsPerGenCycle = 1;

    public BaseGeneratorTile(BlockEntityType<?> tileEntityTypeIn, BlockPos pos, BlockState state) {
        super(tileEntityTypeIn, pos, state);
    }

    public void tickServer() {
        if(tickCount % ticksPerGenCycle == 0) {
            ItemStack stack = null;

            if (Config.GENERATE_DUST.get()) {
                stack = getGenerationDust();
            } else {
                stack = getGenerationBlock();
            }

            if (stack != null) {
                ItemHandlerHelper.insertItemStacked(getHandler(), stack, false);
            }
            tickCount = 1;
        }
        tickCount += 1;
    }

    public abstract ItemStack getGenerationDust() ;

    public abstract ItemStack getGenerationBlock() ;

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

}
