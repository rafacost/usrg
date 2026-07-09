package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.USRG;
import com.rafacost3d.usrg.blocks.ClayGenerator;
import com.rafacost3d.usrg.blocks.CleanGenerator;
import com.rafacost3d.usrg.blocks.CobblestoneGenerator;
import com.rafacost3d.usrg.blocks.CrushedEndstoneGenerator;
import com.rafacost3d.usrg.blocks.CrushedNetherGenerator;
import com.rafacost3d.usrg.blocks.DirtGenerator;
import com.rafacost3d.usrg.blocks.DustGenerator;
import com.rafacost3d.usrg.blocks.DyeGenerator;
import com.rafacost3d.usrg.blocks.EndstoneGenerator;
import com.rafacost3d.usrg.blocks.FungusGenerator;
import com.rafacost3d.usrg.blocks.GlowstoneGenerator;
import com.rafacost3d.usrg.blocks.GrassGenerator;
import com.rafacost3d.usrg.blocks.GravelGenerator;
import com.rafacost3d.usrg.blocks.IceGenerator;
import com.rafacost3d.usrg.blocks.NetherGenerator;
import com.rafacost3d.usrg.blocks.ObsidianGenerator;
import com.rafacost3d.usrg.blocks.OreGenerator;
import com.rafacost3d.usrg.blocks.QuartzGenerator;
import com.rafacost3d.usrg.blocks.RedstoneGenerator;
import com.rafacost3d.usrg.blocks.SandGenerator;
import com.rafacost3d.usrg.blocks.SnowGenerator;
import com.rafacost3d.usrg.blocks.SoulGenerator;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public final class ModBlocks {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(USRG.MODID);

    public static final DeferredBlock<ClayGenerator> CLAYGENERATOR = BLOCKS.register("claygenerator", ClayGenerator::new);
    public static final DeferredBlock<CobblestoneGenerator> COBBLEGENERATOR = BLOCKS.register("cobblegenerator", CobblestoneGenerator::new);
    public static final DeferredBlock<CleanGenerator> CLEANGENERATOR = BLOCKS.register("cleangenerator", CleanGenerator::new);
    public static final DeferredBlock<DirtGenerator> DIRTGENERATOR = BLOCKS.register("dirtgenerator", DirtGenerator::new);
    public static final DeferredBlock<EndstoneGenerator> ENDGENERATOR = BLOCKS.register("endgenerator", EndstoneGenerator::new);
    public static final DeferredBlock<FungusGenerator> FUNGUSGENERATOR = BLOCKS.register("fungusgenerator", FungusGenerator::new);
    public static final DeferredBlock<GlowstoneGenerator> GLOWSTONEGENERATOR = BLOCKS.register("glowstonegenerator", GlowstoneGenerator::new);
    public static final DeferredBlock<GrassGenerator> GRASSGENERATOR = BLOCKS.register("grassgenerator", GrassGenerator::new);
    public static final DeferredBlock<GravelGenerator> GRAVELGENERATOR = BLOCKS.register("gravelgenerator", GravelGenerator::new);
    public static final DeferredBlock<IceGenerator> ICEGENERATOR = BLOCKS.register("icegenerator", IceGenerator::new);
    public static final DeferredBlock<NetherGenerator> NETHERGENERATOR = BLOCKS.register("nethergenerator", NetherGenerator::new);
    public static final DeferredBlock<ObsidianGenerator> OBSIDIANGENERATOR = BLOCKS.register("obsidiangenerator", ObsidianGenerator::new);
    public static final DeferredBlock<QuartzGenerator> QUARTZGENERATOR = BLOCKS.register("quartzgenerator", QuartzGenerator::new);
    public static final DeferredBlock<RedstoneGenerator> REDSTONEGENERATOR = BLOCKS.register("redstonegenerator", RedstoneGenerator::new);
    public static final DeferredBlock<SandGenerator> SANDGENERATOR = BLOCKS.register("sandgenerator", SandGenerator::new);
    public static final DeferredBlock<SnowGenerator> SNOWGENERATOR = BLOCKS.register("snowgenerator", SnowGenerator::new);
    public static final DeferredBlock<SoulGenerator> SOULGENERATOR = BLOCKS.register("soulgenerator", SoulGenerator::new);

    public static final DeferredBlock<DyeGenerator> DYEGENERATOR = BLOCKS.register("dyegenerator", DyeGenerator::new);
    public static final DeferredBlock<OreGenerator> OREGENERATOR = BLOCKS.register("oregenerator", OreGenerator::new);

    public static final DeferredBlock<DustGenerator> DUSTGENERATOR = BLOCKS.register("dustgenerator", DustGenerator::new);
    public static final DeferredBlock<CrushedEndstoneGenerator> ENDCRUSHEDGENERATOR = BLOCKS.register("endcrushedgenerator", CrushedEndstoneGenerator::new);
    public static final DeferredBlock<CrushedNetherGenerator> NETHERCRUSHEDGENERATOR = BLOCKS.register("nethercrushedgenerator", CrushedNetherGenerator::new);

    public static final List<DeferredBlock<? extends Block>> ALL = List.of(
            CLAYGENERATOR,
            COBBLEGENERATOR,
            CLEANGENERATOR,
            DIRTGENERATOR,
            ENDGENERATOR,
            FUNGUSGENERATOR,
            GLOWSTONEGENERATOR,
            GRASSGENERATOR,
            GRAVELGENERATOR,
            ICEGENERATOR,
            NETHERGENERATOR,
            OBSIDIANGENERATOR,
            QUARTZGENERATOR,
            REDSTONEGENERATOR,
            SANDGENERATOR,
            SNOWGENERATOR,
            SOULGENERATOR,
            DYEGENERATOR,
            OREGENERATOR,
            DUSTGENERATOR,
            ENDCRUSHEDGENERATOR,
            NETHERCRUSHEDGENERATOR
    );

    private ModBlocks() {
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
