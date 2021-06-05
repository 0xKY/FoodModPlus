package me.kaloyankys.foodmodplus;

import me.kaloyankys.foodmodplus.block.BlockBase;
import me.kaloyankys.foodmodplus.block.IceCream;
import me.kaloyankys.foodmodplus.block.PancakeStackBlock;
import me.kaloyankys.foodmodplus.item.Burger;
import me.kaloyankys.foodmodplus.item.Pancake;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Foodmodplus.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Foodmodplus.MOD_ID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
    //Items
    public static final RegistryObject<Item> BURGER = ITEMS.register("burger", Burger::new);
    public static final RegistryObject<Item> PANCAKE = ITEMS.register("pancake", Pancake::new);

    //Blocks
    public static final RegistryObject<Block> ICECREAM = BLOCKS.register("icecream_block", IceCream::new);
    public static final RegistryObject<Block> CHOCOLATE_ICECREAM = BLOCKS.register("chocolate_icecream", IceCream::new);
    public static final RegistryObject<Block> SWEETBERRY_ICECREAM = BLOCKS.register("sweetberry_icecream", IceCream::new);
    public static final RegistryObject<Block> PANCAKE_STACK = BLOCKS.register("pancake_stack", PancakeStackBlock::new);


    //Block Items
    public static final RegistryObject<Item> ICECREAM_ITEM = ITEMS.register("icecream_block", () -> new BlockBase(ICECREAM.get()));
   public static final RegistryObject<Item> CHOCOLATE_ICECREAM_ITEM = ITEMS.register("chocolate_icecream", () -> new BlockBase(CHOCOLATE_ICECREAM.get()));
    public static final RegistryObject<Item> SWEETBERRY_ICECREAM_ITEM = ITEMS.register("sweetberry_icecream", () -> new BlockBase(SWEETBERRY_ICECREAM.get()));
    public static final RegistryObject<Item> PANCAKE_STACK_ITEM = ITEMS.register("pancake_stack", () -> new BlockBase(PANCAKE_STACK.get()));

    /*
    public static final StatusEffect MAPLED_UP = new MapledUpEffect();
    public static final Item SYRUP = new Syrup(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
    public static final Item PIZZA_ITEM = new PizzaItem(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.PIZZA_ITEM));
    public static final Block PIZZA = new Pizza(FabricBlockSettings.of(Material.CAKE).strength(0.2f));
    public static final Item CHEESE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.CHEESE));
    public static final Block VANILLA_FLOWER = new VanillaFlower(FabricBlockSettings.of(Material.PLANT).strength(0f));
    private static final Feature<DefaultFeatureConfig> VANILLA_FEATURE = new VanillaFeature(DefaultFeatureConfig.CODEC);
    public static final ConfiguredFeature<?, ?> VANILLA_FEATURE_CONFIGURED = VANILLA_FEATURE.configure(FeatureConfig.DEFAULT)
            .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(5)));
    public static final Item GLINT_JUICE = new GlintJuice(new Item.Settings().group(ItemGroup.FOOD).maxCount(1));
    public static final StatusEffect BERRY_POWER = new BerryPowerEffect();
    public static final Item SWEETBERRY_MILKSHAKE = new SweetberryMilkshake(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item SWEETBERRY_JAM = new SweetberryJam(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item MILKSHAKE = new Milkshake(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item FRIES = new Fries(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item FRIES_ONE = new FriesOne(new Item.Settings());
    public static final Item FRIES_TWO = new Item(new Item.Settings().food(ModFoodComponents.FRIES_TWO));
    public static final Item CHEESY_FRIES = new CheesyFries(new Item.Settings().group(ItemGroup.FOOD));

    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "pancake"), PANCAKE);
        Registry.register(Registry.BLOCK, new Identifier("foodmodplus", "pancake_stack"), PANCAKE_STACK);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "pancake_stack"), new BlockItem(PANCAKE_STACK, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
        Registry.register(Registry.STATUS_EFFECT, new Identifier("foodmodplus", "mapled_up"), MAPLED_UP);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "syrup"), SYRUP);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","pizza_item"), PIZZA_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("foodmodplus","pizza"), PIZZA);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "pizza"), new BlockItem(PIZZA, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","cheese"), CHEESE);
        Registry.register(Registry.BLOCK, new Identifier("foodmodplus","vanilla_flower"), VANILLA_FLOWER);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus", "vanilla_flower"), new BlockItem(VANILLA_FLOWER, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.FEATURE, new Identifier("foodmodplus", "vanilla_feature"), VANILLA_FEATURE);
        RegistryKey<ConfiguredFeature<?, ?>> vanillaFeature = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("foodmodplus", "vanilla_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, vanillaFeature.getValue(), VANILLA_FEATURE_CONFIGURED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA), GenerationStep.Feature.VEGETAL_DECORATION, vanillaFeature);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","glint_juice"), GLINT_JUICE);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","chocolate_milkshake"), CHOCOLATE_MILKSHAKE);
        Registry.register(Registry.STATUS_EFFECT, new Identifier("foodmodplus", "berry_power"), BERRY_POWER);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","sweetberry_milkshake"), SWEETBERRY_MILKSHAKE);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","sweetberry_jam"), SWEETBERRY_JAM);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","milkshake"), MILKSHAKE);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","fries"), FRIES);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","fries_one"), FRIES_ONE);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","fries_two"), FRIES_TWO);
        Registry.register(Registry.ITEM, new Identifier("foodmodplus","cheesy_fries"), CHEESY_FRIES);
    }*/
}