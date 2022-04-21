package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.blockentities.CrushedEndstoneGeneratorTile;
import com.rafacost3d.usrg.setup.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.TooltipFlag;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.BlockGetter;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class CrushedEndstoneGenerator extends BaseGenerator {
    private final int tier;
    public CrushedEndstoneGenerator(int Tier){
        super(15); // set to 15 as this generator uses lava
        this.tier = Tier;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flags) {

        if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            TranslatableComponent information = new TranslatableComponent("block.generator.information");

            ResourceLocation key = new ResourceLocation("exnihilosequentia:crushed_end_stone");
            String text = information.getString();

            if (ForgeRegistries.BLOCKS.containsKey(key)) {
                Block block = ForgeRegistries.BLOCKS.getValue(key);
                text = text.replace("{item}", block.getName().getString());
            } else {
                text = text.replace("{item}", CrushedEndstoneGeneratorTile.GENERATION_BLOCK.getName().getString());
            }
            text = text.replace("{ticks}", Config.BLOCK_PER_TICK.get().toString());

            tooltip.add(new TextComponent(text));
        } else {
            tooltip.add(new TranslatableComponent("block.holdshift.information"));
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return CrushedEndstoneGeneratorTile.create(this.tier, pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        if (!level.isClientSide) {
            return (level1, blockPos, blockState, t) -> {
                if (t instanceof CrushedEndstoneGeneratorTile tile) {
                    tile.tickServer();
                }
            };
        }
        return null;
    }
}
