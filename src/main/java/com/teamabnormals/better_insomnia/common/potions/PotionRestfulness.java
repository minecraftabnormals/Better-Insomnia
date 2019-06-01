package com.teamabnormals.better_insomnia.common.potions;

import com.teamabnormals.better_insomnia.core.BetterInsomnia;
import com.teamabnormals.better_insomnia.core.util.Reference;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.PotionInstant;
import net.minecraft.stats.StatList;
import net.minecraft.stats.StatisticsManagerServer;
import net.minecraft.util.ResourceLocation;

public class PotionRestfulness extends PotionInstant {

    public static final int BASE_VALUE = 24000;

    public PotionRestfulness(String name) {
        super(false, 0xb48675);
        this.setRegistryName(new ResourceLocation(Reference.MODID, name));
    }

    @Override
    public void performEffect(EntityLivingBase entityLivingBase, int amplifier) {
        if (entityLivingBase instanceof EntityPlayerMP) {
            EntityPlayerMP playerMP = (EntityPlayerMP) entityLivingBase;
            StatisticsManagerServer statisticsManager = playerMP.getStats();
            statisticsManager.increment(playerMP, StatList.CUSTOM.get(StatList.TIME_SINCE_REST), -(BASE_VALUE * (amplifier + 1)));
            BetterInsomnia.LOGGER.debug(-(BASE_VALUE + (BASE_VALUE * amplifier)));
        }
    }
}
