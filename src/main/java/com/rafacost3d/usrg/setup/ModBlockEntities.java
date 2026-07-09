package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.USRG;
import com.rafacost3d.usrg.blocks.ClayGeneratorTile;
import com.rafacost3d.usrg.blocks.CleanGeneratorTile;
import com.rafacost3d.usrg.blocks.CobblestoneGeneratorTile;
import com.rafacost3d.usrg.blocks.CrushedEndstoneGeneratorTile;
import com.rafacost3d.usrg.blocks.CrushedNetherGeneratorTile;
import com.rafacost3d.usrg.blocks.DirtGeneratorTile;
import com.rafacost3d.usrg.blocks.DustGeneratorTile;
import com.rafacost3d.usrg.blocks.DyeGeneratorTile;
import com.rafacost3d.usrg.blocks.EndstoneGeneratorTile;
import com.rafacost3d.usrg.blocks.FungusGeneratorTile;
import com.rafacost3d.usrg.blocks.GlowstoneGeneratorTile;
import com.rafacost3d.usrg.blocks.GrassGeneratorTile;
import com.rafacost3d.usrg.blocks.GravelGeneratorTile;
import com.rafacost3d.usrg.blocks.IceGeneratorTile;
import com.rafacost3d.usrg.blocks.NetherGeneratorTile;
import com.rafacost3d.usrg.blocks.ObsidianGeneratorTile;
import com.rafacost3d.usrg.blocks.OreGeneratorTile;
import com.rafacost3d.usrg.blocks.QuartzGeneratorTile;
import com.rafacost3d.usrg.blocks.RedstoneGeneratorTile;
import com.rafacost3d.usrg.blocks.SandGeneratorTile;
import com.rafacost3d.usrg.blocks.SnowGeneratorTile;
import com.rafacost3d.usrg.blocks.SoulGeneratorTile;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModBlockEntities {
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, USRG.MODID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ClayGeneratorTile>> CLAYGENERATOR_TILE =
            BLOCK_ENTITIES.register("claygenerator", () -> BlockEntityType.Builder.of(ClayGeneratorTile::new, ModBlocks.CLAYGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CobblestoneGeneratorTile>> COBBLEGENERATOR_TILE =
            BLOCK_ENTITIES.register("cobblegenerator", () -> BlockEntityType.Builder.of(CobblestoneGeneratorTile::new, ModBlocks.COBBLEGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CleanGeneratorTile>> CLEANGENERATOR_TILE =
            BLOCK_ENTITIES.register("cleangenerator", () -> BlockEntityType.Builder.of(CleanGeneratorTile::new, ModBlocks.CLEANGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DirtGeneratorTile>> DIRTGENERATOR_TILE =
            BLOCK_ENTITIES.register("dirtgenerator", () -> BlockEntityType.Builder.of(DirtGeneratorTile::new, ModBlocks.DIRTGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EndstoneGeneratorTile>> ENDGENERATOR_TILE =
            BLOCK_ENTITIES.register("endgenerator", () -> BlockEntityType.Builder.of(EndstoneGeneratorTile::new, ModBlocks.ENDGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FungusGeneratorTile>> FUNGUSGENERATOR_TILE =
            BLOCK_ENTITIES.register("fungusgenerator", () -> BlockEntityType.Builder.of(FungusGeneratorTile::new, ModBlocks.FUNGUSGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GlowstoneGeneratorTile>> GLOWSTONEGENERATOR_TILE =
            BLOCK_ENTITIES.register("glowstonegenerator", () -> BlockEntityType.Builder.of(GlowstoneGeneratorTile::new, ModBlocks.GLOWSTONEGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GrassGeneratorTile>> GRASSGENERATOR_TILE =
            BLOCK_ENTITIES.register("grassgenerator", () -> BlockEntityType.Builder.of(GrassGeneratorTile::new, ModBlocks.GRASSGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GravelGeneratorTile>> GRAVELGENERATOR_TILE =
            BLOCK_ENTITIES.register("gravelgenerator", () -> BlockEntityType.Builder.of(GravelGeneratorTile::new, ModBlocks.GRAVELGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<IceGeneratorTile>> ICEGENERATOR_TILE =
            BLOCK_ENTITIES.register("icegenerator", () -> BlockEntityType.Builder.of(IceGeneratorTile::new, ModBlocks.ICEGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<NetherGeneratorTile>> NETHERGENERATOR_TILE =
            BLOCK_ENTITIES.register("nethergenerator", () -> BlockEntityType.Builder.of(NetherGeneratorTile::new, ModBlocks.NETHERGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ObsidianGeneratorTile>> OBSIDIANGENERATOR_TILE =
            BLOCK_ENTITIES.register("obsidiangenerator", () -> BlockEntityType.Builder.of(ObsidianGeneratorTile::new, ModBlocks.OBSIDIANGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<QuartzGeneratorTile>> QUARTZGENERATOR_TILE =
            BLOCK_ENTITIES.register("quartzgenerator", () -> BlockEntityType.Builder.of(QuartzGeneratorTile::new, ModBlocks.QUARTZGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RedstoneGeneratorTile>> REDSTONEGENERATOR_TILE =
            BLOCK_ENTITIES.register("redstonegenerator", () -> BlockEntityType.Builder.of(RedstoneGeneratorTile::new, ModBlocks.REDSTONEGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SandGeneratorTile>> SANDGENERATOR_TILE =
            BLOCK_ENTITIES.register("sandgenerator", () -> BlockEntityType.Builder.of(SandGeneratorTile::new, ModBlocks.SANDGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SnowGeneratorTile>> SNOWGENERATOR_TILE =
            BLOCK_ENTITIES.register("snowgenerator", () -> BlockEntityType.Builder.of(SnowGeneratorTile::new, ModBlocks.SNOWGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SoulGeneratorTile>> SOULGENERATOR_TILE =
            BLOCK_ENTITIES.register("soulgenerator", () -> BlockEntityType.Builder.of(SoulGeneratorTile::new, ModBlocks.SOULGENERATOR.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DyeGeneratorTile>> DYEGENERATOR_TILE =
            BLOCK_ENTITIES.register("dyegenerator", () -> BlockEntityType.Builder.of(DyeGeneratorTile::new, ModBlocks.DYEGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OreGeneratorTile>> OREGENERATOR_TILE =
            BLOCK_ENTITIES.register("oregenerator", () -> BlockEntityType.Builder.of(OreGeneratorTile::new, ModBlocks.OREGENERATOR.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DustGeneratorTile>> DUSTGENERATOR_TILE =
            BLOCK_ENTITIES.register("dustgenerator", () -> BlockEntityType.Builder.of(DustGeneratorTile::new, ModBlocks.DUSTGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CrushedEndstoneGeneratorTile>> ENDCRUSHEDGENERATOR_TILE =
            BLOCK_ENTITIES.register("endcrushedgenerator", () -> BlockEntityType.Builder.of(CrushedEndstoneGeneratorTile::new, ModBlocks.ENDCRUSHEDGENERATOR.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CrushedNetherGeneratorTile>> NETHERCRUSHEDGENERATOR_TILE =
            BLOCK_ENTITIES.register("nethercrushedgenerator", () -> BlockEntityType.Builder.of(CrushedNetherGeneratorTile::new, ModBlocks.NETHERCRUSHEDGENERATOR.get()).build(null));

    private ModBlockEntities() {
    }

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CLAYGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COBBLEGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CLEANGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DIRTGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FUNGUSGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GLOWSTONEGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRASSGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRAVELGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ICEGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NETHERGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, OBSIDIANGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, QUARTZGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REDSTONEGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SANDGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SNOWGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SOULGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DYEGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, OREGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DUSTGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDCRUSHEDGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NETHERCRUSHEDGENERATOR_TILE.get(), (tile, side) -> tile.getHandler());
    }
}
