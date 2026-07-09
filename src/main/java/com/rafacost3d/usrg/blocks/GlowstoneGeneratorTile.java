package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.ModBlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;


public class GlowstoneGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.GLOWSTONE;
	public static final Item GENERATION_ITEM = Items.GLOWSTONE_DUST;

    public GlowstoneGeneratorTile(BlockPos pos, BlockState state) {
        super(ModBlockEntities.GLOWSTONEGENERATOR_TILE.get(), pos, state);
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
