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

public class DirtGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.DIRT;

    public DirtGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        tickServer(GENERATION_BLOCK);
    }

    public static DirtGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new DirtGeneratorTile(Config.tier1, ModBE.DIRT_T1_BE.get(), pos, state);
            case 2 -> new DirtGeneratorTile(Config.tier2, ModBE.DIRT_T2_BE.get(), pos, state);
            case 3 -> new DirtGeneratorTile(Config.tier3, ModBE.DIRT_T3_BE.get(), pos, state);
            case 4 -> new DirtGeneratorTile(Config.tier4, ModBE.DIRT_T4_BE.get(), pos, state);
            case 5 -> new DirtGeneratorTile(Config.tier5, ModBE.DIRT_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<DirtGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new DirtGeneratorTile(Config.tier1, ModBE.DIRT_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new DirtGeneratorTile(Config.tier2, ModBE.DIRT_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new DirtGeneratorTile(Config.tier3, ModBE.DIRT_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new DirtGeneratorTile(Config.tier4, ModBE.DIRT_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new DirtGeneratorTile(Config.tier5, ModBE.DIRT_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }
}
