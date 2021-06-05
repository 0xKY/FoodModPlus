package me.kaloyankys.foodmodplus.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Pancake extends Item {

    public Pancake() {
        super(new Properties().maxStackSize(6)

                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(5).saturation(4).effect(new EffectInstance(Effects.SLOWNESS, 10 * 10), 0.2f).build()
                ));

    }
}