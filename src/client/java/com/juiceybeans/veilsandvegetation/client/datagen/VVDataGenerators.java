package com.juiceybeans.veilsandvegetation.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class VVDataGenerators implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(VVRecipeGenerator::new);
        pack.addProvider(VVModelGenerator::new);
        pack.addProvider(VVLangGenerator::new);
        pack.addProvider(VVLootTableGenerator::new);
        pack.addProvider(VVBlockTagsGenerator::new);
        pack.addProvider(VVItemTagsGenerator::new);
	}
}
