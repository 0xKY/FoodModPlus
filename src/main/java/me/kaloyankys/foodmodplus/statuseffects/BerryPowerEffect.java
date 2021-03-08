package me.kaloyankys.foodmodplus.statuseffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class BerryPowerEffect extends StatusEffect {
    public BerryPowerEffect() {
        super(
                StatusEffectType.BENEFICIAL,
                0xb33b32);
    }


    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).applyStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*20, 4, true, false));
        }
    }
}