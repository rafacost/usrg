package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.blocks.BaseGeneratorTile;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import static com.rafacost3d.usrg.blocks.ModBlocks.CLEANGENERATOR_TILE;

public class CleanGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.STONE;

    public CleanGeneratorTile(BlockPos pos, BlockState state) {
        super(CLEANGENERATOR_TILE, pos, state);
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
