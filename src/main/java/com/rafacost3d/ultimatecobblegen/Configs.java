package com.rafacost3d.ultimatecobblegen;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = UltimateCobbleGen.MODID)
@Mod.EventBusSubscriber(modid = UltimateCobbleGen.MODID)
public class Configs {

    @Config.RangeInt(min = 0)
    @Config.RequiresWorldRestart
    public static int RF_PER_BLOCK = 0;

    @Config.RangeInt(min = -1)
    @Config.Comment("Set this to any positive value to limit the number of generated items, or -1 to make it infinite.")
    public static int MAX_COBBLE_PER_TICK = -1;

    @SubscribeEvent
    public static void onConfigChanged(ConfigChangedEvent event) {
        if (event.getModID().equals(UltimateCobbleGen.MODID)) {
            ConfigManager.sync(UltimateCobbleGen.MODID, Config.Type.INSTANCE);
        }
    }
}
