package com.rafacost3d.usrg.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class CrushedEndstoneGeneratorTile extends BaseGeneratorTile {

    public static final String RESOURCE_KEY = "exnihilosequentia:crushed_end_stone";
	public static final Block GENERATION_BLOCK = Blocks.END_STONE;

    public CrushedEndstoneGeneratorTile(BlockPos pos, BlockState state) {
        super(ENDCRUSHEDGENERATOR_TILE, pos, state);
    }

    @Override
    public ItemStack getGenerationDust() {
        ResourceLocation key = new ResourceLocation(RESOURCE_KEY);

        if (ForgeRegistries.BLOCKS.containsKey(key)) {
            Block block = ForgeRegistries.BLOCKS.getValue(key);
            return new ItemStack(block, itemsPerGenCycle);
        }
        return new ItemStack(GENERATION_BLOCK, itemsPerGenCycle);
    }

    @Override
    public ItemStack getGenerationBlock() {
        ResourceLocation key = new ResourceLocation(RESOURCE_KEY);

        if (ForgeRegistries.BLOCKS.containsKey(key)) {
            Block block = ForgeRegistries.BLOCKS.getValue(key);
            return new ItemStack(block, itemsPerGenCycle);
        }
        return new ItemStack(GENERATION_BLOCK, itemsPerGenCycle);
    }

}
