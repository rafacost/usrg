package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.USRG;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, USRG.MODID);
    private static final Item.Properties itemProperties = new Item.Properties().tab(USRG.itemGroup);

    public static RegistryObject<Item> CLAY_ITEM_T1 = ITEMS.register("clay_item_tier_1", () -> new BlockItem(ModBlocks.CLAY_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> CLAY_ITEM_T2 = ITEMS.register("clay_item_tier_2", () -> new BlockItem(ModBlocks.CLAY_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> CLAY_ITEM_T3 = ITEMS.register("clay_item_tier_3", () -> new BlockItem(ModBlocks.CLAY_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> CLAY_ITEM_T4 = ITEMS.register("clay_item_tier_4", () -> new BlockItem(ModBlocks.CLAY_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> CLAY_ITEM_T5 = ITEMS.register("clay_item_tier_5", () -> new BlockItem(ModBlocks.CLAY_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> COBBLE_item_T1 = ITEMS.register("cobble_item_tier_1", () -> new BlockItem(ModBlocks.COBBLE_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> COBBLE_item_T2 = ITEMS.register("cobble_item_tier_2", () -> new BlockItem(ModBlocks.COBBLE_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> COBBLE_item_T3 = ITEMS.register("cobble_item_tier_3", () -> new BlockItem(ModBlocks.COBBLE_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> COBBLE_item_T4 = ITEMS.register("cobble_item_tier_4", () -> new BlockItem(ModBlocks.COBBLE_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> COBBLE_item_T5 = ITEMS.register("cobble_item_tier_5", () -> new BlockItem(ModBlocks.COBBLE_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> CLEAN_item_T1 = ITEMS.register("clean_item_tier_1", () -> new BlockItem(ModBlocks.CLEAN_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> CLEAN_item_T2 = ITEMS.register("clean_item_tier_2", () -> new BlockItem(ModBlocks.CLEAN_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> CLEAN_item_T3 = ITEMS.register("clean_item_tier_3", () -> new BlockItem(ModBlocks.CLEAN_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> CLEAN_item_T4 = ITEMS.register("clean_item_tier_4", () -> new BlockItem(ModBlocks.CLEAN_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> CLEAN_item_T5 = ITEMS.register("clean_item_tier_5", () -> new BlockItem(ModBlocks.CLEAN_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> DIRT_item_T1 = ITEMS.register("dirt_item_tier_1", () -> new BlockItem(ModBlocks.DIRT_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> DIRT_item_T2 = ITEMS.register("dirt_item_tier_2", () -> new BlockItem(ModBlocks.DIRT_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> DIRT_item_T3 = ITEMS.register("dirt_item_tier_3", () -> new BlockItem(ModBlocks.DIRT_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> DIRT_item_T4 = ITEMS.register("dirt_item_tier_4", () -> new BlockItem(ModBlocks.DIRT_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> DIRT_item_T5 = ITEMS.register("dirt_item_tier_5", () -> new BlockItem(ModBlocks.DIRT_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> END_item_T1 = ITEMS.register("end_item_tier_1", () -> new BlockItem(ModBlocks.END_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> END_item_T2 = ITEMS.register("end_item_tier_2", () -> new BlockItem(ModBlocks.END_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> END_item_T3 = ITEMS.register("end_item_tier_3", () -> new BlockItem(ModBlocks.END_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> END_item_T4 = ITEMS.register("end_item_tier_4", () -> new BlockItem(ModBlocks.END_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> END_item_T5 = ITEMS.register("end_item_tier_5", () -> new BlockItem(ModBlocks.END_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> FUNGUS_item_T1 = ITEMS.register("fungus_item_tier_1", () -> new BlockItem(ModBlocks.FUNGUS_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> FUNGUS_item_T2 = ITEMS.register("fungus_item_tier_2", () -> new BlockItem(ModBlocks.FUNGUS_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> FUNGUS_item_T3 = ITEMS.register("fungus_item_tier_3", () -> new BlockItem(ModBlocks.FUNGUS_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> FUNGUS_item_T4 = ITEMS.register("fungus_item_tier_4", () -> new BlockItem(ModBlocks.FUNGUS_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> FUNGUS_item_T5 = ITEMS.register("fungus_item_tier_5", () -> new BlockItem(ModBlocks.FUNGUS_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> GLOWSTONE_item_T1 = ITEMS.register("glowstone_item_tier_1", () -> new BlockItem(ModBlocks.GLOWSTONE_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> GLOWSTONE_item_T2 = ITEMS.register("glowstone_item_tier_2", () -> new BlockItem(ModBlocks.GLOWSTONE_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> GLOWSTONE_item_T3 = ITEMS.register("glowstone_item_tier_3", () -> new BlockItem(ModBlocks.GLOWSTONE_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> GLOWSTONE_item_T4 = ITEMS.register("glowstone_item_tier_4", () -> new BlockItem(ModBlocks.GLOWSTONE_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> GLOWSTONE_item_T5 = ITEMS.register("glowstone_item_tier_5", () -> new BlockItem(ModBlocks.GLOWSTONE_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> GRASS_item_T1 = ITEMS.register("grass_item_tier_1", () -> new BlockItem(ModBlocks.GRASS_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> GRASS_item_T2 = ITEMS.register("grass_item_tier_2", () -> new BlockItem(ModBlocks.GRASS_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> GRASS_item_T3 = ITEMS.register("grass_item_tier_3", () -> new BlockItem(ModBlocks.GRASS_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> GRASS_item_T4 = ITEMS.register("grass_item_tier_4", () -> new BlockItem(ModBlocks.GRASS_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> GRASS_item_T5 = ITEMS.register("grass_item_tier_5", () -> new BlockItem(ModBlocks.GRASS_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> GRAVEL_item_T1 = ITEMS.register("gravel_item_tier_1", () -> new BlockItem(ModBlocks.GRAVEL_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> GRAVEL_item_T2 = ITEMS.register("gravel_item_tier_2", () -> new BlockItem(ModBlocks.GRAVEL_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> GRAVEL_item_T3 = ITEMS.register("gravel_item_tier_3", () -> new BlockItem(ModBlocks.GRAVEL_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> GRAVEL_item_T4 = ITEMS.register("gravel_item_tier_4", () -> new BlockItem(ModBlocks.GRAVEL_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> GRAVEL_item_T5 = ITEMS.register("gravel_item_tier_5", () -> new BlockItem(ModBlocks.GRAVEL_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> ICE_item_T1 = ITEMS.register("ice_item_tier_1", () -> new BlockItem(ModBlocks.ICE_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> ICE_item_T2 = ITEMS.register("ice_item_tier_2", () -> new BlockItem(ModBlocks.ICE_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> ICE_item_T3 = ITEMS.register("ice_item_tier_3", () -> new BlockItem(ModBlocks.ICE_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> ICE_item_T4 = ITEMS.register("ice_item_tier_4", () -> new BlockItem(ModBlocks.ICE_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> ICE_item_T5 = ITEMS.register("ice_item_tier_5", () -> new BlockItem(ModBlocks.ICE_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> NETHERRACK_item_T1 = ITEMS.register("netherrack_item_tier_1", () -> new BlockItem(ModBlocks.NETHERRACK_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> NETHERRACK_item_T2 = ITEMS.register("netherrack_item_tier_2", () -> new BlockItem(ModBlocks.NETHERRACK_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> NETHERRACK_item_T3 = ITEMS.register("netherrack_item_tier_3", () -> new BlockItem(ModBlocks.NETHERRACK_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> NETHERRACK_item_T4 = ITEMS.register("netherrack_item_tier_4", () -> new BlockItem(ModBlocks.NETHERRACK_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> NETHERRACK_item_T5 = ITEMS.register("netherrack_item_tier_5", () -> new BlockItem(ModBlocks.NETHERRACK_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> OBSIDIAN_item_T1 = ITEMS.register("obsidian_item_tier_1", () -> new BlockItem(ModBlocks.OBSIDIAN_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> OBSIDIAN_item_T2 = ITEMS.register("obsidian_item_tier_2", () -> new BlockItem(ModBlocks.OBSIDIAN_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> OBSIDIAN_item_T3 = ITEMS.register("obsidian_item_tier_3", () -> new BlockItem(ModBlocks.OBSIDIAN_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> OBSIDIAN_item_T4 = ITEMS.register("obsidian_item_tier_4", () -> new BlockItem(ModBlocks.OBSIDIAN_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> OBSIDIAN_item_T5 = ITEMS.register("obsidian_item_tier_5", () -> new BlockItem(ModBlocks.OBSIDIAN_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> QUARTZ_item_T1 = ITEMS.register("quartz_item_tier_1", () -> new BlockItem(ModBlocks.QUARTZ_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> QUARTZ_item_T2 = ITEMS.register("quartz_item_tier_2", () -> new BlockItem(ModBlocks.QUARTZ_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> QUARTZ_item_T3 = ITEMS.register("quartz_item_tier_3", () -> new BlockItem(ModBlocks.QUARTZ_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> QUARTZ_item_T4 = ITEMS.register("quartz_item_tier_4", () -> new BlockItem(ModBlocks.QUARTZ_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> QUARTZ_item_T5 = ITEMS.register("quartz_item_tier_5", () -> new BlockItem(ModBlocks.QUARTZ_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> REDSTONE_item_T1 = ITEMS.register("redstone_item_tier_1", () -> new BlockItem(ModBlocks.REDSTONE_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> REDSTONE_item_T2 = ITEMS.register("redstone_item_tier_2", () -> new BlockItem(ModBlocks.REDSTONE_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> REDSTONE_item_T3 = ITEMS.register("redstone_item_tier_3", () -> new BlockItem(ModBlocks.REDSTONE_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> REDSTONE_item_T4 = ITEMS.register("redstone_item_tier_4", () -> new BlockItem(ModBlocks.REDSTONE_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> REDSTONE_item_T5 = ITEMS.register("redstone_item_tier_5", () -> new BlockItem(ModBlocks.REDSTONE_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> SAND_item_T1 = ITEMS.register("sand_item_tier_1", () -> new BlockItem(ModBlocks.SAND_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> SAND_item_T2 = ITEMS.register("sand_item_tier_2", () -> new BlockItem(ModBlocks.SAND_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> SAND_item_T3 = ITEMS.register("sand_item_tier_3", () -> new BlockItem(ModBlocks.SAND_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> SAND_item_T4 = ITEMS.register("sand_item_tier_4", () -> new BlockItem(ModBlocks.SAND_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> SAND_item_T5 = ITEMS.register("sand_item_tier_5", () -> new BlockItem(ModBlocks.SAND_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> SNOW_item_T1 = ITEMS.register("snow_item_tier_1", () -> new BlockItem(ModBlocks.SNOW_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> SNOW_item_T2 = ITEMS.register("snow_item_tier_2", () -> new BlockItem(ModBlocks.SNOW_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> SNOW_item_T3 = ITEMS.register("snow_item_tier_3", () -> new BlockItem(ModBlocks.SNOW_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> SNOW_item_T4 = ITEMS.register("snow_item_tier_4", () -> new BlockItem(ModBlocks.SNOW_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> SNOW_item_T5 = ITEMS.register("snow_item_tier_5", () -> new BlockItem(ModBlocks.SNOW_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> SOULSAND_item_T1 = ITEMS.register("soulsand_item_tier_1", () -> new BlockItem(ModBlocks.SOULSAND_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> SOULSAND_item_T2 = ITEMS.register("soulsand_item_tier_2", () -> new BlockItem(ModBlocks.SOULSAND_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> SOULSAND_item_T3 = ITEMS.register("soulsand_item_tier_3", () -> new BlockItem(ModBlocks.SOULSAND_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> SOULSAND_item_T4 = ITEMS.register("soulsand_item_tier_4", () -> new BlockItem(ModBlocks.SOULSAND_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> SOULSAND_item_T5 = ITEMS.register("soulsand_item_tier_5", () -> new BlockItem(ModBlocks.SOULSAND_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> DYE_item_T1 = ITEMS.register("dye_item_tier_1", () -> new BlockItem(ModBlocks.DYE_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> DYE_item_T2 = ITEMS.register("dye_item_tier_2", () -> new BlockItem(ModBlocks.DYE_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> DYE_item_T3 = ITEMS.register("dye_item_tier_3", () -> new BlockItem(ModBlocks.DYE_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> DYE_item_T4 = ITEMS.register("dye_item_tier_4", () -> new BlockItem(ModBlocks.DYE_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> DYE_item_T5 = ITEMS.register("dye_item_tier_5", () -> new BlockItem(ModBlocks.DYE_GEN_T5.get(), itemProperties));
    public static RegistryObject<Item> ORE_item_T1 = ITEMS.register("ore_item_tier_1", () -> new BlockItem(ModBlocks.ORE_GEN_T1.get(), itemProperties));
    public static RegistryObject<Item> ORE_item_T2 = ITEMS.register("ore_item_tier_2", () -> new BlockItem(ModBlocks.ORE_GEN_T2.get(), itemProperties));
    public static RegistryObject<Item> ORE_item_T3 = ITEMS.register("ore_item_tier_3", () -> new BlockItem(ModBlocks.ORE_GEN_T3.get(), itemProperties));
    public static RegistryObject<Item> ORE_item_T4 = ITEMS.register("ore_item_tier_4", () -> new BlockItem(ModBlocks.ORE_GEN_T4.get(), itemProperties));
    public static RegistryObject<Item> ORE_item_T5 = ITEMS.register("ore_item_tier_5", () -> new BlockItem(ModBlocks.ORE_GEN_T5.get(), itemProperties));

    public static class EXNModBlocks {
        public static RegistryObject<Item> DUST_item_T1 = ITEMS.register("dust_item_tier_1", () -> new BlockItem(ModBlocks.EXNModBlocks.DUST_GEN_T1.get(), itemProperties));
        public static RegistryObject<Item> DUST_item_T2 = ITEMS.register("dust_item_tier_2", () -> new BlockItem(ModBlocks.EXNModBlocks.DUST_GEN_T2.get(), itemProperties));
        public static RegistryObject<Item> DUST_item_T3 = ITEMS.register("dust_item_tier_3", () -> new BlockItem(ModBlocks.EXNModBlocks.DUST_GEN_T3.get(), itemProperties));
        public static RegistryObject<Item> DUST_item_T4 = ITEMS.register("dust_item_tier_4", () -> new BlockItem(ModBlocks.EXNModBlocks.DUST_GEN_T4.get(), itemProperties));
        public static RegistryObject<Item> DUST_item_T5 = ITEMS.register("dust_item_tier_5", () -> new BlockItem(ModBlocks.EXNModBlocks.DUST_GEN_T5.get(), itemProperties));
        public static RegistryObject<Item> CRUSHED_ENDSTONE_item_T1 = ITEMS.register("crushed_endstone_item_tier_1", () -> new BlockItem(ModBlocks.EXNModBlocks.CRUSHED_ENDSTONE_GEN_T1.get(), itemProperties));
        public static RegistryObject<Item> CRUSHED_ENDSTONE_item_T2 = ITEMS.register("crushed_endstone_item_tier_2", () -> new BlockItem(ModBlocks.EXNModBlocks.CRUSHED_ENDSTONE_GEN_T2.get(), itemProperties));
        public static RegistryObject<Item> CRUSHED_ENDSTONE_item_T3 = ITEMS.register("crushed_endstone_item_tier_3", () -> new BlockItem(ModBlocks.EXNModBlocks.CRUSHED_ENDSTONE_GEN_T3.get(), itemProperties));
        public static RegistryObject<Item> CRUSHED_ENDSTONE_item_T4 = ITEMS.register("crushed_endstone_item_tier_4", () -> new BlockItem(ModBlocks.EXNModBlocks.CRUSHED_ENDSTONE_GEN_T4.get(), itemProperties));
        public static RegistryObject<Item> CRUSHED_ENDSTONE_item_T5 = ITEMS.register("crushed_endstone_item_tier_5", () -> new BlockItem(ModBlocks.EXNModBlocks.CRUSHED_ENDSTONE_GEN_T5.get(), itemProperties));
        public static RegistryObject<Item> CRUSHED_NETHERRACK_item_T1 = ITEMS.register("crushed_netherrack_item_tier_1", () -> new BlockItem(ModBlocks.EXNModBlocks.CRUSHED_NETHERRACK_GEN_T1.get(), itemProperties));
        public static RegistryObject<Item> CRUSHED_NETHERRACK_item_T2 = ITEMS.register("crushed_netherrack_item_tier_2", () -> new BlockItem(ModBlocks.EXNModBlocks.CRUSHED_NETHERRACK_GEN_T2.get(), itemProperties));
        public static RegistryObject<Item> CRUSHED_NETHERRACK_item_T3 = ITEMS.register("crushed_netherrack_item_tier_3", () -> new BlockItem(ModBlocks.EXNModBlocks.CRUSHED_NETHERRACK_GEN_T3.get(), itemProperties));
        public static RegistryObject<Item> CRUSHED_NETHERRACK_item_T4 = ITEMS.register("crushed_netherrack_item_tier_4", () -> new BlockItem(ModBlocks.EXNModBlocks.CRUSHED_NETHERRACK_GEN_T4.get(), itemProperties));
        public static RegistryObject<Item> CRUSHED_NETHERRACK_item_T5 = ITEMS.register("crushed_netherrack_item_tier_5", () -> new BlockItem(ModBlocks.EXNModBlocks.CRUSHED_NETHERRACK_GEN_T5.get(), itemProperties));

        public static void init(IEventBus modBusEvent) {
            ITEMS.register(modBusEvent);
        }
    }

    public static void init(IEventBus modBusEvent) {
        ITEMS.register(modBusEvent);
        if (ModList.get().isLoaded("exnihilosequentia")) {
            ModBlocks.EXNModBlocks.init(modBusEvent);
        }
    }
}
