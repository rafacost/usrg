package com.rafacost3d.usrg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class QuartzGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.QUARTZ_BLOCK;
	public static final Item GENERATION_ITEM = Items.QUARTZ;

    public QuartzGeneratorTile() {
        super(QUARTZGENERATOR_TILE);
    }

    @Override
    public ItemStack getGenerationDust() {
        return new ItemStack(GENERATION_ITEM, itemsPerGenCycle);
    }

    @Override
    public ItemStack getGenerationBlock() {
        return new ItemStack(GENERATION_BLOCK, itemsPerGenCycle);
    }

}
