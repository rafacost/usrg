package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.Config;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import java.util.HashMap;
import java.util.Random;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;


public class OreGeneratorTile extends TileEntity implements ITickableTileEntity {

    private ItemStackHandler handler;
    private HashMap<Integer, Double> oreIdx = new HashMap<Integer, Double>();
    private HashMap<Integer, Item> oreProbs = new HashMap<Integer, Item>();
    private static final Logger LOGGER = LogManager.getLogger();



    public OreGeneratorTile() {
        super(OREGENERATOR_TILE);
        oreIdx.put(1,Config.EMERALD_ORE_PROB.get());
        oreIdx.put(2,Config.DIAMOND_ORE_PROB.get());
        oreIdx.put(3,Config.LAPIS_ORE_PROB.get());
        oreIdx.put(4,Config.NETHER_QUARTZ_ORE_PROB.get());
        oreIdx.put(5,Config.GOLD_ORE_PROB.get());
        oreIdx.put(6,Config.REDSTONE_ORE_PROB.get());
        oreIdx.put(7,Config.IRON_ORE_PROB.get());
        oreIdx.put(8,Config.COAL_ORE_PROB.get());

        oreProbs.put(1, Items.EMERALD_ORE);
        oreProbs.put(2, Items.DIAMOND_ORE);
        oreProbs.put(3, Items.LAPIS_ORE);
        oreProbs.put(4, Items.NETHER_QUARTZ_ORE);
        oreProbs.put(5, Items.GOLD_ORE);
        oreProbs.put(6, Items.field_234760_kn_);
        oreProbs.put(7, Items.IRON_ORE);
        oreProbs.put(8, Items.COAL_ORE);
    }

    static int findCeil(int arr[], int r, int l, int h)
    {
        int mid;
        while (l < h)
        {
            mid = l + ((h - l) >> 1);
            if(r > arr[mid])
                l = mid + 1;
            else
                h = mid;
        }
        return (arr[l] >= r) ? l : -1;
    }

    static int myRand(int arr[], int freq[], int n)
    {
        int prefix[] = new int[n], i;
        prefix[0] = freq[0];
        for (i = 1; i < n; ++i)
            prefix[i] = prefix[i - 1] + freq[i];

        int r = ((int)(Math.random()*(323567)) % prefix[n - 1]) + 1;

        int indexc = findCeil(prefix, r, 0, n - 1);
        return arr[indexc];
    }

    public Item rndOre(){
        //Integer x=0;
        //for(int i=1;i<=oreIdx.size();i++){
        //    x=0;
        //    Double rndNumber = new Random().nextDouble();
        //    if(rndNumber<=oreIdx.get(i)){x=i;return oreProbs.get(x);}
        //}
        //return oreProbs.get(x);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int freq[]={0,0,0,0,0,0,0,0,0};
        freq[1] = (int)(oreIdx.get(1)*100);
        freq[2] = (int)(oreIdx.get(2)*100);
        freq[3] = (int)(oreIdx.get(3)*100);
        freq[4] = (int)(oreIdx.get(4)*100);
        freq[5] = (int)(oreIdx.get(5)*100);
        freq[6] = (int)(oreIdx.get(6)*100);
        freq[7] = (int)(oreIdx.get(7)*100);
        freq[8] = (int)(oreIdx.get(8)*100);
        int n = arr.length;
        //LOGGER.info(freq[1] + "," + freq[2]+ "," + freq[3]+ "," + freq[4]+ "," + freq[5]+ "," + freq[6]+ "," + freq[7]+ "," + freq[8]);
        int r = myRand(arr, freq, n);
        //LOGGER.info("Random: " + r);
        //LOGGER.info(oreProbs.get(r).toString());
        return oreProbs.get(r);
    }

    private Integer count=0;
    private Integer orepertick= Config.BLOCK_PER_TICK.get();
    @Override
    public void tick() {
        if(count%orepertick == 0) {
            ItemStack stack = new ItemStack(rndOre(), 1);
            ItemHandlerHelper.insertItemStacked(getHandler(), stack, false);
        }
        count+=1;
    }

//    @Override
//    public void read(CompoundNBT tag) {
//        CompoundNBT invTag = tag.getCompound("inv");
//        getHandler().deserializeNBT(invTag);
//        super.read(tag);
//    }

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

    @Nonnull
    @Override
    public <T>LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            return LazyOptional.of(() -> (T) getHandler());
        }
        return super.getCapability(cap, side);
    }
}
