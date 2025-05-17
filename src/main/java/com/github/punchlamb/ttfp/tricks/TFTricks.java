package com.github.punchlamb.ttfp.tricks;

import com.github.punchlamb.ttfp.TricksterThreeFoldPloys;
import com.github.punchlamb.ttfp.tricks.dimensionalism.BreakBlockBetterTrick;
import com.mojang.serialization.Lifecycle;
import dev.enjarai.trickster.spell.Pattern;
import dev.enjarai.trickster.spell.trick.Trick;
import dev.enjarai.trickster.spell.trick.Tricks;
import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.SimpleRegistry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryInfo;

import java.util.HashMap;
import java.util.Map;

public class TFTricks {

    //START OF TRICKS

    public static final BreakBlockBetterTrick BREAK_BLOCK_BETTER =
            register("break_block_better", new BreakBlockBetterTrick());

    //END OF TRICKS

    private static <T extends Trick<?>> T register(String path, T trick) {
        return Registry.register(Tricks.REGISTRY, TricksterThreeFoldPloys.id(path), trick);
    }

    public static void register() {
        // I'm meowing SO HARD rn
    }

}
