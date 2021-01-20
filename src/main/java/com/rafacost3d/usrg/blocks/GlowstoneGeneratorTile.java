package com.rafacost3d.usrg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.rafacost3d.usrg.setup.Config;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class GlowstoneGeneratorTile extends TileEntity implements ITickableTileEntity {

	public static final Block GENERATION_BLOCK = Blocks.GLOWSTONE;
	public static final Item GENERATION_ITEM = Items.GLOWSTONE_DUST;

    private ItemStackHandler handler;

    private Integer tickcount = 0;
    private Integer tickspergencycle = Config.BLOCK_PER_TICK.get();

    public GlowstoneGeneratorTile() {
        super(GLOWSTONEGENERATOR_TILE);
    }

    @Override
    public void tick() {
        if(tickcount % tickspergencycle == 0) {
    	      if (Config.GENERATE_DUST.get()) {
                ItemStack stack = new ItemStack(GENERATION_ITEM, 1);
                ItemHandlerHelper.insertItemStacked(getHandler(),stack, false);
    	      } else {
                ItemStack stack = new ItemStack(GENERATION_BLOCK, 1);
                ItemHandlerHelper.insertItemStacked(getHandler(),stack, false);
    	      }
            tickcount = 1;
        }
        tickcount += 1;
    }
//
//    @Override
//    public void read(CompoundNBT tag) {
//        CompoundNBT invTag = tag.getCompound("inv");
//        getHandler().deserializeNBT(invTag);
//        super.read(tag);
//    }

    @Override
    public CompoundNBT write(CompoundNBT tag) {
        CompoundNBT compound = getHandler().serializeNBT();
        tag.put("inv", compound);
        return super.write(tag);
    }

    private ItemStackHandler getHandler(){
        if(handler == null) {
            handler = new ItemStackHandler(1);
        }
        return handler;
    }

    @SuppressWarnings("unchecked")
	@Nonnull
    @Override
    public <T>LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            return LazyOptional.of(() -> (T) getHandler());
        }
        return super.getCapability(cap, side);
    }
}
