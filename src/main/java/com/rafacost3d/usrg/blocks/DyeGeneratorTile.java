package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.Config;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.HashMap;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class DyeGeneratorTile extends TileEntity implements ITickableTileEntity {
	
    private HashMap<Integer, Item> dyeItems = new HashMap<Integer, Item>();
    private HashMap<Integer, Integer> dyeProbs = new HashMap<Integer, Integer>();

    private ItemStackHandler handler;
    private Integer tickcount = 0;
    private Integer tickspergencycle = Config.BLOCK_PER_TICK.get();
    
    public DyeGeneratorTile() {
        super(DYEGENERATOR_TILE);
        
        int key = 1;

        for (Item item : Tags.Items.DYES.getAllElements()) {
        	dyeItems.put(key, item);
        	dyeProbs.put(key++, (int)(0.10 * 100));
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

    public Item rndDye(){
    	int[] arr = new int[dyeProbs.size()];
    	int index = 0;
    	
    	for (int key = 1; key <= dyeProbs.size(); key++) {
    		if (dyeProbs.containsKey(key)) {
    			arr[index] = dyeProbs.get(key);
    		}
    		index++;
    	}
    	
        int key = myRand(arr);
        return dyeItems.get(key);
    }

    @Override
    public void tick() {
        if(tickcount % tickspergencycle == 0) {
        	Item item = rndDye();
        	if (item != null) {
                ItemStack stack = new ItemStack(item, 1);
                ItemHandlerHelper.insertItemStacked(getHandler(), stack, false);
        	}
        }
        tickcount += 1;
    }

    @Override
    public CompoundNBT write(CompoundNBT tag) {
        CompoundNBT compound = getHandler().serializeNBT();
        tag.put("inv", compound);
        return super.write(tag);
    }

    private ItemStackHandler getHandler(){
        if(handler == null) {
            handler = new ItemStackHandler(1);
        }
        return handler;
    }

    @SuppressWarnings("unchecked")
	@Nonnull
    @Override
    public <T>LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            return LazyOptional.of(() -> (T) getHandler());
        }
        return super.getCapability(cap, side);
    }
}
