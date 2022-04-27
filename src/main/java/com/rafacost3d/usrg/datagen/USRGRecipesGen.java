package com.rafacost3d.usrg.datagen;

import com.rafacost3d.usrg.USRG;
import com.rafacost3d.usrg.setup.ModBlocks;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.UpgradeRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class USRGRecipesGen extends RecipeProvider {
    public USRGRecipesGen(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        Item water = Items.WATER_BUCKET;
        Item lava = Items.LAVA_BUCKET;
        createGenerator(consumer, Items.CLAY_BALL, ModBlocks.CLAY_GEN_T1.get(), ModBlocks.CLAY_GEN_T2.get(),
                ModBlocks.CLAY_GEN_T3.get(), ModBlocks.CLAY_GEN_T4.get(), ModBlocks.CLAY_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.STONE, ModBlocks.CLEAN_GEN_T1.get(), ModBlocks.CLEAN_GEN_T2.get(),
                ModBlocks.CLEAN_GEN_T3.get(), ModBlocks.CLEAN_GEN_T4.get(), ModBlocks.CLEAN_GEN_T5.get(), lava, water);
        createGenerator(consumer, Items.COBBLESTONE, ModBlocks.COBBLE_GEN_T1.get(), ModBlocks.COBBLE_GEN_T2.get(),
                ModBlocks.COBBLE_GEN_T3.get(), ModBlocks.COBBLE_GEN_T4.get(), ModBlocks.COBBLE_GEN_T5.get(), lava, water);
        createGenerator(consumer, Items.DIRT, ModBlocks.DIRT_GEN_T1.get(), ModBlocks.DIRT_GEN_T2.get(),
                ModBlocks.DIRT_GEN_T3.get(), ModBlocks.DIRT_GEN_T4.get(), ModBlocks.DIRT_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.WHITE_DYE, ModBlocks.DYE_GEN_T1.get(), ModBlocks.DYE_GEN_T2.get(),
                ModBlocks.DYE_GEN_T3.get(), ModBlocks.DYE_GEN_T4.get(), ModBlocks.DYE_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.END_STONE, ModBlocks.END_GEN_T1.get(), ModBlocks.END_GEN_T2.get(),
                ModBlocks.END_GEN_T3.get(), ModBlocks.END_GEN_T4.get(), ModBlocks.END_GEN_T5.get(), lava, lava);
        createGenerator(consumer, Items.MYCELIUM, ModBlocks.FUNGUS_GEN_T1.get(), ModBlocks.FUNGUS_GEN_T2.get(),
                ModBlocks.FUNGUS_GEN_T3.get(), ModBlocks.FUNGUS_GEN_T4.get(), ModBlocks.FUNGUS_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.GLOWSTONE, ModBlocks.GLOWSTONE_GEN_T1.get(), ModBlocks.GLOWSTONE_GEN_T2.get(),
                ModBlocks.GLOWSTONE_GEN_T3.get(), ModBlocks.GLOWSTONE_GEN_T4.get(), ModBlocks.GLOWSTONE_GEN_T5.get(), lava, lava);
        createGenerator(consumer, Items.GRASS_BLOCK, ModBlocks.GRASS_GEN_T1.get(), ModBlocks.GRASS_GEN_T2.get(),
                ModBlocks.GRASS_GEN_T3.get(), ModBlocks.GRASS_GEN_T4.get(), ModBlocks.GRASS_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.GRAVEL, ModBlocks.GRAVEL_GEN_T1.get(), ModBlocks.GRAVEL_GEN_T2.get(),
                ModBlocks.GRAVEL_GEN_T3.get(), ModBlocks.GRAVEL_GEN_T4.get(), ModBlocks.GRAVEL_GEN_T5.get(), lava, water);
        createGenerator(consumer, Items.ICE, ModBlocks.ICE_GEN_T1.get(), ModBlocks.ICE_GEN_T2.get(),
                ModBlocks.ICE_GEN_T3.get(), ModBlocks.ICE_GEN_T4.get(), ModBlocks.ICE_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.NETHERRACK, ModBlocks.NETHERRACK_GEN_T1.get(), ModBlocks.NETHERRACK_GEN_T2.get(),
                ModBlocks.NETHERRACK_GEN_T3.get(), ModBlocks.NETHERRACK_GEN_T4.get(), ModBlocks.NETHERRACK_GEN_T5.get(), lava, lava);
        createGenerator(consumer, Items.OBSIDIAN, ModBlocks.OBSIDIAN_GEN_T1.get(), ModBlocks.OBSIDIAN_GEN_T2.get(),
                ModBlocks.OBSIDIAN_GEN_T3.get(), ModBlocks.OBSIDIAN_GEN_T4.get(), ModBlocks.OBSIDIAN_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.DIAMOND_ORE, ModBlocks.ORE_GEN_T1.get(), ModBlocks.ORE_GEN_T2.get(),
                ModBlocks.ORE_GEN_T3.get(), ModBlocks.ORE_GEN_T4.get(), ModBlocks.ORE_GEN_T5.get(), water, lava);
        createGenerator(consumer, Items.QUARTZ, ModBlocks.QUARTZ_GEN_T1.get(), ModBlocks.QUARTZ_GEN_T2.get(),
                ModBlocks.QUARTZ_GEN_T3.get(), ModBlocks.QUARTZ_GEN_T4.get(), ModBlocks.QUARTZ_GEN_T5.get(), lava, lava);
        createGenerator(consumer, Items.REDSTONE, ModBlocks.REDSTONE_GEN_T1.get(), ModBlocks.REDSTONE_GEN_T2.get(),
                ModBlocks.REDSTONE_GEN_T3.get(), ModBlocks.REDSTONE_GEN_T4.get(), ModBlocks.REDSTONE_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.SAND, ModBlocks.SAND_GEN_T1.get(), ModBlocks.SAND_GEN_T2.get(),
                ModBlocks.SAND_GEN_T3.get(), ModBlocks.SAND_GEN_T4.get(), ModBlocks.SAND_GEN_T5.get(), lava, water);
        createGenerator(consumer, Items.SNOW_BLOCK, ModBlocks.SNOW_GEN_T1.get(), ModBlocks.SNOW_GEN_T2.get(),
                ModBlocks.SNOW_GEN_T3.get(), ModBlocks.SNOW_GEN_T4.get(), ModBlocks.SNOW_GEN_T5.get(), water, water);
        createGenerator(consumer, Items.SOUL_SAND, ModBlocks.SOULSAND_GEN_T1.get(), ModBlocks.SOULSAND_GEN_T2.get(),
                ModBlocks.SOULSAND_GEN_T3.get(), ModBlocks.SOULSAND_GEN_T4.get(), ModBlocks.SOULSAND_GEN_T5.get(), lava, lava);
    }

    private void createGenerator(Consumer<FinishedRecipe> consumer, ItemLike inputItem, ItemLike tier1, ItemLike tier2, ItemLike tier3, ItemLike tier4, ItemLike tier5, ItemLike bucketLeft, ItemLike bucketRight) {
        createTieredGenerator(consumer, Items.OAK_LOG, inputItem, tier1, bucketRight, bucketLeft); //Tier1
        createTieredGenerator(consumer, Items.STONE, tier1, tier2, bucketRight, bucketLeft); //Tier2
        createTieredGenerator(consumer, Items.IRON_BLOCK, tier2, tier3, bucketRight, bucketLeft); //Tier3
        createTieredGenerator(consumer, Items.DIAMOND_BLOCK, tier3, tier4, bucketRight, bucketLeft); //Tier4
        createSmithingGenerator(consumer, tier4, tier5);
    }

    private void createTieredGenerator(Consumer<FinishedRecipe> consumer, ItemLike tieredItem, ItemLike input, ItemLike output, ItemLike bucketRight, ItemLike bucketLeft) {
        ShapedRecipeBuilder.shaped(output)
                .pattern("sws")
                .pattern("bgl")
                .pattern("sxs")
                .define('s', Blocks.STONE_BRICKS)
                .define('g', Blocks.GLASS)
                .define('b', bucketRight)
                .define('l', bucketLeft)
                .define('w', tieredItem)
                .define('x', input)
                .unlockedBy("has_" + input.asItem().getRegistryName().getPath(), InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer, modLoc(output.asItem().getRegistryName().getPath()));
    }

    private void createSmithingGenerator(Consumer<FinishedRecipe> consumer, ItemLike input, ItemLike output) {
        UpgradeRecipeBuilder.smithing(Ingredient.of(input), Ingredient.of(Items.NETHERITE_BLOCK), output.asItem())
                .unlocks("has_" + input.asItem().getRegistryName().getPath(), InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(consumer, modLoc(output.asItem().getRegistryName().getPath()));
    }

    private ResourceLocation modLoc(String input) {
        return new ResourceLocation(USRG.MODID, input);
    }
}