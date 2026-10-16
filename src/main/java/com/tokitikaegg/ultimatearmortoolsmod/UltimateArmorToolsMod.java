package com.tokitikaegg.ultimatearmortoolsmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateArmorToolsMod implements ModInitializer {
    public static final String MOD_ID = "ultimatearmortoolsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Ultimate Armor Tools Mod");
        // Register items, blocks, etc.
    }
}