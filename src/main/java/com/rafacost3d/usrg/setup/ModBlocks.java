package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.USRG;
import com.rafacost3d.usrg.blocks.BaseGenerator;
import com.rafacost3d.usrg.blocks.ClayGenerator;
import com.rafacost3d.usrg.blocks.CleanGenerator;
import com.rafacost3d.usrg.blocks.CobblestoneGenerator;
import com.rafacost3d.usrg.blocks.CrushedEndstoneGenerator;
import com.rafacost3d.usrg.blocks.CrushedNetherGenerator;
import com.rafacost3d.usrg.blocks.DirtGenerator;
import com.rafacost3d.usrg.blocks.DustGenerator;
import com.rafacost3d.usrg.blocks.DyeGenerator;
import com.rafacost3d.usrg.blocks.EndstoneGenerator;
import com.rafacost3d.usrg.blocks.FungusGenerator;
import com.rafacost3d.usrg.blocks.GlowstoneGenerator;
import com.rafacost3d.usrg.blocks.GrassGenerator;
import com.rafacost3d.usrg.blocks.GravelGenerator;
import com.rafacost3d.usrg.blocks.IceGenerator;
import com.rafacost3d.usrg.blocks.NetherGenerator;
import com.rafacost3d.usrg.blocks.ObsidianGenerator;
import com.rafacost3d.usrg.blocks.OreGenerator;
import com.rafacost3d.usrg.blocks.QuartzGenerator;
import com.rafacost3d.usrg.blocks.RedstoneGenerator;
import com.rafacost3d.usrg.blocks.SandGenerator;
import com.rafacost3d.usrg.blocks.SnowGenerator;
import com.rafacost3d.usrg.blocks.SoulGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    private ModBlocks(){}
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, USRG.MODID);

    public static final RegistryObject<BaseGenerator> CLAY_GEN_T1 = BLOCKS.register("clay_gen_tier_1", () -> new ClayGenerator(1));
    public static final RegistryObject<BaseGenerator> CLAY_GEN_T2 = BLOCKS.register("clay_gen_tier_2", () -> new ClayGenerator(2));
    public static final RegistryObject<BaseGenerator> CLAY_GEN_T3 = BLOCKS.register("clay_gen_tier_3", () -> new ClayGenerator(3));
    public static final RegistryObject<BaseGenerator> CLAY_GEN_T4 = BLOCKS.register("clay_gen_tier_4", () -> new ClayGenerator(4));
    public static final RegistryObject<BaseGenerator> CLAY_GEN_T5 = BLOCKS.register("clay_gen_tier_5", () -> new ClayGenerator(5));
    public static final RegistryObject<BaseGenerator> COBBLE_GEN_T1 = BLOCKS.register("cobble_gen_tier_1", () -> new CobblestoneGenerator(1));
    public static final RegistryObject<BaseGenerator> COBBLE_GEN_T2 = BLOCKS.register("cobble_gen_tier_2", () -> new CobblestoneGenerator(2));
    public static final RegistryObject<BaseGenerator> COBBLE_GEN_T3 = BLOCKS.register("cobble_gen_tier_3", () -> new CobblestoneGenerator(3));
    public static final RegistryObject<BaseGenerator> COBBLE_GEN_T4 = BLOCKS.register("cobble_gen_tier_4", () -> new CobblestoneGenerator(4));
    public static final RegistryObject<BaseGenerator> COBBLE_GEN_T5 = BLOCKS.register("cobble_gen_tier_5", () -> new CobblestoneGenerator(5));
    public static final RegistryObject<BaseGenerator> CLEAN_GEN_T1 = BLOCKS.register("clean_gen_tier_1", () -> new CleanGenerator(1));
    public static final RegistryObject<BaseGenerator> CLEAN_GEN_T2 = BLOCKS.register("clean_gen_tier_2", () -> new CleanGenerator(2));
    public static final RegistryObject<BaseGenerator> CLEAN_GEN_T3 = BLOCKS.register("clean_gen_tier_3", () -> new CleanGenerator(3));
    public static final RegistryObject<BaseGenerator> CLEAN_GEN_T4 = BLOCKS.register("clean_gen_tier_4", () -> new CleanGenerator(4));
    public static final RegistryObject<BaseGenerator> CLEAN_GEN_T5 = BLOCKS.register("clean_gen_tier_5", () -> new CleanGenerator(5));
    public static final RegistryObject<BaseGenerator> DIRT_GEN_T1 = BLOCKS.register("dirt_gen_tier_1", () -> new DirtGenerator(1));
    public static final RegistryObject<BaseGenerator> DIRT_GEN_T2 = BLOCKS.register("dirt_gen_tier_2", () -> new DirtGenerator(2));
    public static final RegistryObject<BaseGenerator> DIRT_GEN_T3 = BLOCKS.register("dirt_gen_tier_3", () -> new DirtGenerator(3));
    public static final RegistryObject<BaseGenerator> DIRT_GEN_T4 = BLOCKS.register("dirt_gen_tier_4", () -> new DirtGenerator(4));
    public static final RegistryObject<BaseGenerator> DIRT_GEN_T5 = BLOCKS.register("dirt_gen_tier_5", () -> new DirtGenerator(5));
    public static final RegistryObject<BaseGenerator> END_GEN_T1 = BLOCKS.register("end_gen_tier_1", () -> new EndstoneGenerator(1));
    public static final RegistryObject<BaseGenerator> END_GEN_T2 = BLOCKS.register("end_gen_tier_2", () -> new EndstoneGenerator(2));
    public static final RegistryObject<BaseGenerator> END_GEN_T3 = BLOCKS.register("end_gen_tier_3", () -> new EndstoneGenerator(3));
    public static final RegistryObject<BaseGenerator> END_GEN_T4 = BLOCKS.register("end_gen_tier_4", () -> new EndstoneGenerator(4));
    public static final RegistryObject<BaseGenerator> END_GEN_T5 = BLOCKS.register("end_gen_tier_5", () -> new EndstoneGenerator(5));
    public static final RegistryObject<BaseGenerator> FUNGUS_GEN_T1 = BLOCKS.register("fungus_gen_tier_1", () -> new FungusGenerator(1));
    public static final RegistryObject<BaseGenerator> FUNGUS_GEN_T2 = BLOCKS.register("fungus_gen_tier_2", () -> new FungusGenerator(2));
    public static final RegistryObject<BaseGenerator> FUNGUS_GEN_T3 = BLOCKS.register("fungus_gen_tier_3", () -> new FungusGenerator(3));
    public static final RegistryObject<BaseGenerator> FUNGUS_GEN_T4 = BLOCKS.register("fungus_gen_tier_4", () -> new FungusGenerator(4));
    public static final RegistryObject<BaseGenerator> FUNGUS_GEN_T5 = BLOCKS.register("fungus_gen_tier_5", () -> new FungusGenerator(5));
    public static final RegistryObject<BaseGenerator> GLOWSTONE_GEN_T1 = BLOCKS.register("glowstone_gen_tier_1", () -> new GlowstoneGenerator(1));
    public static final RegistryObject<BaseGenerator> GLOWSTONE_GEN_T2 = BLOCKS.register("glowstone_gen_tier_2", () -> new GlowstoneGenerator(2));
    public static final RegistryObject<BaseGenerator> GLOWSTONE_GEN_T3 = BLOCKS.register("glowstone_gen_tier_3", () -> new GlowstoneGenerator(3));
    public static final RegistryObject<BaseGenerator> GLOWSTONE_GEN_T4 = BLOCKS.register("glowstone_gen_tier_4", () -> new GlowstoneGenerator(4));
    public static final RegistryObject<BaseGenerator> GLOWSTONE_GEN_T5 = BLOCKS.register("glowstone_gen_tier_5", () -> new GlowstoneGenerator(5));
    public static final RegistryObject<BaseGenerator> GRASS_GEN_T1 = BLOCKS.register("grass_gen_tier_1", () -> new GrassGenerator(1));
    public static final RegistryObject<BaseGenerator> GRASS_GEN_T2 = BLOCKS.register("grass_gen_tier_2", () -> new GrassGenerator(2));
    public static final RegistryObject<BaseGenerator> GRASS_GEN_T3 = BLOCKS.register("grass_gen_tier_3", () -> new GrassGenerator(3));
    public static final RegistryObject<BaseGenerator> GRASS_GEN_T4 = BLOCKS.register("grass_gen_tier_4", () -> new GrassGenerator(4));
    public static final RegistryObject<BaseGenerator> GRASS_GEN_T5 = BLOCKS.register("grass_gen_tier_5", () -> new GrassGenerator(5));
    public static final RegistryObject<BaseGenerator> GRAVEL_GEN_T1 = BLOCKS.register("gravel_gen_tier_1", () -> new GravelGenerator(1));
    public static final RegistryObject<BaseGenerator> GRAVEL_GEN_T2 = BLOCKS.register("gravel_gen_tier_2", () -> new GravelGenerator(2));
    public static final RegistryObject<BaseGenerator> GRAVEL_GEN_T3 = BLOCKS.register("gravel_gen_tier_3", () -> new GravelGenerator(3));
    public static final RegistryObject<BaseGenerator> GRAVEL_GEN_T4 = BLOCKS.register("gravel_gen_tier_4", () -> new GravelGenerator(4));
    public static final RegistryObject<BaseGenerator> GRAVEL_GEN_T5 = BLOCKS.register("gravel_gen_tier_5", () -> new GravelGenerator(5));
    public static final RegistryObject<BaseGenerator> ICE_GEN_T1 = BLOCKS.register("ice_gen_tier_1", () -> new IceGenerator(1));
    public static final RegistryObject<BaseGenerator> ICE_GEN_T2 = BLOCKS.register("ice_gen_tier_2", () -> new IceGenerator(2));
    public static final RegistryObject<BaseGenerator> ICE_GEN_T3 = BLOCKS.register("ice_gen_tier_3", () -> new IceGenerator(3));
    public static final RegistryObject<BaseGenerator> ICE_GEN_T4 = BLOCKS.register("ice_gen_tier_4", () -> new IceGenerator(4));
    public static final RegistryObject<BaseGenerator> ICE_GEN_T5 = BLOCKS.register("ice_gen_tier_5", () -> new IceGenerator(5));
    public static final RegistryObject<BaseGenerator> NETHERRACK_GEN_T1 = BLOCKS.register("netherrack_gen_tier_1", () -> new NetherGenerator(1));
    public static final RegistryObject<BaseGenerator> NETHERRACK_GEN_T2 = BLOCKS.register("netherrack_gen_tier_2", () -> new NetherGenerator(2));
    public static final RegistryObject<BaseGenerator> NETHERRACK_GEN_T3 = BLOCKS.register("netherrack_gen_tier_3", () -> new NetherGenerator(3));
    public static final RegistryObject<BaseGenerator> NETHERRACK_GEN_T4 = BLOCKS.register("netherrack_gen_tier_4", () -> new NetherGenerator(4));
    public static final RegistryObject<BaseGenerator> NETHERRACK_GEN_T5 = BLOCKS.register("netherrack_gen_tier_5", () -> new NetherGenerator(5));
    public static final RegistryObject<BaseGenerator> OBSIDIAN_GEN_T1 = BLOCKS.register("obsidian_gen_tier_1", () -> new ObsidianGenerator(1));
    public static final RegistryObject<BaseGenerator> OBSIDIAN_GEN_T2 = BLOCKS.register("obsidian_gen_tier_2", () -> new ObsidianGenerator(2));
    public static final RegistryObject<BaseGenerator> OBSIDIAN_GEN_T3 = BLOCKS.register("obsidian_gen_tier_3", () -> new ObsidianGenerator(3));
    public static final RegistryObject<BaseGenerator> OBSIDIAN_GEN_T4 = BLOCKS.register("obsidian_gen_tier_4", () -> new ObsidianGenerator(4));
    public static final RegistryObject<BaseGenerator> OBSIDIAN_GEN_T5 = BLOCKS.register("obsidian_gen_tier_5", () -> new ObsidianGenerator(5));
    public static final RegistryObject<BaseGenerator> QUARTZ_GEN_T1 = BLOCKS.register("quartz_gen_tier_1", () -> new QuartzGenerator(1));
    public static final RegistryObject<BaseGenerator> QUARTZ_GEN_T2 = BLOCKS.register("quartz_gen_tier_2", () -> new QuartzGenerator(2));
    public static final RegistryObject<BaseGenerator> QUARTZ_GEN_T3 = BLOCKS.register("quartz_gen_tier_3", () -> new QuartzGenerator(3));
    public static final RegistryObject<BaseGenerator> QUARTZ_GEN_T4 = BLOCKS.register("quartz_gen_tier_4", () -> new QuartzGenerator(4));
    public static final RegistryObject<BaseGenerator> QUARTZ_GEN_T5 = BLOCKS.register("quartz_gen_tier_5", () -> new QuartzGenerator(5));
    public static final RegistryObject<BaseGenerator> REDSTONE_GEN_T1 = BLOCKS.register("redstone_gen_tier_1", () -> new RedstoneGenerator(1));
    public static final RegistryObject<BaseGenerator> REDSTONE_GEN_T2 = BLOCKS.register("redstone_gen_tier_2", () -> new RedstoneGenerator(2));
    public static final RegistryObject<BaseGenerator> REDSTONE_GEN_T3 = BLOCKS.register("redstone_gen_tier_3", () -> new RedstoneGenerator(3));
    public static final RegistryObject<BaseGenerator> REDSTONE_GEN_T4 = BLOCKS.register("redstone_gen_tier_4", () -> new RedstoneGenerator(4));
    public static final RegistryObject<BaseGenerator> REDSTONE_GEN_T5 = BLOCKS.register("redstone_gen_tier_5", () -> new RedstoneGenerator(5));
    public static final RegistryObject<BaseGenerator> SAND_GEN_T1 = BLOCKS.register("sand_gen_tier_1", () -> new SandGenerator(1));
    public static final RegistryObject<BaseGenerator> SAND_GEN_T2 = BLOCKS.register("sand_gen_tier_2", () -> new SandGenerator(2));
    public static final RegistryObject<BaseGenerator> SAND_GEN_T3 = BLOCKS.register("sand_gen_tier_3", () -> new SandGenerator(3));
    public static final RegistryObject<BaseGenerator> SAND_GEN_T4 = BLOCKS.register("sand_gen_tier_4", () -> new SandGenerator(4));
    public static final RegistryObject<BaseGenerator> SAND_GEN_T5 = BLOCKS.register("sand_gen_tier_5", () -> new SandGenerator(5));
    public static final RegistryObject<BaseGenerator> SNOW_GEN_T1 = BLOCKS.register("snow_gen_tier_1", () -> new SnowGenerator(1));
    public static final RegistryObject<BaseGenerator> SNOW_GEN_T2 = BLOCKS.register("snow_gen_tier_2", () -> new SnowGenerator(2));
    public static final RegistryObject<BaseGenerator> SNOW_GEN_T3 = BLOCKS.register("snow_gen_tier_3", () -> new SnowGenerator(3));
    public static final RegistryObject<BaseGenerator> SNOW_GEN_T4 = BLOCKS.register("snow_gen_tier_4", () -> new SnowGenerator(4));
    public static final RegistryObject<BaseGenerator> SNOW_GEN_T5 = BLOCKS.register("snow_gen_tier_5", () -> new SnowGenerator(5));
    public static final RegistryObject<BaseGenerator> SOULSAND_GEN_T1 = BLOCKS.register("soulsand_gen_tier_1", () -> new SoulGenerator(1));
    public static final RegistryObject<BaseGenerator> SOULSAND_GEN_T2 = BLOCKS.register("soulsand_gen_tier_2", () -> new SoulGenerator(2));
    public static final RegistryObject<BaseGenerator> SOULSAND_GEN_T3 = BLOCKS.register("soulsand_gen_tier_3", () -> new SoulGenerator(3));
    public static final RegistryObject<BaseGenerator> SOULSAND_GEN_T4 = BLOCKS.register("soulsand_gen_tier_4", () -> new SoulGenerator(4));
    public static final RegistryObject<BaseGenerator> SOULSAND_GEN_T5 = BLOCKS.register("soulsand_gen_tier_5", () -> new SoulGenerator(5));
    public static final RegistryObject<BaseGenerator> DYE_GEN_T1 = BLOCKS.register("dye_gen_tier_1", () -> new DyeGenerator(1));
    public static final RegistryObject<BaseGenerator> DYE_GEN_T2 = BLOCKS.register("dye_gen_tier_2", () -> new DyeGenerator(2));
    public static final RegistryObject<BaseGenerator> DYE_GEN_T3 = BLOCKS.register("dye_gen_tier_3", () -> new DyeGenerator(3));
    public static final RegistryObject<BaseGenerator> DYE_GEN_T4 = BLOCKS.register("dye_gen_tier_4", () -> new DyeGenerator(4));
    public static final RegistryObject<BaseGenerator> DYE_GEN_T5 = BLOCKS.register("dye_gen_tier_5", () -> new DyeGenerator(5));
    public static final RegistryObject<BaseGenerator> ORE_GEN_T1 = BLOCKS.register("ore_gen_tier_1", () -> new OreGenerator(1));
    public static final RegistryObject<BaseGenerator> ORE_GEN_T2 = BLOCKS.register("ore_gen_tier_2", () -> new OreGenerator(2));
    public static final RegistryObject<BaseGenerator> ORE_GEN_T3 = BLOCKS.register("ore_gen_tier_3", () -> new OreGenerator(3));
    public static final RegistryObject<BaseGenerator> ORE_GEN_T4 = BLOCKS.register("ore_gen_tier_4", () -> new OreGenerator(4));
    public static final RegistryObject<BaseGenerator> ORE_GEN_T5 = BLOCKS.register("ore_gen_tier_5", () -> new OreGenerator(5));

    public static class EXNModBlocks {
        private EXNModBlocks(){}
        public static final RegistryObject<BaseGenerator> DUST_GEN_T1 = BLOCKS.register("dust_gen_tier_1", () -> new DustGenerator(1));
        public static final RegistryObject<BaseGenerator> DUST_GEN_T2 = BLOCKS.register("dust_gen_tier_2", () -> new DustGenerator(2));
        public static final RegistryObject<BaseGenerator> DUST_GEN_T3 = BLOCKS.register("dust_gen_tier_3", () -> new DustGenerator(3));
        public static final RegistryObject<BaseGenerator> DUST_GEN_T4 = BLOCKS.register("dust_gen_tier_4", () -> new DustGenerator(4));
        public static final RegistryObject<BaseGenerator> DUST_GEN_T5 = BLOCKS.register("dust_gen_tier_5", () -> new DustGenerator(5));
        public static final RegistryObject<BaseGenerator> CRUSHED_ENDSTONE_GEN_T1 = BLOCKS.register("crushed_endstone_gen_tier_1", () -> new CrushedEndstoneGenerator(1));
        public static final RegistryObject<BaseGenerator> CRUSHED_ENDSTONE_GEN_T2 = BLOCKS.register("crushed_endstone_gen_tier_2", () -> new CrushedEndstoneGenerator(2));
        public static final RegistryObject<BaseGenerator> CRUSHED_ENDSTONE_GEN_T3 = BLOCKS.register("crushed_endstone_gen_tier_3", () -> new CrushedEndstoneGenerator(3));
        public static final RegistryObject<BaseGenerator> CRUSHED_ENDSTONE_GEN_T4 = BLOCKS.register("crushed_endstone_gen_tier_4", () -> new CrushedEndstoneGenerator(4));
        public static final RegistryObject<BaseGenerator> CRUSHED_ENDSTONE_GEN_T5 = BLOCKS.register("crushed_endstone_gen_tier_5", () -> new CrushedEndstoneGenerator(5));
        public static final RegistryObject<BaseGenerator> CRUSHED_NETHERRACK_GEN_T1 = BLOCKS.register("crushed_netherrack_gen_tier_1", () -> new CrushedNetherGenerator(1));
        public static final RegistryObject<BaseGenerator> CRUSHED_NETHERRACK_GEN_T2 = BLOCKS.register("crushed_netherrack_gen_tier_2", () -> new CrushedNetherGenerator(2));
        public static final RegistryObject<BaseGenerator> CRUSHED_NETHERRACK_GEN_T3 = BLOCKS.register("crushed_netherrack_gen_tier_3", () -> new CrushedNetherGenerator(3));
        public static final RegistryObject<BaseGenerator> CRUSHED_NETHERRACK_GEN_T4 = BLOCKS.register("crushed_netherrack_gen_tier_4", () -> new CrushedNetherGenerator(4));
        public static final RegistryObject<BaseGenerator> CRUSHED_NETHERRACK_GEN_T5 = BLOCKS.register("crushed_netherrack_gen_tier_5", () -> new CrushedNetherGenerator(5));

        public static void init(IEventBus modBusEvent) {
            BLOCKS.register(modBusEvent);
        }
    }

    public static void init(IEventBus modBusEvent) {
        BLOCKS.register(modBusEvent);
        if (ModList.get().isLoaded("exnihilosequentia")) {
            EXNModBlocks.init(modBusEvent);
        }
    }
}
