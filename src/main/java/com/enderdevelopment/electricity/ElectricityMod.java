package com.enderdevelopment.electricity;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectricityMod implements ModInitializer {
    public static final String MOD_ID = "electricity";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Electricity Mod");
    }
}