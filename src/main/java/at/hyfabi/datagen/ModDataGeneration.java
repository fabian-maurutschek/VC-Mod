package at.hyfabi.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import java.util.logging.Logger;

public class ModDataGeneration implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		Logger.getAnonymousLogger().info("Start");
		fabricDataGenerator.addProvider(ModBlockTagProvider::new);
		fabricDataGenerator.addProvider(ModItemTagProvider::new);
		fabricDataGenerator.addProvider(ModLootTableProvider::new);

		fabricDataGenerator.addProvider(ModRecipeProvider::new);
		fabricDataGenerator.addProvider(ModModelProvider::new);
		Logger.getAnonymousLogger().info("End");
	}
}
