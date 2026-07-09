package com.rafacost3d.usrg.setup;

import com.google.common.base.Predicates;
import com.google.common.collect.Lists;

import net.neoforged.neoforge.common.ModConfigSpec;



import java.util.List;

public class Config {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_OREGEN = "oregenerator";

    private static final ModConfigSpec.Builder COMMON_BUILDER = new ModConfigSpec.Builder();
    private static final ModConfigSpec.Builder CLIENT_BUILDER = new ModConfigSpec.Builder();

    public static ModConfigSpec COMMON_CONFIG;
    public static ModConfigSpec CLIENT_CONFIG;

    public static ModConfigSpec.BooleanValue GENERATE_DUST;
    public static ModConfigSpec.IntValue BLOCK_PER_TICK;
    public static ModConfigSpec.BooleanValue ENABLE_ORE_GENERATOR;
    public static ModConfigSpec.BooleanValue ENABLE_DYE_GENERATOR;
    public static ModConfigSpec.ConfigValue<List<? extends String>> ORE_GENERATOR_ITEMS;

    static {
        COMMON_BUILDER.comment("General Settings").push(CATEGORY_GENERAL);
        GENERATE_DUST = COMMON_BUILDER.comment("Clay, Glowstone, Quartz, Redstone and Snow Generators will generate dust items, not blocks.").define("generate_dust", false);
        BLOCK_PER_TICK = COMMON_BUILDER.comment("Ticks between each generation cycle.").defineInRange("blocks_per_tick", 40, 1, 2000);
        ENABLE_ORE_GENERATOR = COMMON_BUILDER.comment("Enable the Ore Generator.").define("oreGeneratorEnable", true);
        ENABLE_DYE_GENERATOR = COMMON_BUILDER.comment("Enable the Dye Generator.").define("dyeGeneratorEnable", true);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Generator Settings").push(CATEGORY_OREGEN);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("OreGenerator Probabilities").push(CATEGORY_OREGEN);
        ORE_GENERATOR_ITEMS = COMMON_BUILDER
                .comment("Comma separated list of the items and probabilities (probability value between 0.00 and 1.00) to be used in the Ore Generator, format to use: \"modid:itemname*probability\" e.g. \"minecraft:iron_ore*0.45\"")
                .defineList("oreGeneratorItems", 
            		Lists.newArrayList("minecraft:coal_ore*0.50", "minecraft:iron_ore*0.45", "minecraft:gold_ore*0.25", "minecraft:lapis_ore*0.10", "minecraft:redstone_ore*0.10", "minecraft:diamond_ore*0.05", "minecraft:emerald_ore*0.02", "minecraft:nether_quartz_ore*0.00", "minecraft:ancient_debris*0.01", "minecraft:copper_ore*0.40", "minecraft:deepslate_coal_ore*0.49", "minecraft:deepslate_iron_ore*0.44", "minecraft:deepslate_copper_ore*0.39", "minecraft:deepslate_gold_ore*0.24", "minecraft:deepslate_lapis_ore*0.09", "minecraft:deepslate_redstone_ore*0.09", "minecraft:deepslate_diamond_ore*0.04", "minecraft:deepslate_emerald_ore*0.01"), Predicates.alwaysTrue());
        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }
}
