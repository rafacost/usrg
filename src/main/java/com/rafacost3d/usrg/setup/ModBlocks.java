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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public final class ModBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, USRG.MODID);

    public static final RegistryObject<ClayGenerator> CLAYGENERATOR = BLOCKS.register("claygenerator", ClayGenerator::new);
    public static final RegistryObject<CobblestoneGenerator> COBBLEGENERATOR = BLOCKS.register("cobblegenerator", CobblestoneGenerator::new);
    public static final RegistryObject<CleanGenerator> CLEANGENERATOR = BLOCKS.register("cleangenerator", CleanGenerator::new);
    public static final RegistryObject<DirtGenerator> DIRTGENERATOR = BLOCKS.register("dirtgenerator", DirtGenerator::new);
    public static final RegistryObject<EndstoneGenerator> ENDGENERATOR = BLOCKS.register("endgenerator", EndstoneGenerator::new);
    public static final RegistryObject<FungusGenerator> FUNGUSGENERATOR = BLOCKS.register("fungusgenerator", FungusGenerator::new);
    public static final RegistryObject<GlowstoneGenerator> GLOWSTONEGENERATOR = BLOCKS.register("glowstonegenerator", GlowstoneGenerator::new);
    public static final RegistryObject<GrassGenerator> GRASSGENERATOR = BLOCKS.register("grassgenerator", GrassGenerator::new);
    public static final RegistryObject<GravelGenerator> GRAVELGENERATOR = BLOCKS.register("gravelgenerator", GravelGenerator::new);
    public static final RegistryObject<IceGenerator> ICEGENERATOR = BLOCKS.register("icegenerator", IceGenerator::new);
    public static final RegistryObject<NetherGenerator> NETHERGENERATOR = BLOCKS.register("nethergenerator", NetherGenerator::new);
    public static final RegistryObject<ObsidianGenerator> OBSIDIANGENERATOR = BLOCKS.register("obsidiangenerator", ObsidianGenerator::new);
    public static final RegistryObject<QuartzGenerator> QUARTZGENERATOR = BLOCKS.register("quartzgenerator", QuartzGenerator::new);
    public static final RegistryObject<RedstoneGenerator> REDSTONEGENERATOR = BLOCKS.register("redstonegenerator", RedstoneGenerator::new);
    public static final RegistryObject<SandGenerator> SANDGENERATOR = BLOCKS.register("sandgenerator", SandGenerator::new);
    public static final RegistryObject<SnowGenerator> SNOWGENERATOR = BLOCKS.register("snowgenerator", SnowGenerator::new);
    public static final RegistryObject<SoulGenerator> SOULGENERATOR = BLOCKS.register("soulgenerator", SoulGenerator::new);

    public static final RegistryObject<DyeGenerator> DYEGENERATOR = BLOCKS.register("dyegenerator", DyeGenerator::new);
    public static final RegistryObject<OreGenerator> OREGENERATOR = BLOCKS.register("oregenerator", OreGenerator::new);

    public static final RegistryObject<DustGenerator> DUSTGENERATOR = BLOCKS.register("dustgenerator", DustGenerator::new);
    public static final RegistryObject<CrushedEndstoneGenerator> ENDCRUSHEDGENERATOR = BLOCKS.register("endcrushedgenerator", CrushedEndstoneGenerator::new);
    public static final RegistryObject<CrushedNetherGenerator> NETHERCRUSHEDGENERATOR = BLOCKS.register("nethercrushedgenerator", CrushedNetherGenerator::new);

    public static final List<RegistryObject<? extends Block>> ALL = List.of(
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
