package com.github.punchlamb.ttfp;

import dev.enjarai.trickster.screen.owo.GlyphComponent;
import io.wispforest.owo.ui.parsing.UIParsing;
import net.fabricmc.api.ClientModInitializer;

public class TricksterThreeFoldPloysClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		UIParsing.registerFactory(TricksterThreeFoldPloys.id("glyph"), GlyphComponent::parseTrick);
	}
}