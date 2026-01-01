package net.identidade.crimsomania.Block.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties FLESH_PLANT_MEAT = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.20f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600), 0.8f)
            .build();
}
