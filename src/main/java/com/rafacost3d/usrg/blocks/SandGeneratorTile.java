package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.ModBlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;


public class SandGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.SAND;

    public SandGeneratorTile(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SANDGENERATOR_TILE.get(), pos, state);
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
