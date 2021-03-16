package me.kaloyankys.foodmodplus;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent BURGER = new FoodComponent.Builder().hunger(12).saturationModifier(12).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 20), 0.8f).build();
    public static final FoodComponent PANCAKE = new FoodComponent.Builder().hunger(5).saturationModifier(4).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 10 * 10), 0.2f).build();
    public static final FoodComponent PIZZA_ITEM = new FoodComponent.Builder().hunger(7).saturationModifier(6).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(3).saturationModifier(4).build();
    public static final FoodComponent ICECREAM = new FoodComponent.Builder().hunger(11).saturationModifier(5).build();
    public static final FoodComponent FRIES_TWO = new FoodComponent.Builder().hunger(6).saturationModifier(3).snack().build();
}
