package at.hyfabi.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponent {

	public static final FoodComponent KEBAB = new FoodComponent.Builder()
			.hunger(5)
			.saturationModifier(10)
			.statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 10, 2), 1)
			.build();

	public static final FoodComponent BERNER_SAUSAGE = new FoodComponent.Builder()
			.hunger(3)
			.saturationModifier(4)
			.build();

	public static final FoodComponent FRANKFURTER_SAUSAGE = new FoodComponent.Builder()
			.hunger(3)
			.saturationModifier(3)
			.build();

}
