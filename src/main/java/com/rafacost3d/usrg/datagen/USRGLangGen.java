package com.rafacost3d.usrg.datagen;

import com.rafacost3d.usrg.USRG;
import com.rafacost3d.usrg.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.text.WordUtils;

import java.util.ArrayList;
import java.util.List;

public class USRGLangGen extends LanguageProvider {
    public USRGLangGen(DataGenerator generator) {
        super(generator, USRG.MODID, "en_us");
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void addTranslations() {
        List<RegistryObject<Block>> blockList = new ArrayList<>(ModBlocks.BLOCKS.getEntries());
        for (RegistryObject<Block> blockObject : blockList) {
            Block block = blockObject.get();
            add(block, WordUtils.capitalizeFully(block.getName().getString().replace("_", " ").replace("block.usrg.", "")));
        }
        add("block.holdshift.information", "Hold \u00A7eShift \u00A7ffor more information.");
        add("block.generator.information", "Generates \u00A7e1 x {item} \u00A7fevery generation cycle of \u00A7e{ticks} \u00A7fticks.");
        add("block.dyegenerator.information", "Generates \u00A7e1 x random dye \u00A7fevery generation cycle of \u00A7e{ticks} \u00A7fticks.");
        add("block.oregenerator.information", "Generates \u00A7e1 x random item \u00A7fevery generation cycle of \u00A7e{ticks} \u00A7fticks.");
        add("itemGroup.usrg", "USRGenerators");

    }
}
