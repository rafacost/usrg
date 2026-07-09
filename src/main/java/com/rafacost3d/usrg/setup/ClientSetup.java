package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.USRG;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = USRG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientSetup {
    private ClientSetup() {
    }

    @SubscribeEvent
    public static void init(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> ModBlocks.ALL.forEach(block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())));
    }
}
