package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.USRG;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public final class ModItems {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(USRG.MODID);

    public static final DeferredItem<BlockItem> CLAYGENERATOR = blockItem("claygenerator", ModBlocks.CLAYGENERATOR);
    public static final DeferredItem<BlockItem> COBBLEGENERATOR = blockItem("cobblegenerator", ModBlocks.COBBLEGENERATOR);
    public static final DeferredItem<BlockItem> CLEANGENERATOR = blockItem("cleangenerator", ModBlocks.CLEANGENERATOR);
    public static final DeferredItem<BlockItem> DIRTGENERATOR = blockItem("dirtgenerator", ModBlocks.DIRTGENERATOR);
    public static final DeferredItem<BlockItem> ENDGENERATOR = blockItem("endgenerator", ModBlocks.ENDGENERATOR);
    public static final DeferredItem<BlockItem> FUNGUSGENERATOR = blockItem("fungusgenerator", ModBlocks.FUNGUSGENERATOR);
    public static final DeferredItem<BlockItem> GLOWSTONEGENERATOR = blockItem("glowstonegenerator", ModBlocks.GLOWSTONEGENERATOR);
    public static final DeferredItem<BlockItem> GRASSGENERATOR = blockItem("grassgenerator", ModBlocks.GRASSGENERATOR);
    public static final DeferredItem<BlockItem> GRAVELGENERATOR = blockItem("gravelgenerator", ModBlocks.GRAVELGENERATOR);
    public static final DeferredItem<BlockItem> ICEGENERATOR = blockItem("icegenerator", ModBlocks.ICEGENERATOR);
    public static final DeferredItem<BlockItem> NETHERGENERATOR = blockItem("nethergenerator", ModBlocks.NETHERGENERATOR);
    public static final DeferredItem<BlockItem> OBSIDIANGENERATOR = blockItem("obsidiangenerator", ModBlocks.OBSIDIANGENERATOR);
    public static final DeferredItem<BlockItem> QUARTZGENERATOR = blockItem("quartzgenerator", ModBlocks.QUARTZGENERATOR);
    public static final DeferredItem<BlockItem> REDSTONEGENERATOR = blockItem("redstonegenerator", ModBlocks.REDSTONEGENERATOR);
    public static final DeferredItem<BlockItem> SANDGENERATOR = blockItem("sandgenerator", ModBlocks.SANDGENERATOR);
    public static final DeferredItem<BlockItem> SNOWGENERATOR = blockItem("snowgenerator", ModBlocks.SNOWGENERATOR);
    public static final DeferredItem<BlockItem> SOULGENERATOR = blockItem("soulgenerator", ModBlocks.SOULGENERATOR);

    public static final DeferredItem<BlockItem> DYEGENERATOR = blockItem("dyegenerator", ModBlocks.DYEGENERATOR);
    public static final DeferredItem<BlockItem> OREGENERATOR = blockItem("oregenerator", ModBlocks.OREGENERATOR);

    public static final DeferredItem<BlockItem> DUSTGENERATOR = blockItem("dustgenerator", ModBlocks.DUSTGENERATOR);
    public static final DeferredItem<BlockItem> ENDCRUSHEDGENERATOR = blockItem("endcrushedgenerator", ModBlocks.ENDCRUSHEDGENERATOR);
    public static final DeferredItem<BlockItem> NETHERCRUSHEDGENERATOR = blockItem("nethercrushedgenerator", ModBlocks.NETHERCRUSHEDGENERATOR);

    private ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static DeferredItem<BlockItem> blockItem(String name, Supplier<? extends Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
