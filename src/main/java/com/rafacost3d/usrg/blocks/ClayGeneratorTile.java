package com.rafacost3d.usrg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class ClayGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.CLAY;
	public static final Item GENERATION_ITEM = Items.CLAY_BALL;

    public ClayGeneratorTile() {
        super(CLAYGENERATOR_TILE);
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
