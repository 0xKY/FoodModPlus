package me.kaloyankys.foodmodplus;

import me.kaloyankys.foodmodplus.block.IceCream;
import me.kaloyankys.foodmodplus.block.PancakeStackBlock;
import me.kaloyankys.foodmodplus.block.Pizza;
import me.kaloyankys.foodmodplus.block.VanillaFlower;
import me.kaloyankys.foodmodplus.item.GlintJuice;
import me.kaloyankys.foodmodplus.item.PizzaItem;
import me.kaloyankys.foodmodplus.item.Syrup;
import me.kaloyankys.foodmodplus.statuseffects.MapledUpEffect;
import me.kaloyankys.foodmodplus.world.feature.VanillaFeature;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;

public class Foodmodplus implements ModInitializer {

    public static final Item BURGER = new Item(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.BURGER));
    public static final Item PANCAKE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.PANCAKE));
    public static final Block PANCAKE_STACK = new PancakeStackBlock(FabricBlockSettings.of(Material.CAKE).strength(0.2f));
    public static final StatusEffect MAPLED_UP = new MapledUpEffect();
    public static final Item SYRUP = new Syrup(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item PIZZA_ITEM = new PizzaItem(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.PIZZA_ITEM));
    public static final Block PIZZA = new Pizza(FabricBlockSettings.of(Material.CAKE).strength(0.2f));
    public static final Item CHEESE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.CHEESE));
    public static final Block ICECREAM = new IceCream(FabricBlockSettings.of(Material.SNOW_LAYER).strength(0.2f));
    public static final Block VANILLA_FLOWER = new VanillaFlower(FabricBlockSettings.of(Material.PLANT).strength(0f));
    private static final Feature<DefaultFeatureConfig> VANILLA_FEATURE = new VanillaFeature(DefaultFeatureConfig.CODEC);
    public static final ConfiguredFeature<?, ?> VANILLA_FEATURE_CONFIGURED = VANILLA_FEATURE.configure(FeatureConfig.DEFAULT)
            .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(5)));
    public static final Item GLINT_JUICE = new GlintJuice(new Item.Settings().group(ItemGroup.FOOD));

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
        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "pizza"), new BlockItem(PIZZA, new FabricItemSettings().group(ItemGroup.FOOD)));
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","cheese"), CHEESE);
        Registry.register(Registry.BLOCK, new Identifier("foodmodplus","icecream_block"), ICECREAM);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "icecream_block"), new BlockItem(ICECREAM, new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.ICECREAM)));
        Registry.register(Registry.BLOCK, new Identifier("foodmodplus","vanilla_flower"), VANILLA_FLOWER);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "vanilla_flower"), new BlockItem(VANILLA_FLOWER, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.FEATURE, new Identifier("foodmodplus", "vanilla_feature"), VANILLA_FEATURE);
        RegistryKey<ConfiguredFeature<?, ?>> stoneSpiral = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("foodmodplus", "vanilla_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, stoneSpiral.getValue(), VANILLA_FEATURE_CONFIGURED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA), GenerationStep.Feature.VEGETAL_DECORATION, stoneSpiral);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","glint_juice"), GLINT_JUICE);
    }

}