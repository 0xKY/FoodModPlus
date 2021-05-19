package me.kaloyankys.foodmodplus.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Burger extends Item {

    public Burger() {
        super(new Properties()

                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(12)
                        .saturation(12)
                        .effect(new EffectInstance(Effects.SLOWNESS, 20 * 20), 0.8f)
                        .build()
                ));
    }
}
