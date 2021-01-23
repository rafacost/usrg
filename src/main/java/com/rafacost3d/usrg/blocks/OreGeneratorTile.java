package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.Config;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class OreGeneratorTile extends BaseGeneratorTile {
	
    private HashMap<Integer, Item> oreItems = new HashMap<Integer, Item>();
    private HashMap<Integer, Integer> oreProbs = new HashMap<Integer, Integer>();
    
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
				
				oreItems.put(key, item);
				oreProbs.put(key, (int)(probability * 100));
				key++;
			}
        }
        
        if (key == 1) {
        	oreItems.put(key, Items.COAL_ORE);
            oreProbs.put(key++, (int)(0.50 * 100));

            oreItems.put(key, Items.IRON_ORE);
            oreProbs.put(key++, (int)(0.45 * 100));

            oreItems.put(key, Items.GOLD_ORE);
            oreProbs.put(key++, (int)(0.25 * 100));

            oreItems.put(key, Items.LAPIS_ORE);
            oreProbs.put(key++, (int)(0.10 * 100));

            oreItems.put(key, Items.REDSTONE_ORE);
            oreProbs.put(key++, (int)(0.10 * 100));
            
            oreItems.put(key, Items.DIAMOND_ORE);
            oreProbs.put(key++, (int)(0.05 * 100));
            
            oreItems.put(key, Items.EMERALD_ORE);
            oreProbs.put(key++, (int)(0.01 * 100));

            oreItems.put(key, Items.NETHER_QUARTZ_ORE);
            oreProbs.put(key++, (int)(0.00 * 100));
    	}
    }

    static int findCeil(int arr[], int r, int l, int h) {
        int mid;
        
        while (l < h) {
            mid = l + ((h - l) >> 1);
            if(r > arr[mid])
                l = mid + 1;
            else
                h = mid;
        }
        
        return (arr[l] >= r) ? l : -1;
    }

    static int myRand(int arr[]) {
    	int n = arr.length;
        int prefix[] = new int[n + 1];
        
        for (int i = 0; i < n; ++i) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        
        int r = ((int)(Math.random() * (323567)) % prefix[n]) + 1;

        return findCeil(prefix, r, 0, n);
    }

    public Item rndOre(){
    	int[] arr = new int[oreProbs.size()];
    	int index = 0;
    	
    	for (int key = 1; key <= oreProbs.size(); key++) {
    		if (oreProbs.containsKey(key)) {
    			arr[index] = oreProbs.get(key);
    		}
    		index++;
    	}
    	
        int key = myRand(arr);
        return oreItems.get(key);
    }

    @Override
    public void tick() {
        if(tickcount % tickspergencycle == 0) {
        	Item item = rndOre();
        	if (item != null) {
                ItemStack stack = new ItemStack(item, 1);
                ItemHandlerHelper.insertItemStacked(getHandler(), stack, false);
        	}
        }
        tickcount += 1;
    }

}
