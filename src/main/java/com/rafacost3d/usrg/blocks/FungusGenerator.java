package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.TooltipFlag;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.BlockGetter;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class FungusGenerator extends BaseGenerator {
    public FungusGenerator(){
        super(8); // set to 8 as this generator only uses water
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, net.minecraft.world.item.Item.TooltipContext context, List<Component> tooltip, TooltipFlag flags) {

        if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            Component information = Component.translatable("block.generator.information");

            if (information != null) {
                String text = information.getString();

                text = text.replace("{item}", FungusGeneratorTile.GENERATION_BLOCK.getName().getString());
                text = text.replace("{ticks}", Config.BLOCK_PER_TICK.get().toString());

                tooltip.add(Component.literal(text));
            }
        } else {
            tooltip.add(Component.translatable("block.holdshift.information"));
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new FungusGeneratorTile(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        if (!level.isClientSide) {
            return (level1, blockPos, blockState, t) -> {
                if (t instanceof FungusGeneratorTile tile) {
                    tile.tickServer();
                }
            };
        }
        return null;
    }
}
