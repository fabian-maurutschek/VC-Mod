package at.hyfabi.datagen;

import at.hyfabi.block.ModBlocks;
import at.hyfabi.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PIKE_BLOCK);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.SEMMEL, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEBAB, Models.GENERATED);
		itemModelGenerator.register(ModItems.BERNER_SAUSAGE, Models.GENERATED);
		itemModelGenerator.register(ModItems.FRANKFURTER_SAUSAGE, Models.GENERATED);
	}
}
