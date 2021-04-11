package puffel_.moose.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import puffel_.moose.mod.Registries.ModBlocks;
import puffel_.moose.mod.Registries.ModItems;

// t
public class MooseMod implements ModInitializer {
    public static final String MOD_ID = "mooses";
    public static final String VERSION = "PRE-Snapshot 21w14a";

    @Override
    public void onInitialize() {
        System.out.println("\n----------------------------------------\nMoosesMod " + VERSION + "\nCoded By: Puffel_\nTested By: nf2m\n----------------------------------------");

        // Registration
        ModBlocks.register();
        ModItems.register();

        // Events
        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, blockEntity) -> {
        });
    }
}

