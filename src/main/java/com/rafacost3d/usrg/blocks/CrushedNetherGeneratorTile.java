package com.rafacost3d.usrg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.rafacost3d.usrg.setup.Config;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class CrushedNetherGeneratorTile extends TileEntity implements ITickableTileEntity {

    private ItemStackHandler handler;

    private Integer tickcount = 0;
    private Integer tickspergencycle = Config.BLOCK_PER_TICK.get();

    public CrushedNetherGeneratorTile() {
        super(NETHERCRUSHEDGENERATOR_TILE);
    }

    @Override
    public void tick() {
        if(tickcount % tickspergencycle == 0) {
        	ResourceLocation key = new ResourceLocation("exnihilosequentia:crushed_netherrack");
        	
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
            	Block block = ForgeRegistries.BLOCKS.getValue(key);
                ItemStack stack = new ItemStack(block, 1);
                ItemHandlerHelper.insertItemStacked(getHandler(), stack, false);
            } else {
            	Block block = Blocks.NETHERRACK;
                ItemStack stack = new ItemStack(block, 1);
                ItemHandlerHelper.insertItemStacked(getHandler(), stack, false);
            }
            tickcount = 1;
        }
        tickcount += 1;
    }

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

    @Nonnull
    @Override
    public <T>LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            return LazyOptional.of(() -> (T) getHandler());
        }
        return super.getCapability(cap, side);
    }
}
