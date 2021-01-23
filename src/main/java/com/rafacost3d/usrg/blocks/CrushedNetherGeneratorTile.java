package com.rafacost3d.usrg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class CrushedNetherGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.NETHERRACK;

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
                ItemStack stack = new ItemStack(GENERATION_BLOCK, 1);
                ItemHandlerHelper.insertItemStacked(getHandler(), stack, false);
            }
            tickcount = 1;
        }
        tickcount += 1;
    }

}
