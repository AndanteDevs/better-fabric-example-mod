package me.yourname.modid;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModId implements ModInitializer {
	public static final String MOD_ID = "mod-id";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("[Mod Name] Loaded");
	}
}
