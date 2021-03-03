package me.kaloyankys.foodmodplus;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.PotionEntity;

public class MapledUpEffect extends StatusEffect {
    public MapledUpEffect() {
        super(
                StatusEffectType.BENEFICIAL, // whether beneficial or harmful for entities
                0x8D572D); // color in RGB
    }

        // This method is called every tick to check weather it should apply the status effect or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }

    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).heal(1 << amplifier); // Higher amplifier gives you EXP faster
            ((PlayerEntity) entity).applyStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*20, 120, true, false));
            ((PlayerEntity) entity).applyStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 40, 6, true, false));
            ((PlayerEntity) entity).applyStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20*20, 120, true, false));
        }
    }




}