package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.ModBlockEntities;

import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;


public class DyeGeneratorTile extends BaseRandomGeneratorTile {
    
    public DyeGeneratorTile(BlockPos pos, BlockState state) {
        super(ModBlockEntities.DYEGENERATOR_TILE.get(), pos, state);
        
        int key = 1;

        for (Holder<Item> item : BuiltInRegistries.ITEM.getTagOrEmpty(Tags.Items.DYES)) {
            rndItems.put(key, item.value());
            rndProbs.put(key++, (int)(0.10 * 100));
        }
    }

    @Override
    public ItemStack getGenerationDust() {
        Item item = getRandomItem();
        if (item != null) {
            return new ItemStack(item, itemsPerGenCycle);
        }
        return null;
    }

    @Override
    public ItemStack getGenerationBlock() {
        Item item = getRandomItem();
        if (item != null) {
            return new ItemStack(item, itemsPerGenCycle);
        }
        return null;
    }

}
