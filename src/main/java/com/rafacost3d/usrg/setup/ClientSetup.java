package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.USRG;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = USRG.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientSetup {
    private ClientSetup() {
    }

    @SubscribeEvent
    public static void init(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> ModBlocks.ALL.forEach(block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())));
    }
}
