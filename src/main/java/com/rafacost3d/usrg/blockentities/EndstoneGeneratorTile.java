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

public class EndstoneGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.END_STONE;

    public EndstoneGeneratorTile(Config.Tiers tiers, BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(tiers, type, pos, state);
    }

    public void tickServer() {
        tickServer(GENERATION_BLOCK);
    }

    public static EndstoneGeneratorTile create(int Tier, BlockPos pos, BlockState state) {
        return switch(Tier) {
            case 1 -> new EndstoneGeneratorTile(Config.tier1, ModBE.ENDSTONE_T1_BE.get(), pos, state);
            case 2 -> new EndstoneGeneratorTile(Config.tier2, ModBE.ENDSTONE_T2_BE.get(), pos, state);
            case 3 -> new EndstoneGeneratorTile(Config.tier3, ModBE.ENDSTONE_T3_BE.get(), pos, state);
            case 4 -> new EndstoneGeneratorTile(Config.tier4, ModBE.ENDSTONE_T4_BE.get(), pos, state);
            case 5 -> new EndstoneGeneratorTile(Config.tier5, ModBE.ENDSTONE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

    public static BlockEntityType.BlockEntitySupplier<EndstoneGeneratorTile> makeSupplier(int Tier) {
        return switch(Tier) {
            case 1 -> (pos, state) -> new EndstoneGeneratorTile(Config.tier1, ModBE.ENDSTONE_T1_BE.get(), pos, state);
            case 2 -> (pos, state) -> new EndstoneGeneratorTile(Config.tier2, ModBE.ENDSTONE_T2_BE.get(), pos, state);
            case 3 -> (pos, state) -> new EndstoneGeneratorTile(Config.tier3, ModBE.ENDSTONE_T3_BE.get(), pos, state);
            case 4 -> (pos, state) -> new EndstoneGeneratorTile(Config.tier4, ModBE.ENDSTONE_T4_BE.get(), pos, state);
            case 5 -> (pos, state) -> new EndstoneGeneratorTile(Config.tier5, ModBE.ENDSTONE_T5_BE.get(), pos, state);
            default -> throw new IllegalArgumentException("Unknown Tier: " + Tier);
        };
    }

}
