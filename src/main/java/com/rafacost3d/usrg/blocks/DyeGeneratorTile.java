package com.rafacost3d.usrg.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class DyeGeneratorTile extends BaseRandomGeneratorTile {
    
    public DyeGeneratorTile(BlockPos pos, BlockState state) {
        super(DYEGENERATOR_TILE, pos, state);
        
        int key = 1;

        for (Item item : Tags.Items.DYES.getValues()) {
            rndItems.put(key, item);
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
