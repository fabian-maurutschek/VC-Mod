package at.hyfabi.datagen;

import at.hyfabi.item.ModItemGroup;
import at.hyfabi.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
	public ModRecipeProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
		/*ShapelessRecipeJsonBuilder.create(ModItems.SEMMEL, 1)
				.input(Items.EGG, 2)
				.input(Items.WHEAT, 2)
				.criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
				.criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
				.offerTo(exporter, new Identifier(getRecipeName(ModItems.SEMMEL)));*/

		ShapelessRecipeJsonBuilder.create(ModItems.SEMMEL, 1)
				.input(Items.WHEAT, 2)
				.input(Items.EGG, 1)
				.criterion(RecipeProvider.hasItem(Items.WHEAT), RecipeProvider.conditionsFromItem(Items.WHEAT))
				.criterion(RecipeProvider.hasItem(Items.EGG), RecipeProvider.conditionsFromItem(Items.EGG))
				.offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.SEMMEL)));

		/*offerShapelessRecipe(exporter, ModItems.SEMMEL, ModItems.KEBAP, ModItemGroup.VIENCOUS.getName(), 1);*/
	}
}
