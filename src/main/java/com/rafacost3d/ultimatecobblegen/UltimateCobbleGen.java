package com.rafacost3d.ultimatecobblegen;

import static com.rafacost3d.ultimatecobblegen.UltimateCobbleGen.MODID;
import static com.rafacost3d.ultimatecobblegen.UltimateCobbleGen.NAME;
import static com.rafacost3d.ultimatecobblegen.UltimateCobbleGen.VERSION;


import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;

@Mod(modid = MODID, name = NAME, version = VERSION)
@Mod.EventBusSubscriber
public class UltimateCobbleGen
{
    public static final String MODID = "ultimatecobblegen";
    public static final String NAME = "Ultimate Cobblestone Generator";
    public static final String VERSION = "1.0";

    private static Logger logger;


    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinWorldEvent event) {
        Entity player = event.getEntity();
        if (player instanceof EntityPlayer) {
            ((EntityPlayer) player).unlockRecipes(ForgeRegistries.RECIPES.getKeys().stream().filter(key -> key.getResourceDomain().equals(MODID)).toArray(ResourceLocation[]::new));
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(CobblestoneGenerator.BLOCK);
        TileEntity.register(CobblestoneGenerator.RS.toString(), CobblestoneGenerator.Tile.class);
        event.getRegistry().register(GravelGenerator.BLOCK);
        TileEntity.register(GravelGenerator.RS.toString(), GravelGenerator.Tile.class);
        event.getRegistry().register(SandGenerator.BLOCK);
        TileEntity.register(SandGenerator.RS.toString(), SandGenerator.Tile.class);
        event.getRegistry().register(DirtGenerator.BLOCK);
        TileEntity.register(DirtGenerator.RS.toString(), DirtGenerator.Tile.class);
        event.getRegistry().register(GrassGenerator.BLOCK);
        TileEntity.register(GrassGenerator.RS.toString(), GrassGenerator.Tile.class);
        event.getRegistry().register(FungusGenerator.BLOCK);
        TileEntity.register(FungusGenerator.RS.toString(), FungusGenerator.Tile.class);

        if(Loader.isModLoaded("exnihilocreatio")) {
            event.getRegistry().register(DustGenerator.BLOCK);
            TileEntity.register(DustGenerator.RS.toString(), DustGenerator.Tile.class);
        }


    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(CobblestoneGenerator.ITEM);
        event.getRegistry().register(GravelGenerator.ITEM);
        event.getRegistry().register(SandGenerator.ITEM);
        event.getRegistry().register(DirtGenerator.ITEM);
        event.getRegistry().register(GrassGenerator.ITEM);
        event.getRegistry().register(FungusGenerator.ITEM);
        if(Loader.isModLoaded("exnihilocreatio")) event.getRegistry().register(DustGenerator.ITEM);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(CobblestoneGenerator.ITEM, 0, new ModelResourceLocation(CobblestoneGenerator.RS, "inventory"));
        ModelLoader.setCustomModelResourceLocation(GravelGenerator.ITEM, 0, new ModelResourceLocation(GravelGenerator.RS, "inventory"));
        ModelLoader.setCustomModelResourceLocation(SandGenerator.ITEM, 0, new ModelResourceLocation(SandGenerator.RS, "inventory"));
        ModelLoader.setCustomModelResourceLocation(DirtGenerator.ITEM, 0, new ModelResourceLocation(DirtGenerator.RS, "inventory"));
        ModelLoader.setCustomModelResourceLocation(GrassGenerator.ITEM, 0, new ModelResourceLocation(GrassGenerator.RS, "inventory"));
        ModelLoader.setCustomModelResourceLocation(FungusGenerator.ITEM, 0, new ModelResourceLocation(FungusGenerator.RS, "inventory"));
        if(Loader.isModLoaded("exnihilocreatio")) ModelLoader.setCustomModelResourceLocation(DustGenerator.ITEM, 0, new ModelResourceLocation(DustGenerator.RS, "inventory"));

    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Ultimate Cobblestone Generator is Initializing...");
    }

}
