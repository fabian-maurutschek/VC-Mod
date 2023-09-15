package at.hyfabi;

import at.hyfabi.block.ModBlocks;
import at.hyfabi.item.CreativeTabMenu;
import at.hyfabi.item.ModItems;
import at.hyfabi.villager.ModVillager;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VienCousMod implements ModInitializer {

	public static final String MOD_ID = "viencous";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		CreativeTabMenu.addItemsToIngredientTabItemGroup();
		ModBlocks.registerModBlocks();
		ModVillager.registerVillagers();
	}
}