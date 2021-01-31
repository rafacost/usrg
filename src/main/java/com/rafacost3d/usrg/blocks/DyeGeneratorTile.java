package com.rafacost3d.usrg.blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Tags;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class DyeGeneratorTile extends BaseRandomGeneratorTile {
    
    public DyeGeneratorTile() {
        super(DYEGENERATOR_TILE);
        
        int key = 1;

        for (Item item : Tags.Items.DYES.getAllElements()) {
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
