package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.Config;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.items.ItemHandlerHelper;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class QuartzGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.QUARTZ_BLOCK;
	public static final Item GENERATION_ITEM = Items.QUARTZ;

    public QuartzGeneratorTile() {
        super(QUARTZGENERATOR_TILE);
    }

    @Override
    public void tick() {
        if(tickcount % tickspergencycle == 0) {
    	      if (Config.GENERATE_DUST.get()) {
                ItemStack stack = new ItemStack(GENERATION_ITEM, 1);
                ItemHandlerHelper.insertItemStacked(getHandler(),stack, false);
    	      } else {
                ItemStack stack = new ItemStack(GENERATION_BLOCK, 1);
                ItemHandlerHelper.insertItemStacked(getHandler(),stack, false);
    	      }
            tickcount = 1;
        }
        tickcount += 1;
    }

}
