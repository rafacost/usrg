package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.Config;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class OreGeneratorTile extends BaseRandomGeneratorTile {
    
    public OreGeneratorTile() {
        super(OREGENERATOR_TILE);
        
        int key = 1;
        
        for (String oreGeneratorItem : Config.ORE_GENERATOR_ITEMS.get()) {
			if (oreGeneratorItem == null || oreGeneratorItem.trim() == "") {
				continue;
			}
			
			String[] itemParts = oreGeneratorItem.split("[*]");
			String itemName = itemParts[0];
			Double probability = 0.0;
			
			if (itemParts.length == 2) {
				try {
					probability = Double.parseDouble(itemParts[1]);
					probability = Math.min(1, probability);
					probability = Math.max(0, probability);
				}
				catch (NumberFormatException ex) {
					probability = 0.0;
				}
			}
			
			ResourceLocation resourceKey = new ResourceLocation(itemName);
			if (ForgeRegistries.ITEMS.containsKey(resourceKey)) {
				Item item = ForgeRegistries.ITEMS.getValue(resourceKey);

                rndItems.put(key, item);
                rndProbs.put(key, (int)(probability * 100));
				key++;
			}
        }
        
        if (key == 1) {
            rndItems.put(key, Items.COAL_ORE);
            rndProbs.put(key++, (int)(0.50 * 100));

            rndItems.put(key, Items.IRON_ORE);
            rndProbs.put(key++, (int)(0.45 * 100));

            rndItems.put(key, Items.GOLD_ORE);
            rndProbs.put(key++, (int)(0.25 * 100));

            rndItems.put(key, Items.LAPIS_ORE);
            rndProbs.put(key++, (int)(0.10 * 100));

            rndItems.put(key, Items.REDSTONE_ORE);
            rndProbs.put(key++, (int)(0.10 * 100));

            rndItems.put(key, Items.DIAMOND_ORE);
            rndProbs.put(key++, (int)(0.05 * 100));

            rndItems.put(key, Items.EMERALD_ORE);
            rndProbs.put(key++, (int)(0.01 * 100));

            rndItems.put(key, Items.NETHER_QUARTZ_ORE);
            rndProbs.put(key++, (int)(0.00 * 100));
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
