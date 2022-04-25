package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.USRG;
import com.rafacost3d.usrg.blockentities.ClayGeneratorTile;
import com.rafacost3d.usrg.blockentities.CleanGeneratorTile;
import com.rafacost3d.usrg.blockentities.CobblestoneGeneratorTile;
import com.rafacost3d.usrg.blockentities.CrushedEndstoneGeneratorTile;
import com.rafacost3d.usrg.blockentities.CrushedNetherrackGeneratorTile;
import com.rafacost3d.usrg.blockentities.DirtGeneratorTile;
import com.rafacost3d.usrg.blockentities.DustGeneratorTile;
import com.rafacost3d.usrg.blockentities.DyeGeneratorTile;
import com.rafacost3d.usrg.blockentities.EndstoneGeneratorTile;
import com.rafacost3d.usrg.blockentities.FungusGeneratorTile;
import com.rafacost3d.usrg.blockentities.GlowstoneGeneratorTile;
import com.rafacost3d.usrg.blockentities.GrassGeneratorTile;
import com.rafacost3d.usrg.blockentities.GravelGeneratorTile;
import com.rafacost3d.usrg.blockentities.IceGeneratorTile;
import com.rafacost3d.usrg.blockentities.NetherrackGeneratorTile;
import com.rafacost3d.usrg.blockentities.ObsidianGeneratorTile;
import com.rafacost3d.usrg.blockentities.OreGeneratorTile;
import com.rafacost3d.usrg.blockentities.QuartzGeneratorTile;
import com.rafacost3d.usrg.blockentities.RedstoneGeneratorTile;
import com.rafacost3d.usrg.blockentities.SandGeneratorTile;
import com.rafacost3d.usrg.blockentities.SnowGeneratorTile;
import com.rafacost3d.usrg.blockentities.SoulsandGeneratorTile;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBE {
    public static DeferredRegister<BlockEntityType<?>> BE = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, USRG.MODID);

    public static RegistryObject<BlockEntityType<ClayGeneratorTile>> CLAY_T1_BE = BE.register("clay_be_t1", () -> BlockEntityType.Builder.of(ClayGeneratorTile.makeSupplier(1), ModBlocks.CLAY_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<ClayGeneratorTile>> CLAY_T2_BE = BE.register("clay_be_t2", () -> BlockEntityType.Builder.of(ClayGeneratorTile.makeSupplier(2), ModBlocks.CLAY_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<ClayGeneratorTile>> CLAY_T3_BE = BE.register("clay_be_t3", () -> BlockEntityType.Builder.of(ClayGeneratorTile.makeSupplier(3), ModBlocks.CLAY_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<ClayGeneratorTile>> CLAY_T4_BE = BE.register("clay_be_t4", () -> BlockEntityType.Builder.of(ClayGeneratorTile.makeSupplier(4), ModBlocks.CLAY_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<ClayGeneratorTile>> CLAY_T5_BE = BE.register("clay_be_t5", () -> BlockEntityType.Builder.of(ClayGeneratorTile.makeSupplier(5), ModBlocks.CLAY_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<CobblestoneGeneratorTile>> COBBLE_T1_BE = BE.register("cobble_be_t1", () -> BlockEntityType.Builder.of(CobblestoneGeneratorTile.makeSupplier(1), ModBlocks.COBBLE_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<CobblestoneGeneratorTile>> COBBLE_T2_BE = BE.register("cobble_be_t2", () -> BlockEntityType.Builder.of(CobblestoneGeneratorTile.makeSupplier(2), ModBlocks.COBBLE_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<CobblestoneGeneratorTile>> COBBLE_T3_BE = BE.register("cobble_be_t3", () -> BlockEntityType.Builder.of(CobblestoneGeneratorTile.makeSupplier(3), ModBlocks.COBBLE_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<CobblestoneGeneratorTile>> COBBLE_T4_BE = BE.register("cobble_be_t4", () -> BlockEntityType.Builder.of(CobblestoneGeneratorTile.makeSupplier(4), ModBlocks.COBBLE_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<CobblestoneGeneratorTile>> COBBLE_T5_BE = BE.register("cobble_be_t5", () -> BlockEntityType.Builder.of(CobblestoneGeneratorTile.makeSupplier(5), ModBlocks.COBBLE_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<CleanGeneratorTile>> CLEAN_T1_BE = BE.register("clean_be_t1", () -> BlockEntityType.Builder.of(CleanGeneratorTile.makeSupplier(1), ModBlocks.CLEAN_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<CleanGeneratorTile>> CLEAN_T2_BE = BE.register("clean_be_t2", () -> BlockEntityType.Builder.of(CleanGeneratorTile.makeSupplier(2), ModBlocks.CLEAN_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<CleanGeneratorTile>> CLEAN_T3_BE = BE.register("clean_be_t3", () -> BlockEntityType.Builder.of(CleanGeneratorTile.makeSupplier(3), ModBlocks.CLEAN_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<CleanGeneratorTile>> CLEAN_T4_BE = BE.register("clean_be_t4", () -> BlockEntityType.Builder.of(CleanGeneratorTile.makeSupplier(4), ModBlocks.CLEAN_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<CleanGeneratorTile>> CLEAN_T5_BE = BE.register("clean_be_t5", () -> BlockEntityType.Builder.of(CleanGeneratorTile.makeSupplier(5), ModBlocks.CLEAN_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<DirtGeneratorTile>> DIRT_T1_BE = BE.register("dirt_be_t1", () -> BlockEntityType.Builder.of(DirtGeneratorTile.makeSupplier(1), ModBlocks.DIRT_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<DirtGeneratorTile>> DIRT_T2_BE = BE.register("dirt_be_t2", () -> BlockEntityType.Builder.of(DirtGeneratorTile.makeSupplier(2), ModBlocks.DIRT_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<DirtGeneratorTile>> DIRT_T3_BE = BE.register("dirt_be_t3", () -> BlockEntityType.Builder.of(DirtGeneratorTile.makeSupplier(3), ModBlocks.DIRT_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<DirtGeneratorTile>> DIRT_T4_BE = BE.register("dirt_be_t4", () -> BlockEntityType.Builder.of(DirtGeneratorTile.makeSupplier(4), ModBlocks.DIRT_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<DirtGeneratorTile>> DIRT_T5_BE = BE.register("dirt_be_t5", () -> BlockEntityType.Builder.of(DirtGeneratorTile.makeSupplier(5), ModBlocks.DIRT_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<EndstoneGeneratorTile>> ENDSTONE_T1_BE = BE.register("endstone_be_t1", () -> BlockEntityType.Builder.of(EndstoneGeneratorTile.makeSupplier(1), ModBlocks.END_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<EndstoneGeneratorTile>> ENDSTONE_T2_BE = BE.register("endstone_be_t2", () -> BlockEntityType.Builder.of(EndstoneGeneratorTile.makeSupplier(2), ModBlocks.END_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<EndstoneGeneratorTile>> ENDSTONE_T3_BE = BE.register("endstone_be_t3", () -> BlockEntityType.Builder.of(EndstoneGeneratorTile.makeSupplier(3), ModBlocks.END_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<EndstoneGeneratorTile>> ENDSTONE_T4_BE = BE.register("endstone_be_t4", () -> BlockEntityType.Builder.of(EndstoneGeneratorTile.makeSupplier(4), ModBlocks.END_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<EndstoneGeneratorTile>> ENDSTONE_T5_BE = BE.register("endstone_be_t5", () -> BlockEntityType.Builder.of(EndstoneGeneratorTile.makeSupplier(5), ModBlocks.END_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<FungusGeneratorTile>> FUNGUS_T1_BE = BE.register("fungus_be_t1", () -> BlockEntityType.Builder.of(FungusGeneratorTile.makeSupplier(1), ModBlocks.FUNGUS_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<FungusGeneratorTile>> FUNGUS_T2_BE = BE.register("fungus_be_t2", () -> BlockEntityType.Builder.of(FungusGeneratorTile.makeSupplier(2), ModBlocks.FUNGUS_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<FungusGeneratorTile>> FUNGUS_T3_BE = BE.register("fungus_be_t3", () -> BlockEntityType.Builder.of(FungusGeneratorTile.makeSupplier(3), ModBlocks.FUNGUS_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<FungusGeneratorTile>> FUNGUS_T4_BE = BE.register("fungus_be_t4", () -> BlockEntityType.Builder.of(FungusGeneratorTile.makeSupplier(4), ModBlocks.FUNGUS_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<FungusGeneratorTile>> FUNGUS_T5_BE = BE.register("fungus_be_t5", () -> BlockEntityType.Builder.of(FungusGeneratorTile.makeSupplier(5), ModBlocks.FUNGUS_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<GlowstoneGeneratorTile>> GLOWSTONE_T1_BE = BE.register("glowstone_be_t1", () -> BlockEntityType.Builder.of(GlowstoneGeneratorTile.makeSupplier(1), ModBlocks.GLOWSTONE_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<GlowstoneGeneratorTile>> GLOWSTONE_T2_BE = BE.register("glowstone_be_t2", () -> BlockEntityType.Builder.of(GlowstoneGeneratorTile.makeSupplier(2), ModBlocks.GLOWSTONE_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<GlowstoneGeneratorTile>> GLOWSTONE_T3_BE = BE.register("glowstone_be_t3", () -> BlockEntityType.Builder.of(GlowstoneGeneratorTile.makeSupplier(3), ModBlocks.GLOWSTONE_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<GlowstoneGeneratorTile>> GLOWSTONE_T4_BE = BE.register("glowstone_be_t4", () -> BlockEntityType.Builder.of(GlowstoneGeneratorTile.makeSupplier(4), ModBlocks.GLOWSTONE_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<GlowstoneGeneratorTile>> GLOWSTONE_T5_BE = BE.register("glowstone_be_t5", () -> BlockEntityType.Builder.of(GlowstoneGeneratorTile.makeSupplier(5), ModBlocks.GLOWSTONE_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<GrassGeneratorTile>> GRASS_T1_BE = BE.register("grass_be_t1", () -> BlockEntityType.Builder.of(GrassGeneratorTile.makeSupplier(1), ModBlocks.GRASS_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<GrassGeneratorTile>> GRASS_T2_BE = BE.register("grass_be_t2", () -> BlockEntityType.Builder.of(GrassGeneratorTile.makeSupplier(2), ModBlocks.GRASS_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<GrassGeneratorTile>> GRASS_T3_BE = BE.register("grass_be_t3", () -> BlockEntityType.Builder.of(GrassGeneratorTile.makeSupplier(3), ModBlocks.GRASS_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<GrassGeneratorTile>> GRASS_T4_BE = BE.register("grass_be_t4", () -> BlockEntityType.Builder.of(GrassGeneratorTile.makeSupplier(4), ModBlocks.GRASS_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<GrassGeneratorTile>> GRASS_T5_BE = BE.register("grass_be_t5", () -> BlockEntityType.Builder.of(GrassGeneratorTile.makeSupplier(5), ModBlocks.GRASS_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<GravelGeneratorTile>> GRAVEL_T1_BE = BE.register("gravel_be_t1", () -> BlockEntityType.Builder.of(GravelGeneratorTile.makeSupplier(1), ModBlocks.GRAVEL_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<GravelGeneratorTile>> GRAVEL_T2_BE = BE.register("gravel_be_t2", () -> BlockEntityType.Builder.of(GravelGeneratorTile.makeSupplier(2), ModBlocks.GRAVEL_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<GravelGeneratorTile>> GRAVEL_T3_BE = BE.register("gravel_be_t3", () -> BlockEntityType.Builder.of(GravelGeneratorTile.makeSupplier(3), ModBlocks.GRAVEL_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<GravelGeneratorTile>> GRAVEL_T4_BE = BE.register("gravel_be_t4", () -> BlockEntityType.Builder.of(GravelGeneratorTile.makeSupplier(4), ModBlocks.GRAVEL_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<GravelGeneratorTile>> GRAVEL_T5_BE = BE.register("gravel_be_t5", () -> BlockEntityType.Builder.of(GravelGeneratorTile.makeSupplier(5), ModBlocks.GRAVEL_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<IceGeneratorTile>> ICE_T1_BE = BE.register("ice_be_t1", () -> BlockEntityType.Builder.of(IceGeneratorTile.makeSupplier(1), ModBlocks.ICE_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<IceGeneratorTile>> ICE_T2_BE = BE.register("ice_be_t2", () -> BlockEntityType.Builder.of(IceGeneratorTile.makeSupplier(2), ModBlocks.ICE_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<IceGeneratorTile>> ICE_T3_BE = BE.register("ice_be_t3", () -> BlockEntityType.Builder.of(IceGeneratorTile.makeSupplier(3), ModBlocks.ICE_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<IceGeneratorTile>> ICE_T4_BE = BE.register("ice_be_t4", () -> BlockEntityType.Builder.of(IceGeneratorTile.makeSupplier(4), ModBlocks.ICE_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<IceGeneratorTile>> ICE_T5_BE = BE.register("ice_be_t5", () -> BlockEntityType.Builder.of(IceGeneratorTile.makeSupplier(5), ModBlocks.ICE_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<NetherrackGeneratorTile>> NETHERRACK_T1_BE = BE.register("netherrack_be_t1", () -> BlockEntityType.Builder.of(NetherrackGeneratorTile.makeSupplier(1), ModBlocks.NETHERRACK_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<NetherrackGeneratorTile>> NETHERRACK_T2_BE = BE.register("netherrack_be_t2", () -> BlockEntityType.Builder.of(NetherrackGeneratorTile.makeSupplier(2), ModBlocks.NETHERRACK_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<NetherrackGeneratorTile>> NETHERRACK_T3_BE = BE.register("netherrack_be_t3", () -> BlockEntityType.Builder.of(NetherrackGeneratorTile.makeSupplier(3), ModBlocks.NETHERRACK_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<NetherrackGeneratorTile>> NETHERRACK_T4_BE = BE.register("netherrack_be_t4", () -> BlockEntityType.Builder.of(NetherrackGeneratorTile.makeSupplier(4), ModBlocks.NETHERRACK_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<NetherrackGeneratorTile>> NETHERRACK_T5_BE = BE.register("netherrack_be_t5", () -> BlockEntityType.Builder.of(NetherrackGeneratorTile.makeSupplier(5), ModBlocks.NETHERRACK_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<ObsidianGeneratorTile>> OBSIDIAN_T1_BE = BE.register("obsidian_be_t1", () -> BlockEntityType.Builder.of(ObsidianGeneratorTile.makeSupplier(1), ModBlocks.OBSIDIAN_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<ObsidianGeneratorTile>> OBSIDIAN_T2_BE = BE.register("obsidian_be_t2", () -> BlockEntityType.Builder.of(ObsidianGeneratorTile.makeSupplier(2), ModBlocks.OBSIDIAN_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<ObsidianGeneratorTile>> OBSIDIAN_T3_BE = BE.register("obsidian_be_t3", () -> BlockEntityType.Builder.of(ObsidianGeneratorTile.makeSupplier(3), ModBlocks.OBSIDIAN_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<ObsidianGeneratorTile>> OBSIDIAN_T4_BE = BE.register("obsidian_be_t4", () -> BlockEntityType.Builder.of(ObsidianGeneratorTile.makeSupplier(4), ModBlocks.OBSIDIAN_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<ObsidianGeneratorTile>> OBSIDIAN_T5_BE = BE.register("obsidian_be_t5", () -> BlockEntityType.Builder.of(ObsidianGeneratorTile.makeSupplier(5), ModBlocks.OBSIDIAN_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<QuartzGeneratorTile>> QUARTZ_T1_BE = BE.register("quartz_be_t1", () -> BlockEntityType.Builder.of(QuartzGeneratorTile.makeSupplier(1), ModBlocks.QUARTZ_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<QuartzGeneratorTile>> QUARTZ_T2_BE = BE.register("quartz_be_t2", () -> BlockEntityType.Builder.of(QuartzGeneratorTile.makeSupplier(2), ModBlocks.QUARTZ_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<QuartzGeneratorTile>> QUARTZ_T3_BE = BE.register("quartz_be_t3", () -> BlockEntityType.Builder.of(QuartzGeneratorTile.makeSupplier(3), ModBlocks.QUARTZ_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<QuartzGeneratorTile>> QUARTZ_T4_BE = BE.register("quartz_be_t4", () -> BlockEntityType.Builder.of(QuartzGeneratorTile.makeSupplier(4), ModBlocks.QUARTZ_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<QuartzGeneratorTile>> QUARTZ_T5_BE = BE.register("quartz_be_t5", () -> BlockEntityType.Builder.of(QuartzGeneratorTile.makeSupplier(5), ModBlocks.QUARTZ_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<RedstoneGeneratorTile>> REDSTONE_T1_BE = BE.register("redstone_be_t1", () -> BlockEntityType.Builder.of(RedstoneGeneratorTile.makeSupplier(1), ModBlocks.REDSTONE_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<RedstoneGeneratorTile>> REDSTONE_T2_BE = BE.register("redstone_be_t2", () -> BlockEntityType.Builder.of(RedstoneGeneratorTile.makeSupplier(2), ModBlocks.REDSTONE_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<RedstoneGeneratorTile>> REDSTONE_T3_BE = BE.register("redstone_be_t3", () -> BlockEntityType.Builder.of(RedstoneGeneratorTile.makeSupplier(3), ModBlocks.REDSTONE_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<RedstoneGeneratorTile>> REDSTONE_T4_BE = BE.register("redstone_be_t4", () -> BlockEntityType.Builder.of(RedstoneGeneratorTile.makeSupplier(4), ModBlocks.REDSTONE_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<RedstoneGeneratorTile>> REDSTONE_T5_BE = BE.register("redstone_be_t5", () -> BlockEntityType.Builder.of(RedstoneGeneratorTile.makeSupplier(5), ModBlocks.REDSTONE_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<SandGeneratorTile>> SAND_T1_BE = BE.register("sand_be_t1", () -> BlockEntityType.Builder.of(SandGeneratorTile.makeSupplier(1), ModBlocks.SAND_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<SandGeneratorTile>> SAND_T2_BE = BE.register("sand_be_t2", () -> BlockEntityType.Builder.of(SandGeneratorTile.makeSupplier(2), ModBlocks.SAND_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<SandGeneratorTile>> SAND_T3_BE = BE.register("sand_be_t3", () -> BlockEntityType.Builder.of(SandGeneratorTile.makeSupplier(3), ModBlocks.SAND_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<SandGeneratorTile>> SAND_T4_BE = BE.register("sand_be_t4", () -> BlockEntityType.Builder.of(SandGeneratorTile.makeSupplier(4), ModBlocks.SAND_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<SandGeneratorTile>> SAND_T5_BE = BE.register("sand_be_t5", () -> BlockEntityType.Builder.of(SandGeneratorTile.makeSupplier(5), ModBlocks.SAND_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<SnowGeneratorTile>> SNOW_T1_BE = BE.register("snow_be_t1", () -> BlockEntityType.Builder.of(SnowGeneratorTile.makeSupplier(1), ModBlocks.SNOW_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<SnowGeneratorTile>> SNOW_T2_BE = BE.register("snow_be_t2", () -> BlockEntityType.Builder.of(SnowGeneratorTile.makeSupplier(2), ModBlocks.SNOW_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<SnowGeneratorTile>> SNOW_T3_BE = BE.register("snow_be_t3", () -> BlockEntityType.Builder.of(SnowGeneratorTile.makeSupplier(3), ModBlocks.SNOW_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<SnowGeneratorTile>> SNOW_T4_BE = BE.register("snow_be_t4", () -> BlockEntityType.Builder.of(SnowGeneratorTile.makeSupplier(4), ModBlocks.SNOW_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<SnowGeneratorTile>> SNOW_T5_BE = BE.register("snow_be_t5", () -> BlockEntityType.Builder.of(SnowGeneratorTile.makeSupplier(5), ModBlocks.SNOW_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<SoulsandGeneratorTile>> SOULSAND_T1_BE = BE.register("soulsand_be_t1", () -> BlockEntityType.Builder.of(SoulsandGeneratorTile.makeSupplier(1), ModBlocks.SOULSAND_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<SoulsandGeneratorTile>> SOULSAND_T2_BE = BE.register("soulsand_be_t2", () -> BlockEntityType.Builder.of(SoulsandGeneratorTile.makeSupplier(2), ModBlocks.SOULSAND_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<SoulsandGeneratorTile>> SOULSAND_T3_BE = BE.register("soulsand_be_t3", () -> BlockEntityType.Builder.of(SoulsandGeneratorTile.makeSupplier(3), ModBlocks.SOULSAND_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<SoulsandGeneratorTile>> SOULSAND_T4_BE = BE.register("soulsand_be_t4", () -> BlockEntityType.Builder.of(SoulsandGeneratorTile.makeSupplier(4), ModBlocks.SOULSAND_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<SoulsandGeneratorTile>> SOULSAND_T5_BE = BE.register("soulsand_be_t5", () -> BlockEntityType.Builder.of(SoulsandGeneratorTile.makeSupplier(5), ModBlocks.SOULSAND_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<DyeGeneratorTile>> DYE_T1_BE = BE.register("dye_be_t1", () -> BlockEntityType.Builder.of(DyeGeneratorTile.makeSupplier(1), ModBlocks.DYE_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<DyeGeneratorTile>> DYE_T2_BE = BE.register("dye_be_t2", () -> BlockEntityType.Builder.of(DyeGeneratorTile.makeSupplier(2), ModBlocks.DYE_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<DyeGeneratorTile>> DYE_T3_BE = BE.register("dye_be_t3", () -> BlockEntityType.Builder.of(DyeGeneratorTile.makeSupplier(3), ModBlocks.DYE_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<DyeGeneratorTile>> DYE_T4_BE = BE.register("dye_be_t4", () -> BlockEntityType.Builder.of(DyeGeneratorTile.makeSupplier(4), ModBlocks.DYE_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<DyeGeneratorTile>> DYE_T5_BE = BE.register("dye_be_t5", () -> BlockEntityType.Builder.of(DyeGeneratorTile.makeSupplier(5), ModBlocks.DYE_GEN_T5.get()).build(null));
    public static RegistryObject<BlockEntityType<OreGeneratorTile>> ORE_T1_BE = BE.register("ore_be_t1", () -> BlockEntityType.Builder.of(OreGeneratorTile.makeSupplier(1), ModBlocks.ORE_GEN_T1.get()).build(null));
    public static RegistryObject<BlockEntityType<OreGeneratorTile>> ORE_T2_BE = BE.register("ore_be_t2", () -> BlockEntityType.Builder.of(OreGeneratorTile.makeSupplier(2), ModBlocks.ORE_GEN_T2.get()).build(null));
    public static RegistryObject<BlockEntityType<OreGeneratorTile>> ORE_T3_BE = BE.register("ore_be_t3", () -> BlockEntityType.Builder.of(OreGeneratorTile.makeSupplier(3), ModBlocks.ORE_GEN_T3.get()).build(null));
    public static RegistryObject<BlockEntityType<OreGeneratorTile>> ORE_T4_BE = BE.register("ore_be_t4", () -> BlockEntityType.Builder.of(OreGeneratorTile.makeSupplier(4), ModBlocks.ORE_GEN_T4.get()).build(null));
    public static RegistryObject<BlockEntityType<OreGeneratorTile>> ORE_T5_BE = BE.register("ore_be_t5", () -> BlockEntityType.Builder.of(OreGeneratorTile.makeSupplier(5), ModBlocks.ORE_GEN_T5.get()).build(null));

    public static class EXNModBE {
        public static RegistryObject<BlockEntityType<DustGeneratorTile>> DUST_T1_BE = BE.register("dust_be_t1", () -> BlockEntityType.Builder.of(DustGeneratorTile.makeSupplier(1), ModBlocks.EXNModBlocks.DUST_GEN_T1.get()).build(null));
        public static RegistryObject<BlockEntityType<DustGeneratorTile>> DUST_T2_BE = BE.register("dust_be_t2", () -> BlockEntityType.Builder.of(DustGeneratorTile.makeSupplier(2), ModBlocks.EXNModBlocks.DUST_GEN_T2.get()).build(null));
        public static RegistryObject<BlockEntityType<DustGeneratorTile>> DUST_T3_BE = BE.register("dust_be_t3", () -> BlockEntityType.Builder.of(DustGeneratorTile.makeSupplier(3), ModBlocks.EXNModBlocks.DUST_GEN_T3.get()).build(null));
        public static RegistryObject<BlockEntityType<DustGeneratorTile>> DUST_T4_BE = BE.register("dust_be_t4", () -> BlockEntityType.Builder.of(DustGeneratorTile.makeSupplier(4), ModBlocks.EXNModBlocks.DUST_GEN_T4.get()).build(null));
        public static RegistryObject<BlockEntityType<DustGeneratorTile>> DUST_T5_BE = BE.register("dust_be_t5", () -> BlockEntityType.Builder.of(DustGeneratorTile.makeSupplier(5), ModBlocks.EXNModBlocks.DUST_GEN_T5.get()).build(null));
        public static RegistryObject<BlockEntityType<CrushedEndstoneGeneratorTile>> CRUSHED_ENDSTONE_T1_BE = BE.register("crushed_endstone_be_t1", () -> BlockEntityType.Builder.of(CrushedEndstoneGeneratorTile.makeSupplier(1), ModBlocks.EXNModBlocks.CRUSHED_ENDSTONE_GEN_T1.get()).build(null));
        public static RegistryObject<BlockEntityType<CrushedEndstoneGeneratorTile>> CRUSHED_ENDSTONE_T2_BE = BE.register("crushed_endstone_be_t2", () -> BlockEntityType.Builder.of(CrushedEndstoneGeneratorTile.makeSupplier(2), ModBlocks.EXNModBlocks.CRUSHED_ENDSTONE_GEN_T2.get()).build(null));
        public static RegistryObject<BlockEntityType<CrushedEndstoneGeneratorTile>> CRUSHED_ENDSTONE_T3_BE = BE.register("crushed_endstone_be_t3", () -> BlockEntityType.Builder.of(CrushedEndstoneGeneratorTile.makeSupplier(3), ModBlocks.EXNModBlocks.CRUSHED_ENDSTONE_GEN_T3.get()).build(null));
        public static RegistryObject<BlockEntityType<CrushedEndstoneGeneratorTile>> CRUSHED_ENDSTONE_T4_BE = BE.register("crushed_endstone_be_t4", () -> BlockEntityType.Builder.of(CrushedEndstoneGeneratorTile.makeSupplier(4), ModBlocks.EXNModBlocks.CRUSHED_ENDSTONE_GEN_T4.get()).build(null));
        public static RegistryObject<BlockEntityType<CrushedEndstoneGeneratorTile>> CRUSHED_ENDSTONE_T5_BE = BE.register("crushed_endstone_be_t5", () -> BlockEntityType.Builder.of(CrushedEndstoneGeneratorTile.makeSupplier(5), ModBlocks.EXNModBlocks.CRUSHED_ENDSTONE_GEN_T5.get()).build(null));
        public static RegistryObject<BlockEntityType<CrushedNetherrackGeneratorTile>> CRUSHED_NETHERRACK_T1_BE = BE.register("crushed_netherrack_be_t1", () -> BlockEntityType.Builder.of(CrushedNetherrackGeneratorTile.makeSupplier(1), ModBlocks.EXNModBlocks.CRUSHED_NETHERRACK_GEN_T1.get()).build(null));
        public static RegistryObject<BlockEntityType<CrushedNetherrackGeneratorTile>> CRUSHED_NETHERRACK_T2_BE = BE.register("crushed_netherrack_be_t2", () -> BlockEntityType.Builder.of(CrushedNetherrackGeneratorTile.makeSupplier(2), ModBlocks.EXNModBlocks.CRUSHED_NETHERRACK_GEN_T2.get()).build(null));
        public static RegistryObject<BlockEntityType<CrushedNetherrackGeneratorTile>> CRUSHED_NETHERRACK_T3_BE = BE.register("crushed_netherrack_be_t3", () -> BlockEntityType.Builder.of(CrushedNetherrackGeneratorTile.makeSupplier(3), ModBlocks.EXNModBlocks.CRUSHED_NETHERRACK_GEN_T3.get()).build(null));
        public static RegistryObject<BlockEntityType<CrushedNetherrackGeneratorTile>> CRUSHED_NETHERRACK_T4_BE = BE.register("crushed_netherrack_be_t4", () -> BlockEntityType.Builder.of(CrushedNetherrackGeneratorTile.makeSupplier(4), ModBlocks.EXNModBlocks.CRUSHED_NETHERRACK_GEN_T4.get()).build(null));
        public static RegistryObject<BlockEntityType<CrushedNetherrackGeneratorTile>> CRUSHED_NETHERRACK_T5_BE = BE.register("crushed_netherrack_be_t5", () -> BlockEntityType.Builder.of(CrushedNetherrackGeneratorTile.makeSupplier(5), ModBlocks.EXNModBlocks.CRUSHED_NETHERRACK_GEN_T5.get()).build(null));
    }

    public static void init(IEventBus modBusEvent) {
        BE.register(modBusEvent);
    }
}
