package com.rafacost3d.usrg;

import com.rafacost3d.usrg.blocks.*;
import com.rafacost3d.usrg.setup.Config;
import com.rafacost3d.usrg.setup.ModSetup;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("usrg")
public class USRG
{
    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();

    public USRG() {

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient);

        //Config.loadConfig(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("usrg-client.toml"));
        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("usrg-common.toml"));

    }

    private void setupClient(final FMLClientSetupEvent event) {
        // the following is required to help with the glass transparency
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLEGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLEANGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLAYGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIRTGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENDGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FUNGUSGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLOWSTONEGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRASSGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAVELGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICEGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OBSIDIANGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.QUARTZGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDSTONEGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SANDGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SNOWGENERATOR, RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOULGENERATOR, RenderType.cutout());

        if (Config.ENABLE_ORE_GENERATOR.get()) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.OREGENERATOR, RenderType.cutout());
        }

        if (Config.ENABLE_DYE_GENERATOR.get()) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DYEGENERATOR, RenderType.cutout());
        }

        ResourceLocation key = new ResourceLocation("exnihilosequentia:dust");
        if (ForgeRegistries.BLOCKS.containsKey(key)) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DUSTGENERATOR, RenderType.cutout());
        }

        key = new ResourceLocation("exnihilosequentia:crushed_end_stone");
        if (ForgeRegistries.BLOCKS.containsKey(key)) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENDCRUSHEDGENERATOR, RenderType.cutout());
        }

        key = new ResourceLocation("exnihilosequentia:crushed_netherrack");
        if (ForgeRegistries.BLOCKS.containsKey(key)) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERCRUSHEDGENERATOR, RenderType.cutout());
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new CobblestoneGenerator());
            event.getRegistry().register(new CleanGenerator());
            event.getRegistry().register(new ClayGenerator());
            event.getRegistry().register(new DirtGenerator());
            event.getRegistry().register(new EndstoneGenerator());
            event.getRegistry().register(new FungusGenerator());
            event.getRegistry().register(new GlowstoneGenerator());
            event.getRegistry().register(new GrassGenerator());
            event.getRegistry().register(new GravelGenerator());
            event.getRegistry().register(new IceGenerator());
            event.getRegistry().register(new NetherGenerator());
            event.getRegistry().register(new ObsidianGenerator());
            event.getRegistry().register(new QuartzGenerator());
            event.getRegistry().register(new RedstoneGenerator());
            event.getRegistry().register(new SandGenerator());
            event.getRegistry().register(new SnowGenerator());
            event.getRegistry().register(new SoulGenerator());

            LOGGER.info("USRG - Vanilla Generator blocks registered");

            if (Config.ENABLE_ORE_GENERATOR.get()) {
                event.getRegistry().register(new OreGenerator());
                LOGGER.info("USRG - Ore Generator block registered");
            }

            if (Config.ENABLE_DYE_GENERATOR.get()) {
                event.getRegistry().register(new DyeGenerator());
                LOGGER.info("USRG - Dye Generator block registered");
            }

            ResourceLocation key = new ResourceLocation("exnihilosequentia:dust");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
            	event.getRegistry().register(new DustGenerator());
            	LOGGER.info("USRG - Ex Nihilo: Sequentia Dust Generator block registered");
            }

            key = new ResourceLocation("exnihilosequentia:crushed_end_stone");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
            	event.getRegistry().register(new CrushedEndstoneGenerator());
            	LOGGER.info("USRG - Ex Nihilo: Sequentia Crushed Endstone Generator block registered");
            }

            key = new ResourceLocation("exnihilosequentia:crushed_netherrack");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
            	event.getRegistry().register(new CrushedNetherGenerator());
            	LOGGER.info("USRG - Ex Nihilo: Sequentia Crushed Netherrack Generator block registered");
            }
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().tab(setup.itemGroup);

            event.getRegistry().register(new BlockItem(ModBlocks.COBBLEGENERATOR, properties).setRegistryName("cobblegenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.CLEANGENERATOR, properties).setRegistryName("cleangenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.CLAYGENERATOR, properties).setRegistryName("claygenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.DIRTGENERATOR, properties).setRegistryName("dirtgenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.ENDGENERATOR, properties).setRegistryName("endgenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.FUNGUSGENERATOR, properties).setRegistryName("fungusgenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.GLOWSTONEGENERATOR, properties).setRegistryName("glowstonegenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.GRASSGENERATOR, properties).setRegistryName("grassgenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.GRAVELGENERATOR, properties).setRegistryName("gravelgenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.ICEGENERATOR, properties).setRegistryName("icegenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.NETHERGENERATOR, properties).setRegistryName("nethergenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.OBSIDIANGENERATOR, properties).setRegistryName("obsidiangenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.QUARTZGENERATOR, properties).setRegistryName("quartzgenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.REDSTONEGENERATOR, properties).setRegistryName("redstonegenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.SANDGENERATOR, properties).setRegistryName("sandgenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.SNOWGENERATOR, properties).setRegistryName("snowgenerator"));
            event.getRegistry().register(new BlockItem(ModBlocks.SOULGENERATOR, properties).setRegistryName("soulgenerator"));

            LOGGER.info("USRG - Vanilla Generator items registered");

            if (Config.ENABLE_ORE_GENERATOR.get()) {
                event.getRegistry().register(new BlockItem(ModBlocks.OREGENERATOR, properties).setRegistryName("oregenerator"));
                LOGGER.info("USRG - Ore Generator item registered");
            }

            if (Config.ENABLE_DYE_GENERATOR.get()) {
                event.getRegistry().register(new BlockItem(ModBlocks.DYEGENERATOR, properties).setRegistryName("dyegenerator"));
                LOGGER.info("USRG - Dye Generator item registered");
            }

            ResourceLocation key = new ResourceLocation("exnihilosequentia:dust");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
            	event.getRegistry().register(new BlockItem(ModBlocks.DUSTGENERATOR, properties).setRegistryName("dustgenerator"));
            	LOGGER.info("USRG - Ex Nihilo: Sequentia Dust Generator item registered");
            }

            key = new ResourceLocation("exnihilosequentia:crushed_end_stone");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
            	event.getRegistry().register(new BlockItem(ModBlocks.ENDCRUSHEDGENERATOR, properties).setRegistryName("endcrushedgenerator"));
            	LOGGER.info("USRG - Ex Nihilo: Sequentia Crushed Endstone Generator item registered");
            } 

            key = new ResourceLocation("exnihilosequentia:crushed_netherrack");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
            	event.getRegistry().register(new BlockItem(ModBlocks.NETHERCRUSHEDGENERATOR, properties).setRegistryName("nethercrushedgenerator"));
            	LOGGER.info("USRG - Ex Nihilo: Sequentia Crushed Netherrack Generator item registered");
            }       
        }

        @SubscribeEvent
        public static void onTileEntityRegistry(final RegistryEvent.Register<BlockEntityType<?>> event) {
            event.getRegistry().register(BlockEntityType.Builder.of(CleanGeneratorTile::new, ModBlocks.COBBLEGENERATOR).build(null).setRegistryName("cobblegenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(CleanGeneratorTile::new, ModBlocks.CLEANGENERATOR).build(null).setRegistryName("cleangenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(ClayGeneratorTile::new, ModBlocks.CLAYGENERATOR).build(null).setRegistryName("claygenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(DirtGeneratorTile::new, ModBlocks.DIRTGENERATOR).build(null).setRegistryName("dirtgenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(EndstoneGeneratorTile::new, ModBlocks.ENDGENERATOR).build(null).setRegistryName("endgenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(FungusGeneratorTile::new, ModBlocks.FUNGUSGENERATOR).build(null).setRegistryName("fungusgenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(GlowstoneGeneratorTile::new, ModBlocks.GLOWSTONEGENERATOR).build(null).setRegistryName("glowstonegenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(GrassGeneratorTile::new, ModBlocks.GRASSGENERATOR).build(null).setRegistryName("grassgenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(GravelGeneratorTile::new, ModBlocks.GRAVELGENERATOR).build(null).setRegistryName("gravelgenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(IceGeneratorTile::new, ModBlocks.ICEGENERATOR).build(null).setRegistryName("icegenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(NetherGeneratorTile::new, ModBlocks.NETHERGENERATOR).build(null).setRegistryName("nethergenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(ObsidianGeneratorTile::new, ModBlocks.OBSIDIANGENERATOR).build(null).setRegistryName("obsidiangenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(QuartzGeneratorTile::new, ModBlocks.QUARTZGENERATOR).build(null).setRegistryName("quartzgenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(RedstoneGeneratorTile::new, ModBlocks.REDSTONEGENERATOR).build(null).setRegistryName("redstonegenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(SandGeneratorTile::new, ModBlocks.SANDGENERATOR).build(null).setRegistryName("sandgenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(SnowGeneratorTile::new, ModBlocks.SNOWGENERATOR).build(null).setRegistryName("snowgenerator"));
            event.getRegistry().register(BlockEntityType.Builder.of(SoulGeneratorTile::new, ModBlocks.SOULGENERATOR).build(null).setRegistryName("soulgenerator"));

            LOGGER.info("USRG - Vanilla Generator tile entities registered");

            if (Config.ENABLE_ORE_GENERATOR.get()) {
                event.getRegistry().register(BlockEntityType.Builder.of(OreGeneratorTile::new, ModBlocks.OREGENERATOR).build(null).setRegistryName("oregenerator"));
                LOGGER.info("USRG - Ore Generator tile entity registered");
            }

            if (Config.ENABLE_DYE_GENERATOR.get()) {
                event.getRegistry().register(BlockEntityType.Builder.of(DyeGeneratorTile::new, ModBlocks.DYEGENERATOR).build(null).setRegistryName("dyegenerator"));
                LOGGER.info("USRG - Dye Generator tile entity registered");
            }

            ResourceLocation key = new ResourceLocation("exnihilosequentia:dust");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
            	event.getRegistry().register(BlockEntityType.Builder.of(DustGeneratorTile::new, ModBlocks.DUSTGENERATOR).build(null).setRegistryName("dustgenerator"));
            	LOGGER.info("USRG - Ex Nihilo: Sequentia Dust Generator tile entity registered");
            }

            key = new ResourceLocation("exnihilosequentia:crushed_end_stone");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
            	event.getRegistry().register(BlockEntityType.Builder.of(CrushedEndstoneGeneratorTile::new, ModBlocks.ENDCRUSHEDGENERATOR).build(null).setRegistryName("endcrushedgenerator"));
            	LOGGER.info("USRG - Ex Nihilo: Sequentia Crushed Endstone Generator tile entity registered");
            }

            key = new ResourceLocation("exnihilosequentia:crushed_netherrack");
            if (ForgeRegistries.BLOCKS.containsKey(key)) {
            	event.getRegistry().register(BlockEntityType.Builder.of(CrushedNetherGeneratorTile::new, ModBlocks.NETHERCRUSHEDGENERATOR).build(null).setRegistryName("nethercrushedgenerator"));
            	LOGGER.info("USRG - Ex Nihilo: Sequentia Crushed Netherrack Generator tile entity registered");
            }
        }

    }
}
