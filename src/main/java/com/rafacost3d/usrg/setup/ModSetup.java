package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("usrg") {

        @Override
        public ItemStack createIcon(){
            return new ItemStack(ModBlocks.COBBLEGENERATOR);
        }

    };

    public void init(){

    }
}
