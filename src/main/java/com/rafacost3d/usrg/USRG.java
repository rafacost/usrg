package com.rafacost3d.usrg;

import com.rafacost3d.usrg.setup.Config;
import com.rafacost3d.usrg.setup.ModBlockEntities;
import com.rafacost3d.usrg.setup.ModBlocks;
import com.rafacost3d.usrg.setup.ModCreativeTabs;
import com.rafacost3d.usrg.setup.ModItems;
import com.rafacost3d.usrg.setup.ModSetup;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(USRG.MODID)
public class USRG {
    public static final String MODID = "usrg";

    private final ModSetup setup = new ModSetup();

    public USRG(IEventBus modBus, ModContainer modContainer) {
        ModBlocks.register(modBus);
        ModItems.register(modBus);
        ModBlockEntities.register(modBus);
        ModCreativeTabs.register(modBus);

        modBus.addListener(this::setup);
        modBus.addListener(ModBlockEntities::registerCapabilities);

        modContainer.registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
    }
}
