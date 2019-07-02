package com.teamabnormals.betterinsomnia.common.potions;

import com.teamabnormals.betterinsomnia.core.util.Reference;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.PotionInstant;
import net.minecraft.stats.StatList;
import net.minecraft.stats.StatisticsManagerServer;
import net.minecraft.util.ResourceLocation;

public class PotionInsomnia extends PotionInstant {

    public static final int BASE_VALUE = 24000;

    public PotionInsomnia(String name) {
        super(true, 0xa075b4);
        this.setRegistryName(new ResourceLocation(Reference.MODID, name));
    }

    @Override
    public void performEffect(EntityLivingBase entityLivingBase, int amplifier) {
        if (entityLivingBase instanceof EntityPlayerMP) {
            EntityPlayerMP playerMP = (EntityPlayerMP)entityLivingBase;
            StatisticsManagerServer statisticsManager = playerMP.getStats();
            statisticsManager.increment(playerMP, StatList.CUSTOM.get(StatList.TIME_SINCE_REST), BASE_VALUE * (amplifier + 1));
        }
    }
}
