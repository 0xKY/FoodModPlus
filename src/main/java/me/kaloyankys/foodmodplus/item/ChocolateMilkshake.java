package me.kaloyankys.foodmodplus.item;

import me.kaloyankys.foodmodplus.Foodmodplus;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class ChocolateMilkshake extends BaseJuiceItem {
    public ChocolateMilkshake(Settings settings) {
        super(settings);
    }

    @Override
    protected void onConsume(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient) {
            user.heal(10);

        }
    }
}
