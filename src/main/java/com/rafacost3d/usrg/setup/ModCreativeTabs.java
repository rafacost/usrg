package com.rafacost3d.usrg.setup;

import com.rafacost3d.usrg.USRG;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, USRG.MODID);

    public static final RegistryObject<CreativeModeTab> USRG_TAB = CREATIVE_TABS.register("usrg", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.usrg"))
            .icon(() -> new ItemStack(ModBlocks.COBBLEGENERATOR.get()))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.COBBLEGENERATOR.get());
                output.accept(ModItems.CLEANGENERATOR.get());
                output.accept(ModItems.CLAYGENERATOR.get());
                output.accept(ModItems.DIRTGENERATOR.get());
                output.accept(ModItems.ENDGENERATOR.get());
                output.accept(ModItems.FUNGUSGENERATOR.get());
                output.accept(ModItems.GLOWSTONEGENERATOR.get());
                output.accept(ModItems.GRASSGENERATOR.get());
                output.accept(ModItems.GRAVELGENERATOR.get());
                output.accept(ModItems.ICEGENERATOR.get());
                output.accept(ModItems.NETHERGENERATOR.get());
                output.accept(ModItems.OBSIDIANGENERATOR.get());
                output.accept(ModItems.QUARTZGENERATOR.get());
                output.accept(ModItems.REDSTONEGENERATOR.get());
                output.accept(ModItems.SANDGENERATOR.get());
                output.accept(ModItems.SNOWGENERATOR.get());
                output.accept(ModItems.SOULGENERATOR.get());

                acceptIf(output, Config.ENABLE_DYE_GENERATOR.get(), ModItems.DYEGENERATOR);
                acceptIf(output, Config.ENABLE_ORE_GENERATOR.get(), ModItems.OREGENERATOR);
                acceptIf(output, blockExists("exnihilosequentia", "dust"), ModItems.DUSTGENERATOR);
                acceptIf(output, blockExists("exnihilosequentia", "crushed_end_stone"), ModItems.ENDCRUSHEDGENERATOR);
                acceptIf(output, blockExists("exnihilosequentia", "crushed_netherrack"), ModItems.NETHERCRUSHEDGENERATOR);
            })
            .build());

    private ModCreativeTabs() {
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }

    private static void acceptIf(CreativeModeTab.Output output, boolean condition, RegistryObject<? extends Item> item) {
        if (condition) {
            output.accept(item.get());
        }
    }

    private static boolean blockExists(String namespace, String path) {
        return ForgeRegistries.BLOCKS.containsKey(new ResourceLocation(namespace, path));
    }
}
