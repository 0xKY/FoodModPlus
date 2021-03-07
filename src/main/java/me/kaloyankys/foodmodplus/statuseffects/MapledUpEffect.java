package me.kaloyankys.foodmodplus.statuseffects;

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
                StatusEffectType.BENEFICIAL,
                0x8D572D);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).heal(1 << amplifier);
            ((PlayerEntity) entity).applyStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*20, 120, true, false));
            ((PlayerEntity) entity).applyStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 40, 6, true, false));
            ((PlayerEntity) entity).applyStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20*20, 120, true, false));
        }
    }




}