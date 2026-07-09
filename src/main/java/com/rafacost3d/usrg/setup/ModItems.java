package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.USRG;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public final class ModItems {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, USRG.MODID);

    public static final RegistryObject<BlockItem> CLAYGENERATOR = blockItem("claygenerator", ModBlocks.CLAYGENERATOR);
    public static final RegistryObject<BlockItem> COBBLEGENERATOR = blockItem("cobblegenerator", ModBlocks.COBBLEGENERATOR);
    public static final RegistryObject<BlockItem> CLEANGENERATOR = blockItem("cleangenerator", ModBlocks.CLEANGENERATOR);
    public static final RegistryObject<BlockItem> DIRTGENERATOR = blockItem("dirtgenerator", ModBlocks.DIRTGENERATOR);
    public static final RegistryObject<BlockItem> ENDGENERATOR = blockItem("endgenerator", ModBlocks.ENDGENERATOR);
    public static final RegistryObject<BlockItem> FUNGUSGENERATOR = blockItem("fungusgenerator", ModBlocks.FUNGUSGENERATOR);
    public static final RegistryObject<BlockItem> GLOWSTONEGENERATOR = blockItem("glowstonegenerator", ModBlocks.GLOWSTONEGENERATOR);
    public static final RegistryObject<BlockItem> GRASSGENERATOR = blockItem("grassgenerator", ModBlocks.GRASSGENERATOR);
    public static final RegistryObject<BlockItem> GRAVELGENERATOR = blockItem("gravelgenerator", ModBlocks.GRAVELGENERATOR);
    public static final RegistryObject<BlockItem> ICEGENERATOR = blockItem("icegenerator", ModBlocks.ICEGENERATOR);
    public static final RegistryObject<BlockItem> NETHERGENERATOR = blockItem("nethergenerator", ModBlocks.NETHERGENERATOR);
    public static final RegistryObject<BlockItem> OBSIDIANGENERATOR = blockItem("obsidiangenerator", ModBlocks.OBSIDIANGENERATOR);
    public static final RegistryObject<BlockItem> QUARTZGENERATOR = blockItem("quartzgenerator", ModBlocks.QUARTZGENERATOR);
    public static final RegistryObject<BlockItem> REDSTONEGENERATOR = blockItem("redstonegenerator", ModBlocks.REDSTONEGENERATOR);
    public static final RegistryObject<BlockItem> SANDGENERATOR = blockItem("sandgenerator", ModBlocks.SANDGENERATOR);
    public static final RegistryObject<BlockItem> SNOWGENERATOR = blockItem("snowgenerator", ModBlocks.SNOWGENERATOR);
    public static final RegistryObject<BlockItem> SOULGENERATOR = blockItem("soulgenerator", ModBlocks.SOULGENERATOR);

    public static final RegistryObject<BlockItem> DYEGENERATOR = blockItem("dyegenerator", ModBlocks.DYEGENERATOR);
    public static final RegistryObject<BlockItem> OREGENERATOR = blockItem("oregenerator", ModBlocks.OREGENERATOR);

    public static final RegistryObject<BlockItem> DUSTGENERATOR = blockItem("dustgenerator", ModBlocks.DUSTGENERATOR);
    public static final RegistryObject<BlockItem> ENDCRUSHEDGENERATOR = blockItem("endcrushedgenerator", ModBlocks.ENDCRUSHEDGENERATOR);
    public static final RegistryObject<BlockItem> NETHERCRUSHEDGENERATOR = blockItem("nethercrushedgenerator", ModBlocks.NETHERCRUSHEDGENERATOR);

    private ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static RegistryObject<BlockItem> blockItem(String name, Supplier<? extends Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
