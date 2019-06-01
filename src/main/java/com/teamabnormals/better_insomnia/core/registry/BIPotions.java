package com.teamabnormals.better_insomnia.core.registry;

import com.teamabnormals.better_insomnia.common.potions.PotionInsomnia;
import com.teamabnormals.better_insomnia.common.potions.PotionRestfulness;
import com.teamabnormals.better_insomnia.core.util.Reference;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BIPotions {

    public static Potion RESTFULNESS = new PotionRestfulness("restfulness");
    public static Potion INSOMNIA = new PotionInsomnia("insomnia");

    public static PotionType RESTFULNESS_NORMAL = new PotionType(new PotionEffect(RESTFULNESS))
      .setRegistryName(new ResourceLocation(Reference.MODID, "restfulness"));
    public static PotionType RESTFULNESS_STRONG = new PotionType(new PotionEffect(RESTFULNESS, 0, 1))
      .setRegistryName(new ResourceLocation(Reference.MODID, "restfulness_strong"));
    public static PotionType INSOMNIA_NORMAL = new PotionType(new PotionEffect(INSOMNIA))
      .setRegistryName(new ResourceLocation(Reference.MODID, "insomnia"));
    public static PotionType INSOMNIA_STRONG = new PotionType(new PotionEffect(INSOMNIA, 0, 1))
      .setRegistryName(new ResourceLocation(Reference.MODID, "insomnia_strong"));

    @SubscribeEvent
    public static void onRegisterPotion(RegistryEvent.Register<Potion> event) {
        final IForgeRegistry<Potion> registry = event.getRegistry();
        registry.register(RESTFULNESS);
        registry.register(INSOMNIA);
    }

    @SubscribeEvent
    public static void onRegisterPotionType(RegistryEvent.Register<PotionType> event) {
        final IForgeRegistry<PotionType> registry = event.getRegistry();
        registry.register(RESTFULNESS_NORMAL);
        registry.register(RESTFULNESS_STRONG);
        registry.register(INSOMNIA_NORMAL);
        registry.register(INSOMNIA_STRONG);
    }
}
