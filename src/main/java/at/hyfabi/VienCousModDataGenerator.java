package at.hyfabi;

import at.hyfabi.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class VienCousModDataGenerator implements DataGeneratorEntrypoint {


	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		fabricDataGenerator.addProvider(ModBlockTagProvider::new);
		fabricDataGenerator.addProvider(ModItemTagProvider::new);
		fabricDataGenerator.addProvider(ModLootTableProvider::new);
		fabricDataGenerator.addProvider(ModModelProvider::new);
		fabricDataGenerator.addProvider(ModRecipeProvider::new);
	}
}
