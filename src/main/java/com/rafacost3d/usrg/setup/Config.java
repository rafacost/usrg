package com.rafacost3d.usrg.setup;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;



import java.nio.file.Path;
import java.util.List;

@Mod.EventBusSubscriber
public class Config {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_OREGEN = "oregenerator";

    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.IntValue BLOCK_PER_TICK;
    public static ForgeConfigSpec.IntValue ORE_PER_TICK;
    public static ForgeConfigSpec.ConfigValue<List<? extends String>> ORE_GENERATOR_ITEMS;

    static {
        COMMON_BUILDER.comment("General Settings").push(CATEGORY_GENERAL);
        BLOCK_PER_TICK = COMMON_BUILDER.comment("Ticks between Block Generated").defineInRange("blocks_per_tick", 40, 1, 2000);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("OreGenerator Settings").push(CATEGORY_OREGEN);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("OreGenerator Probabilities").push(CATEGORY_OREGEN);
        ORE_GENERATOR_ITEMS = COMMON_BUILDER
                .comment("Comma separated list of the items and probabilities (probability value between 0.00 and 1.00) to be used in the Ore Generator, format to use: \"modid:itemname*probability\" e.g. \"minecraft:iron_ore*0.45\"")
                .defineList("oreGeneratorItems", 
            		Lists.newArrayList("minecraft:coal_ore*0.50", "minecraft:iron_ore*0.45", "minecraft:gold_ore*0.25", "minecraft:lapis_ore*0.10", "minecraft:redstone_ore*0.10", "minecraft:diamond_ore*0.05", "minecraft:emerald_ore*0.01", "minecraft:nether_quartz_ore*0.00"), Predicates.alwaysTrue());
        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }

    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();
        configData.load();
        spec.setConfig(configData);
    }
}
