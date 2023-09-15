package at.hyfabi.item;

import at.hyfabi.VienCousMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CreativeTabMenu {

	public static void addItemsToIngredientTabItemGroup(){
		FabricItemGroupBuilder.create(new Identifier(VienCousMod.MOD_ID, "semm"))
				.icon(()-> new ItemStack(ModItems.SEMMEL))
				.appendItems((itemStacks, itemGroup) -> {
					itemStacks.add(ModItems.SEMMEL.getDefaultStack());
					itemStacks.add(ModItems.KEBAB.getDefaultStack());
				})
				.build();
	}
}
