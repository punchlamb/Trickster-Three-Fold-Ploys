package com.github.punchlamb.ttfp;

import com.github.punchlamb.ttfp.tricks.TFTricks;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TricksterThreeFoldPloys implements ModInitializer {
	public static final String MOD_ID = "trickster-three-fold-ploys";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TFTricks.register();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}