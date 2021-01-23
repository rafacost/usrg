package com.rafacost3d.usrg.blocks;

import com.rafacost3d.usrg.setup.Config;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class CrushedNetherGenerator extends BaseGenerator {
    public CrushedNetherGenerator(){
        super();
        setRegistryName("nethercrushedgenerator");
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flags) {

        if (InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            TranslationTextComponent information = new TranslationTextComponent("block.generator.information");

            if (information != null) {
                ResourceLocation key = new ResourceLocation("exnihilosequentia:crushed_netherrack");
                String text = information.getString();

                if (ForgeRegistries.BLOCKS.containsKey(key)) {
                    Block block = ForgeRegistries.BLOCKS.getValue(key);
                    text = text.replace("{item}", block.getTranslatedName().getString());
                } else {
                    text =  text.replace("{item}", CrushedNetherGeneratorTile.GENERATION_BLOCK.getTranslatedName().getString());
                }
                text = text.replace("{ticks}", Config.BLOCK_PER_TICK.get().toString());

                tooltip.add(new StringTextComponent(text));
            }
        } else {
            tooltip.add(new TranslationTextComponent("block.holdshift.information"));
        }
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new CrushedNetherGeneratorTile();
    }
}
