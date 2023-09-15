package at.hyfabi.item;

import at.hyfabi.VienCousMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


	public static final Item SEMMEL = registerItem("semmel", new Item(new FabricItemSettings().group(ModItemGroup.VIENCOUS_FOOD)));
	public static final Item KEBAB = registerItem("kebab", new Item(new FabricItemSettings().group(ModItemGroup.VIENCOUS_FOOD).food(ModFoodComponent.KEBAB)));
	public static final Item BERNER_SAUSAGE = registerItem("berner_sausage", new Item(new FabricItemSettings().group(ModItemGroup.VIENCOUS_FOOD).food(ModFoodComponent.BERNER_SAUSAGE)));
	public static final Item FRANKFURTER_SAUSAGE = registerItem("frankfurter_sausage", new Item(new FabricItemSettings().group(ModItemGroup.VIENCOUS_FOOD).food(ModFoodComponent.FRANKFURTER_SAUSAGE)));

	public static void registerModItems(){
		VienCousMod.LOGGER.info("Reg Items");
	}

	private static Item registerItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(VienCousMod.MOD_ID, name), item);
	}

}