package com.rafacost3d.usrg.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class QuartzGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.QUARTZ_BLOCK;
	public static final Item GENERATION_ITEM = Items.QUARTZ;

    public QuartzGeneratorTile(BlockPos pos, BlockState state) {
        super(QUARTZGENERATOR_TILE, pos, state);
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
