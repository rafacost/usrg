package com.rafacost3d.usrg.setup;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;



import java.nio.file.Path;

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
    public static ForgeConfigSpec.DoubleValue EMERALD_ORE_PROB;
    public static ForgeConfigSpec.DoubleValue DIAMOND_ORE_PROB;
    public static ForgeConfigSpec.DoubleValue LAPIS_ORE_PROB;
    public static ForgeConfigSpec.DoubleValue NETHER_QUARTZ_ORE_PROB;
    public static ForgeConfigSpec.DoubleValue GOLD_ORE_PROB;
    public static ForgeConfigSpec.DoubleValue REDSTONE_ORE_PROB;
    public static ForgeConfigSpec.DoubleValue IRON_ORE_PROB;
    public static ForgeConfigSpec.DoubleValue COAL_ORE_PROB;


    static {
        COMMON_BUILDER.comment("General Settings").push(CATEGORY_GENERAL);
        BLOCK_PER_TICK = COMMON_BUILDER.comment("Ticks between Block Generated").defineInRange("blocks_per_tick", 40, 1, 2000);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("OreGenerator Settings").push(CATEGORY_OREGEN);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("OreGenerator Probabilities").push(CATEGORY_OREGEN);
        EMERALD_ORE_PROB = COMMON_BUILDER.comment("Emerald Probability").defineInRange("emerald_prob", 0.01, 0, 1.0);
        DIAMOND_ORE_PROB = COMMON_BUILDER.comment("Diamond Probability").defineInRange("diamond_prob", 0.05, 0, 1.0);
        LAPIS_ORE_PROB = COMMON_BUILDER.comment("Lapis Probability").defineInRange("lapis_prob", 0.1, 0, 1.0);
        NETHER_QUARTZ_ORE_PROB = COMMON_BUILDER.comment("Quartz Probability").defineInRange("quartz_prob", 0.0, 0, 1.0);
        GOLD_ORE_PROB = COMMON_BUILDER.comment("Gold Probability").defineInRange("gold_prob", 0.25, 0, 1.0);
        REDSTONE_ORE_PROB = COMMON_BUILDER.comment("Redstone Probability").defineInRange("redstone_prob", 0.0, 0, 1.0);
        IRON_ORE_PROB = COMMON_BUILDER.comment("Iron Probability").defineInRange("iron_prob", 0.45, 0, 1.0);
        COAL_ORE_PROB = COMMON_BUILDER.comment("Coal Probability").defineInRange("coal_prob", 0.50, 0, 1.0);
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
