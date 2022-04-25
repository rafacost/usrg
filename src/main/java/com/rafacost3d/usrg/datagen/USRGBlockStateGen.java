package com.rafacost3d.usrg.datagen;

import com.rafacost3d.usrg.USRG;
import com.rafacost3d.usrg.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class USRGBlockStateGen extends BlockStateProvider {
    ResourceLocation stillLava = modLoc(blockLoc + "lava_still");
    ResourceLocation stillWater = modLoc(blockLoc + "water_still");
    private static final String blockLoc = "block/";
    private static final String tier1 = "basetier1generator";
    private static final String tier2 = "basetier2generator";
    private static final String tier3 = "basetier3generator";
    private static final String tier4 = "basetier4generator";
    private static final String tier5 = "basetier5generator";
    public USRGBlockStateGen(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, USRG.MODID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        createGenModels(ModBlocks.CLAY_GEN_T1.get(),mcLoc(blockLoc + Blocks.CLAY.getRegistryName().getPath()), stillWater, tier1);
        createGenModels(ModBlocks.CLAY_GEN_T2.get(),mcLoc(blockLoc + Blocks.CLAY.getRegistryName().getPath()), stillWater, tier2);
        createGenModels(ModBlocks.CLAY_GEN_T3.get(),mcLoc(blockLoc + Blocks.CLAY.getRegistryName().getPath()), stillWater, tier3);
        createGenModels(ModBlocks.CLAY_GEN_T4.get(),mcLoc(blockLoc + Blocks.CLAY.getRegistryName().getPath()), stillWater, tier4);
        createGenModels(ModBlocks.CLAY_GEN_T5.get(),mcLoc(blockLoc + Blocks.CLAY.getRegistryName().getPath()), stillWater, tier5);
        createGenModels(ModBlocks.CLEAN_GEN_T1.get(),mcLoc(blockLoc + Blocks.STONE.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.CLEAN_GEN_T2.get(),mcLoc(blockLoc + Blocks.STONE.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.CLEAN_GEN_T3.get(),mcLoc(blockLoc + Blocks.STONE.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.CLEAN_GEN_T4.get(),mcLoc(blockLoc + Blocks.STONE.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.CLEAN_GEN_T5.get(),mcLoc(blockLoc + Blocks.STONE.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.COBBLE_GEN_T1.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.COBBLE_GEN_T2.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.COBBLE_GEN_T3.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.COBBLE_GEN_T4.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.COBBLE_GEN_T5.get(),mcLoc(blockLoc + Blocks.COBBLESTONE.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.DIRT_GEN_T1.get(),mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath()), stillWater, tier1);
        createGenModels(ModBlocks.DIRT_GEN_T2.get(),mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath()), stillWater, tier2);
        createGenModels(ModBlocks.DIRT_GEN_T3.get(),mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath()), stillWater, tier3);
        createGenModels(ModBlocks.DIRT_GEN_T4.get(),mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath()), stillWater, tier4);
        createGenModels(ModBlocks.DIRT_GEN_T5.get(),mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath()), stillWater, tier5);
        createGenModels(ModBlocks.DYE_GEN_T1.get(),mcLoc(blockLoc + Blocks.WHITE_WOOL.getRegistryName().getPath()), stillWater, tier1);
        createGenModels(ModBlocks.DYE_GEN_T2.get(),mcLoc(blockLoc + Blocks.WHITE_WOOL.getRegistryName().getPath()), stillWater, tier2);
        createGenModels(ModBlocks.DYE_GEN_T3.get(),mcLoc(blockLoc + Blocks.WHITE_WOOL.getRegistryName().getPath()), stillWater, tier3);
        createGenModels(ModBlocks.DYE_GEN_T4.get(),mcLoc(blockLoc + Blocks.WHITE_WOOL.getRegistryName().getPath()), stillWater, tier4);
        createGenModels(ModBlocks.DYE_GEN_T5.get(),mcLoc(blockLoc + Blocks.WHITE_WOOL.getRegistryName().getPath()), stillWater, tier5);
        createGenModels(ModBlocks.END_GEN_T1.get(),mcLoc(blockLoc + Blocks.END_STONE.getRegistryName().getPath()), stillLava, tier1);
        createGenModels(ModBlocks.END_GEN_T2.get(),mcLoc(blockLoc + Blocks.END_STONE.getRegistryName().getPath()), stillLava, tier2);
        createGenModels(ModBlocks.END_GEN_T3.get(),mcLoc(blockLoc + Blocks.END_STONE.getRegistryName().getPath()), stillLava, tier3);
        createGenModels(ModBlocks.END_GEN_T4.get(),mcLoc(blockLoc + Blocks.END_STONE.getRegistryName().getPath()), stillLava, tier4);
        createGenModels(ModBlocks.END_GEN_T5.get(),mcLoc(blockLoc + Blocks.END_STONE.getRegistryName().getPath()), stillLava, tier5);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T1.get(),mcLoc(blockLoc + Blocks.GLOWSTONE.getRegistryName().getPath()), stillLava, tier1);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T2.get(),mcLoc(blockLoc + Blocks.GLOWSTONE.getRegistryName().getPath()), stillLava, tier2);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T3.get(),mcLoc(blockLoc + Blocks.GLOWSTONE.getRegistryName().getPath()), stillLava, tier3);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T4.get(),mcLoc(blockLoc + Blocks.GLOWSTONE.getRegistryName().getPath()), stillLava, tier4);
        createGenModels(ModBlocks.GLOWSTONE_GEN_T5.get(),mcLoc(blockLoc + Blocks.GLOWSTONE.getRegistryName().getPath()), stillLava, tier5);
        createGenModels(ModBlocks.GRAVEL_GEN_T1.get(),mcLoc(blockLoc + Blocks.GRAVEL.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.GRAVEL_GEN_T2.get(),mcLoc(blockLoc + Blocks.GRAVEL.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.GRAVEL_GEN_T3.get(),mcLoc(blockLoc + Blocks.GRAVEL.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.GRAVEL_GEN_T4.get(),mcLoc(blockLoc + Blocks.GRAVEL.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.GRAVEL_GEN_T5.get(),mcLoc(blockLoc + Blocks.GRAVEL.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.ICE_GEN_T1.get(),mcLoc(blockLoc + Blocks.ICE.getRegistryName().getPath()), stillWater, tier1);
        createGenModels(ModBlocks.ICE_GEN_T2.get(),mcLoc(blockLoc + Blocks.ICE.getRegistryName().getPath()), stillWater, tier2);
        createGenModels(ModBlocks.ICE_GEN_T3.get(),mcLoc(blockLoc + Blocks.ICE.getRegistryName().getPath()), stillWater, tier3);
        createGenModels(ModBlocks.ICE_GEN_T4.get(),mcLoc(blockLoc + Blocks.ICE.getRegistryName().getPath()), stillWater, tier4);
        createGenModels(ModBlocks.ICE_GEN_T5.get(),mcLoc(blockLoc + Blocks.ICE.getRegistryName().getPath()), stillWater, tier5);
        createGenModels(ModBlocks.NETHERRACK_GEN_T1.get(),mcLoc(blockLoc + Blocks.NETHERRACK.getRegistryName().getPath()), stillLava, tier1);
        createGenModels(ModBlocks.NETHERRACK_GEN_T2.get(),mcLoc(blockLoc + Blocks.NETHERRACK.getRegistryName().getPath()), stillLava, tier2);
        createGenModels(ModBlocks.NETHERRACK_GEN_T3.get(),mcLoc(blockLoc + Blocks.NETHERRACK.getRegistryName().getPath()), stillLava, tier3);
        createGenModels(ModBlocks.NETHERRACK_GEN_T4.get(),mcLoc(blockLoc + Blocks.NETHERRACK.getRegistryName().getPath()), stillLava, tier4);
        createGenModels(ModBlocks.NETHERRACK_GEN_T5.get(),mcLoc(blockLoc + Blocks.NETHERRACK.getRegistryName().getPath()), stillLava, tier5);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T1.get(),mcLoc(blockLoc + Blocks.OBSIDIAN.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T2.get(),mcLoc(blockLoc + Blocks.OBSIDIAN.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T3.get(),mcLoc(blockLoc + Blocks.OBSIDIAN.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T4.get(),mcLoc(blockLoc + Blocks.OBSIDIAN.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.OBSIDIAN_GEN_T5.get(),mcLoc(blockLoc + Blocks.OBSIDIAN.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.ORE_GEN_T1.get(),mcLoc(blockLoc + Blocks.DIAMOND_ORE.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.ORE_GEN_T2.get(),mcLoc(blockLoc + Blocks.DIAMOND_ORE.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.ORE_GEN_T3.get(),mcLoc(blockLoc + Blocks.DIAMOND_ORE.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.ORE_GEN_T4.get(),mcLoc(blockLoc + Blocks.DIAMOND_ORE.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.ORE_GEN_T5.get(),mcLoc(blockLoc + Blocks.DIAMOND_ORE.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.QUARTZ_GEN_T1.get(),mcLoc(blockLoc + Blocks.QUARTZ_BLOCK.getRegistryName().getPath() + "_top"), stillLava, tier1);
        createGenModels(ModBlocks.QUARTZ_GEN_T2.get(),mcLoc(blockLoc + Blocks.QUARTZ_BLOCK.getRegistryName().getPath() + "_top"), stillLava, tier2);
        createGenModels(ModBlocks.QUARTZ_GEN_T3.get(),mcLoc(blockLoc + Blocks.QUARTZ_BLOCK.getRegistryName().getPath() + "_top"), stillLava, tier3);
        createGenModels(ModBlocks.QUARTZ_GEN_T4.get(),mcLoc(blockLoc + Blocks.QUARTZ_BLOCK.getRegistryName().getPath() + "_top"), stillLava, tier4);
        createGenModels(ModBlocks.QUARTZ_GEN_T5.get(),mcLoc(blockLoc + Blocks.QUARTZ_BLOCK.getRegistryName().getPath() + "_top"), stillLava, tier5);
        createGenModels(ModBlocks.REDSTONE_GEN_T1.get(),mcLoc(blockLoc + Blocks.REDSTONE_BLOCK.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.REDSTONE_GEN_T2.get(),mcLoc(blockLoc + Blocks.REDSTONE_BLOCK.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.REDSTONE_GEN_T3.get(),mcLoc(blockLoc + Blocks.REDSTONE_BLOCK.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.REDSTONE_GEN_T4.get(),mcLoc(blockLoc + Blocks.REDSTONE_BLOCK.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.REDSTONE_GEN_T5.get(),mcLoc(blockLoc + Blocks.REDSTONE_BLOCK.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.SAND_GEN_T1.get(),mcLoc(blockLoc + Blocks.SAND.getRegistryName().getPath()), tier1);
        createGenModels(ModBlocks.SAND_GEN_T2.get(),mcLoc(blockLoc + Blocks.SAND.getRegistryName().getPath()), tier2);
        createGenModels(ModBlocks.SAND_GEN_T3.get(),mcLoc(blockLoc + Blocks.SAND.getRegistryName().getPath()), tier3);
        createGenModels(ModBlocks.SAND_GEN_T4.get(),mcLoc(blockLoc + Blocks.SAND.getRegistryName().getPath()), tier4);
        createGenModels(ModBlocks.SAND_GEN_T5.get(),mcLoc(blockLoc + Blocks.SAND.getRegistryName().getPath()), tier5);
        createGenModels(ModBlocks.SNOW_GEN_T1.get(),mcLoc(blockLoc + Blocks.SNOW.getRegistryName().getPath()), stillWater, tier1);
        createGenModels(ModBlocks.SNOW_GEN_T2.get(),mcLoc(blockLoc + Blocks.SNOW.getRegistryName().getPath()), stillWater, tier2);
        createGenModels(ModBlocks.SNOW_GEN_T3.get(),mcLoc(blockLoc + Blocks.SNOW.getRegistryName().getPath()), stillWater, tier3);
        createGenModels(ModBlocks.SNOW_GEN_T4.get(),mcLoc(blockLoc + Blocks.SNOW.getRegistryName().getPath()), stillWater, tier4);
        createGenModels(ModBlocks.SNOW_GEN_T5.get(),mcLoc(blockLoc + Blocks.SNOW.getRegistryName().getPath()), stillWater, tier5);
        createGenModels(ModBlocks.SOULSAND_GEN_T1.get(),mcLoc(blockLoc + Blocks.SOUL_SAND.getRegistryName().getPath()), stillLava, tier1);
        createGenModels(ModBlocks.SOULSAND_GEN_T2.get(),mcLoc(blockLoc + Blocks.SOUL_SAND.getRegistryName().getPath()), stillLava, tier2);
        createGenModels(ModBlocks.SOULSAND_GEN_T3.get(),mcLoc(blockLoc + Blocks.SOUL_SAND.getRegistryName().getPath()), stillLava, tier3);
        createGenModels(ModBlocks.SOULSAND_GEN_T4.get(),mcLoc(blockLoc + Blocks.SOUL_SAND.getRegistryName().getPath()), stillLava, tier4);
        createGenModels(ModBlocks.SOULSAND_GEN_T5.get(),mcLoc(blockLoc + Blocks.SOUL_SAND.getRegistryName().getPath()), stillLava, tier5);

        String exnihilo = "exnihilosequentia";
        if (ModList.get().isLoaded(exnihilo)) {
            List<ResourceLocation> keyList = new ArrayList<>();
            keyList.add(new ResourceLocation(exnihilo, "crushed_end_stone"));
            keyList.add(new ResourceLocation(exnihilo, "crushed_netherrack"));
            keyList.add(new ResourceLocation(exnihilo, "dust"));
            for (ResourceLocation key : keyList) {
                if (ForgeRegistries.BLOCKS.containsKey(key)) {
                    Block block = ForgeRegistries.BLOCKS.getValue(key);
                    assert block != null;
                    createGenModels(block, getBlockTexture(exnihilo, key.getPath()), stillLava, tier1);
                    createGenModels(block, getBlockTexture(exnihilo, key.getPath()), stillLava, tier2);
                    createGenModels(block, getBlockTexture(exnihilo, key.getPath()), stillLava, tier3);
                    createGenModels(block, getBlockTexture(exnihilo, key.getPath()), stillLava, tier4);
                    createGenModels(block, getBlockTexture(exnihilo, key.getPath()), stillLava, tier5);
                }
            }
        }

        ResourceLocation textureBottom = mcLoc(blockLoc + Blocks.DIRT.getRegistryName().getPath());
        String grass = blockLoc + Blocks.GRASS_BLOCK.getRegistryName().getPath();
        String fungus = blockLoc + Blocks.MYCELIUM.getRegistryName().getPath();
        createGenModels(ModBlocks.GRASS_GEN_T1.get(),modLoc(grass + "_top"),newMCLoc(grass, "side"), textureBottom, stillWater, tier1);
        createGenModels(ModBlocks.GRASS_GEN_T2.get(),modLoc(grass + "_top"),newMCLoc(grass, "side"), textureBottom, stillWater, tier2);
        createGenModels(ModBlocks.GRASS_GEN_T3.get(),modLoc(grass + "_top"),newMCLoc(grass, "side"), textureBottom, stillWater, tier3);
        createGenModels(ModBlocks.GRASS_GEN_T4.get(),modLoc(grass + "_top"),newMCLoc(grass, "side"), textureBottom, stillWater, tier4);
        createGenModels(ModBlocks.GRASS_GEN_T5.get(),modLoc(grass + "_top"),newMCLoc(grass, "side"), textureBottom, stillWater, tier5);
        createGenModels(ModBlocks.FUNGUS_GEN_T1.get(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), textureBottom, stillWater, tier1);
        createGenModels(ModBlocks.FUNGUS_GEN_T2.get(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), textureBottom, stillWater, tier2);
        createGenModels(ModBlocks.FUNGUS_GEN_T3.get(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), textureBottom, stillWater, tier3);
        createGenModels(ModBlocks.FUNGUS_GEN_T4.get(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), textureBottom, stillWater, tier4);
        createGenModels(ModBlocks.FUNGUS_GEN_T5.get(),newMCLoc(fungus, "top"),newMCLoc(fungus, "side"), textureBottom, stillWater, tier5);
    }

    private ResourceLocation newMCLoc(String block, String side) {
        return new ResourceLocation(block + "_" + side);
    }

    private void createGenModels(Block block, ResourceLocation texture, String tier) {
        createTiers(block, texture, null, tier);
    }

    private void createGenModels(Block block, ResourceLocation texture, ResourceLocation fluid, String tier) {
        createTiers(block, texture, fluid, tier);
    }

    private void createGenModels(Block block, ResourceLocation textureTop, ResourceLocation textureSide, ResourceLocation textureBottom, ResourceLocation fluid, String tier) {
        ResourceLocation stillLava = modLoc(blockLoc + "lava_still");
        ResourceLocation stillWater = modLoc(blockLoc + "water_still");
        if (fluid != null) {
            if (fluid == stillLava) {
                stillWater = stillLava;
            } else {
                stillLava = stillWater;
            }
        }
        ConfiguredModel model = createTierModels(block, textureTop, textureSide, textureBottom, stillLava, stillWater, tier);
        simpleItem(block, model.model);
    }

    private void createTiers(Block block, ResourceLocation texture, ResourceLocation fluid, String tier) {
        ResourceLocation stillLava = modLoc(blockLoc + "lava_still");
        ResourceLocation stillWater = modLoc(blockLoc + "water_still");
        if (fluid != null) {
            if (fluid.equals(stillLava)) {
                stillWater = stillLava;
            } else {
                stillLava = stillWater;
            }
        }
        ConfiguredModel model = createTierModels(block, texture, stillLava, stillWater, tier);
        simpleItem(block, model.model);
    }

    private ConfiguredModel createTierModels(Block block, ResourceLocation texture, ResourceLocation fluida, ResourceLocation fluidb, String tier) {
        return new ConfiguredModel(
                models().withExistingParent(getRegistryName(block), modLoc(blockLoc + tier))
                        .texture("resource_side", texture)
                        .texture("resource_up", texture)
                        .texture("resource_down", texture)
                        .texture("fluida", fluida)
                        .texture("fluidb", fluidb)
        );
    }

    private ConfiguredModel createTierModels(Block block, ResourceLocation textureTop, ResourceLocation textureSide, ResourceLocation textureBottom, ResourceLocation fluida, ResourceLocation fluidb, String tier) {
        return new ConfiguredModel(
                models().withExistingParent(getRegistryName(block), modLoc(blockLoc + tier))
                        .texture("resource_side", textureSide)
                        .texture("resource_up", textureTop)
                        .texture("resource_down", textureBottom)
                        .texture("fluida", fluida)
                        .texture("fluidb", fluidb)
        );
    }

    private void simpleItem(Block block, ModelFile modelFile) {
        simpleBlockItem(block, modelFile);
        simpleBlock(block, modelFile);
    }

    private ResourceLocation getBlockTexture(String namespace, String path) {
        return new ResourceLocation(namespace, blockLoc + path);
    }

    private String getRegistryName(Block b) {
        ResourceLocation resourceLocation = b.getRegistryName();
        if (resourceLocation != null) {
            return b.getRegistryName().toString();
        }
        return null;
    }
}
