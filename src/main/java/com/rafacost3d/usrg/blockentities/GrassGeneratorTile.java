package com.rafacost3d.usrg.blockentities;

import com.rafacost3d.usrg.setup.Config;
import com.rafacost3d.usrg.setup.ModBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import static com.rafacost3d.usrg.setup.ModBlocks.*;

public class GrassGeneratorTile extends BaseGeneratorTile {

    public GrassGeneratorTile(Config.Tiers tiers, BlockEntityType<?> be, BlockPos pos, BlockState state) {
        super(tiers, be, pos, state);
    }
    
    public void tickServer() {
        tickServer(Blocks.GRASS_BLOCK);
    }

    public static GrassGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new GrassGeneratorTile(Config.tier1, ModBE.GRASS_T1_BE.get(), pos, state);
            case 2 -> new GrassGeneratorTile(Config.tier2, ModBE.GRASS_T2_BE.get(), pos, state);
            case 3 -> new GrassGeneratorTile(Config.tier3, ModBE.GRASS_T3_BE.get(), pos, state);
            case 4 -> new GrassGeneratorTile(Config.tier4, ModBE.GRASS_T4_BE.get(), pos, state);
            case 5 -> new GrassGeneratorTile(Config.tier5, ModBE.GRASS_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<GrassGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new GrassGeneratorTile(Config.tier1, ModBE.GRASS_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new GrassGeneratorTile(Config.tier2, ModBE.GRASS_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new GrassGeneratorTile(Config.tier3, ModBE.GRASS_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new GrassGeneratorTile(Config.tier4, ModBE.GRASS_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new GrassGeneratorTile(Config.tier5, ModBE.GRASS_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
