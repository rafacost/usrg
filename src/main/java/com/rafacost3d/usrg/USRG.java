package com.rafacost3d.usrg;

import com.rafacost3d.usrg.setup.Config;
import com.rafacost3d.usrg.setup.ModBlockEntities;
import com.rafacost3d.usrg.setup.ModBlocks;
import com.rafacost3d.usrg.setup.ModCreativeTabs;
import com.rafacost3d.usrg.setup.ModItems;
import com.rafacost3d.usrg.setup.ModSetup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(USRG.MODID)
public class USRG {
    public static final String MODID = "usrg";

    private final ModSetup setup = new ModSetup();

    public USRG() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modBus);
        ModItems.register(modBus);
        ModBlockEntities.register(modBus);
        ModCreativeTabs.register(modBus);

        modBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("usrg-common.toml"));
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
    }
}
