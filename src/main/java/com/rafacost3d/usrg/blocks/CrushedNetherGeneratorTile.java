package com.rafacost3d.usrg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class CrushedNetherGeneratorTile extends BaseGeneratorTile {

    public static final String RESOURCE_KEY = "exnihilosequentia:crushed_netherrack";
	public static final Block GENERATION_BLOCK = Blocks.NETHERRACK;

    public CrushedNetherGeneratorTile() {
        super(NETHERCRUSHEDGENERATOR_TILE);
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
