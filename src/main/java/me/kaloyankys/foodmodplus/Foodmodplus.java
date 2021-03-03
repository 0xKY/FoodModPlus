package me.kaloyankys.foodmodplus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Foodmodplus implements ModInitializer {

    public static final Item BURGER = new Item(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.BURGER));
    public static final Item PANCAKE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.PANCAKE));
    public static final Block PANCAKE_STACK = new PancakeStackBlock(FabricBlockSettings.of(Material.CAKE).strength(0.2f));
    public static final StatusEffect MAPLED_UP = new MapledUpEffect();
    public static final Item SYRUP = new Syrup(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item PIZZA_ITEM = new PizzaItem(new Item.Settings().group(ItemGroup.FOOD));
    public static final Block PIZZA = new Pizza(FabricBlockSettings.of(Material.CAKE).strength(0.2f));

    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "burger"),  BURGER);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "pancake"), PANCAKE);
        Registry.register(Registry.BLOCK, new Identifier("foodmodplus", "pancake_stack"), PANCAKE_STACK);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "pancake_stack"), new BlockItem(PANCAKE_STACK, new FabricItemSettings().group(ItemGroup.FOOD)));
        Registry.register(Registry.STATUS_EFFECT, new Identifier("foodmodplus", "mapled_up"), MAPLED_UP);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "syrup"), SYRUP);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","pizza_item"), PIZZA_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("foodmodplus","pizza"), PIZZA);
    }

}