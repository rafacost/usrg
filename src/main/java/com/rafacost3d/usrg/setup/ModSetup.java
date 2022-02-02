package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.blocks.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModSetup {

    public CreativeModeTab itemGroup = new CreativeModeTab("usrg") {

        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModBlocks.COBBLEGENERATOR);
        }

    };

    public void init() { }
}
