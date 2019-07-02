package com.teamabnormals.betterinsomnia.core;

import com.teamabnormals.betterinsomnia.core.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(value = Reference.MODID)
public class BetterInsomnia {

    public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    public static ResourceLocation getResourceLocation(String name) {
        return new ResourceLocation(Reference.MODID, name);
    }
}
