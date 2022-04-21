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

public class SandGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.SAND;

    public SandGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        tickServer(GENERATION_BLOCK);
    }

    public static SandGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new SandGeneratorTile(Config.tier1, ModBE.SAND_T1_BE.get(), pos, state);
            case 2 -> new SandGeneratorTile(Config.tier2, ModBE.SAND_T2_BE.get(), pos, state);
            case 3 -> new SandGeneratorTile(Config.tier3, ModBE.SAND_T3_BE.get(), pos, state);
            case 4 -> new SandGeneratorTile(Config.tier4, ModBE.SAND_T4_BE.get(), pos, state);
            case 5 -> new SandGeneratorTile(Config.tier5, ModBE.SAND_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<SandGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new SandGeneratorTile(Config.tier1, ModBE.SAND_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new SandGeneratorTile(Config.tier2, ModBE.SAND_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new SandGeneratorTile(Config.tier3, ModBE.SAND_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new SandGeneratorTile(Config.tier4, ModBE.SAND_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new SandGeneratorTile(Config.tier5, ModBE.SAND_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
