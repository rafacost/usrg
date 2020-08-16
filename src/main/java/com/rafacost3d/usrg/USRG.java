package com.rafacost3d.usrg;

import com.rafacost3d.usrg.blocks.*;
import com.rafacost3d.usrg.blocks.ModBlocks;
import com.rafacost3d.usrg.setup.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("usrg")
public class USRG
{
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();

    public USRG() {

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        Config.loadConfig(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("usrg-client.toml"));
        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("usrg-common.toml"));

    }

    private void setup(final FMLCommonSetupEvent event)
    {
        setup.init();
        proxy.init();
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            LOGGER.info("USRG_DEBUG");
            event.getRegistry().register(new CobblestoneGenerator());
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
            event.getRegistry().register(new OreGenerator());

        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties()
                    .group(setup.itemGroup);
            event.getRegistry().register(new BlockItem(ModBlocks.COBBLEGENERATOR, properties).setRegistryName("cobblegenerator"));
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
            event.getRegistry().register(new BlockItem(ModBlocks.OREGENERATOR, properties).setRegistryName("oregenerator"));
        }

        @SubscribeEvent
        public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> event) {
            event.getRegistry().register(TileEntityType.Builder.create(CobblestoneGeneratorTile::new, ModBlocks.COBBLEGENERATOR).build(null).setRegistryName("cobblegenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(ClayGeneratorTile::new, ModBlocks.CLAYGENERATOR).build(null).setRegistryName("claygenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(DirtGeneratorTile::new, ModBlocks.DIRTGENERATOR).build(null).setRegistryName("dirtgenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(EndstoneGeneratorTile::new, ModBlocks.ENDGENERATOR).build(null).setRegistryName("endgenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(FungusGeneratorTile::new, ModBlocks.FUNGUSGENERATOR).build(null).setRegistryName("fungusgenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(GlowstoneGeneratorTile::new, ModBlocks.GLOWSTONEGENERATOR).build(null).setRegistryName("glowstonegenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(GrassGeneratorTile::new, ModBlocks.GRASSGENERATOR).build(null).setRegistryName("grassgenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(GravelGeneratorTile::new, ModBlocks.GRAVELGENERATOR).build(null).setRegistryName("gravelgenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(IceGeneratorTile::new, ModBlocks.ICEGENERATOR).build(null).setRegistryName("icegenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(NetherGeneratorTile::new, ModBlocks.NETHERGENERATOR).build(null).setRegistryName("nethergenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(ObsidianGeneratorTile::new, ModBlocks.OBSIDIANGENERATOR).build(null).setRegistryName("obsidiangenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(QuartzGeneratorTile::new, ModBlocks.QUARTZGENERATOR).build(null).setRegistryName("quartzgenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(RedstoneGeneratorTile::new, ModBlocks.REDSTONEGENERATOR).build(null).setRegistryName("redstonegenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(SandGeneratorTile::new, ModBlocks.SANDGENERATOR).build(null).setRegistryName("sandgenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(SnowGeneratorTile::new, ModBlocks.SNOWGENERATOR).build(null).setRegistryName("snowgenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(SoulGeneratorTile::new, ModBlocks.SOULGENERATOR).build(null).setRegistryName("soulgenerator"));
            event.getRegistry().register(TileEntityType.Builder.create(OreGeneratorTile::new, ModBlocks.OREGENERATOR).build(null).setRegistryName("oregenerator"));

        }
    }
}
