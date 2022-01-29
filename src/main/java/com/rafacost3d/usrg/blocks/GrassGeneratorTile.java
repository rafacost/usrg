package com.rafacost3d.usrg.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class GrassGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.GRASS_BLOCK;

    public GrassGeneratorTile(BlockPos pos, BlockState state) {
        super(GRASSGENERATOR_TILE, pos, state);
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
