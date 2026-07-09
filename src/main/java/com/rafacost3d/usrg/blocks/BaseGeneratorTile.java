package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.items.ItemStackHandler;

import javax.annotation.Nonnull;

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
    protected void saveAdditional(@Nonnull CompoundTag tag, HolderLookup.Provider provider) {
        super.saveAdditional(tag, provider);
        CompoundTag compound = getHandler().serializeNBT(provider);
        tag.put("inv", compound);
    }

    @Override
    protected void loadAdditional(@Nonnull CompoundTag tag, HolderLookup.Provider provider) {
        super.loadAdditional(tag, provider);
        getHandler().deserializeNBT(provider, tag.getCompound("inv"));
    }

    public ItemStackHandler getHandler(){
        if (handler == null) {
            handler = new ItemStackHandler(1);
        }
        return handler;
    }

}
