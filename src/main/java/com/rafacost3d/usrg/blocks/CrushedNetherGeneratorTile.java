package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.ModBlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.registries.BuiltInRegistries;


public class CrushedNetherGeneratorTile extends BaseGeneratorTile {

    public static final String RESOURCE_KEY = "exnihilosequentia:crushed_netherrack";
	public static final Block GENERATION_BLOCK = Blocks.NETHERRACK;

    public CrushedNetherGeneratorTile(BlockPos pos, BlockState state) {
        super(ModBlockEntities.NETHERCRUSHEDGENERATOR_TILE.get(), pos, state);
    }

    @Override
    public ItemStack getGenerationDust() {
        ResourceLocation key = ResourceLocation.parse(RESOURCE_KEY);

        if (BuiltInRegistries.BLOCK.containsKey(key)) {
            Block block = BuiltInRegistries.BLOCK.get(key);
            return new ItemStack(block, itemsPerGenCycle);
        }
        return new ItemStack(GENERATION_BLOCK, itemsPerGenCycle);
    }

    @Override
    public ItemStack getGenerationBlock() {
        ResourceLocation key = ResourceLocation.parse(RESOURCE_KEY);

        if (BuiltInRegistries.BLOCK.containsKey(key)) {
            Block block = BuiltInRegistries.BLOCK.get(key);
            return new ItemStack(block, itemsPerGenCycle);
        }
        return new ItemStack(GENERATION_BLOCK, itemsPerGenCycle);
    }

}
