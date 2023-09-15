package at.hyfabi.villager;

import at.hyfabi.VienCousMod;
import at.hyfabi.block.ModBlocks;
import at.hyfabi.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillager {

	public static final PointOfInterestType PIKE_POI = registerPOI("pike_poi", ModBlocks.PIKE_BLOCK);
	public static final VillagerProfession KEPAB_MAN = registerVillagerProfession("kebap_man",
			RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(VienCousMod.MOD_ID, "pike_poi")));

	public static VillagerProfession registerVillagerProfession(String name, RegistryKey<PointOfInterestType> type){
		return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(VienCousMod.MOD_ID, name),
				VillagerProfessionBuilder.create().id(new Identifier(VienCousMod.MOD_ID, name)).workstation(type)
						.workSound(SoundEvents.ENTITY_VILLAGER_WORK_BUTCHER).build());
	}

	public static PointOfInterestType registerPOI(String name, Block block){
		return PointOfInterestHelper.register(new Identifier(VienCousMod.MOD_ID, name), 1, 1, block);
	}

	public static void registerVillagers(){
		VienCousMod.LOGGER.info("Registering Villagers");
		registerTrades();
	}

	public static void registerTrades(){
		TradeOfferHelper.registerVillagerOffers(KEPAB_MAN, 1, factories -> factories.add((entity, random) ->
						new TradeOffer(
							new ItemStack(Items.EMERALD, 3),
							new ItemStack(ModItems.KEBAB, 1),
						6, 2, 0.02f)
		));
	}
}
