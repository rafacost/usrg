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

public class QuartzGenerator extends BaseGenerator {
    public QuartzGenerator(){
        super(15); // set to 15 as this generator uses lava
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, net.minecraft.world.item.Item.TooltipContext context, List<Component> tooltip, TooltipFlag flags) {

        if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            Component information = Component.translatable("block.generator.information");

            if (information != null) {
                String text = information.getString();

                if (Config.GENERATE_DUST.get()) {
                    text = text.replace("{item}", QuartzGeneratorTile.GENERATION_ITEM.getDescription().getString());
                } else {
                    text = text.replace("{item}", QuartzGeneratorTile.GENERATION_BLOCK.getName().getString());
                }
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
        return new QuartzGeneratorTile(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        if (!level.isClientSide) {
            return (level1, blockPos, blockState, t) -> {
                if (t instanceof QuartzGeneratorTile tile) {
                    tile.tickServer();
                }
            };
        }
        return null;
    }
}
