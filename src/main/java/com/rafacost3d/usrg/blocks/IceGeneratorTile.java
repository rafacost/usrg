package com.rafacost3d.usrg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class IceGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.ICE;

    public IceGeneratorTile() {
        super(ICEGENERATOR_TILE);
    }

    @Override
    public ItemStack getGenerationDust() {
        return new ItemStack(GENERATION_BLOCK, itemsPerGenCycle);
    }

    @Override
    public ItemStack getGenerationBlock() {
        return new ItemStack(GENERATION_BLOCK, itemsPerGenCycle);
    }

}
