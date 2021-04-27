package puffel_.moose.mod.Registries;

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import puffel_.moose.mod.Biome.MooseBiome;
import puffel_.moose.mod.MooseMod;

public class ModBiomes {
    // MooseBiome
    public static final RegistryKey<Biome> MOOSE_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MooseMod.MOD_ID, "moose_biome"));

    public static void register() {
        // Register
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier(MooseMod.MOD_ID, "moose_grass"), MooseBiome.MOOSE_GRASS_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, MOOSE_BIOME_KEY.getValue(), MooseBiome.createMooseBiome());

        // Climate Zones

        // FIXME Find non-deprecated method of doing this
        OverworldBiomes.addContinentalBiome(MOOSE_BIOME_KEY, OverworldClimate.COOL, 2D);
    }
}
