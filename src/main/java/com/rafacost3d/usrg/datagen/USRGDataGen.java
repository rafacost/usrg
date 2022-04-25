package com.rafacost3d.usrg.datagen;

import com.rafacost3d.usrg.USRG;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = USRG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class USRGDataGen {
    private USRGDataGen(){}
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()){
            generator.addProvider(new USRGLootTableGen(generator));
            generator.addProvider(new USRGRecipesGen(generator));
        }
        if (event.includeClient()){
            generator.addProvider(new USRGBlockStateGen(generator, event.getExistingFileHelper()));
            generator.addProvider(new USRGLangGen(generator));
        }
    }
}
