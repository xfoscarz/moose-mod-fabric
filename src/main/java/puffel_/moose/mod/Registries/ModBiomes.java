package puffel_.moose.mod.Registries;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import puffel_.moose.mod.Biome.MooseBiome;
import puffel_.moose.mod.MooseMod;

public class ModBiomes {
    // MooseBiome
    public static final RegistryKey<Biome> MOOSE_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MooseMod.MOD_ID, "moose_biome"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_MOOSE_OVERWORLD = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(MooseMod.MOD_ID, "moose_ore_overworld"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_MOOSE_NETHER = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(MooseMod.MOD_ID, "moose_ore_nether"));

    public static void register() {
        /* Overworld Registry
         *
         * MooseBiome registry for the overworld
         * - Moose Biome Surface Builder Registry
         * - Moose Biome Key Registry
         * - Overworld Feature Registry
         * - Biome Modifications
         */

        // Registry
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier(MooseMod.MOD_ID, "moose_grass"), MooseBiome.MOOSE_BIOME_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, MOOSE_BIOME_KEY.getValue(), MooseBiome.createMooseBiome());
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ORE_MOOSE_OVERWORLD.getValue(), MooseBiome.ORE_MOOSE_OVERWORLD);
        // Biome Modifications
        // FIXME Use non-deprecated function in the future
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_MOOSE_OVERWORLD);
        // Climate Zones
        // FIXME Use non-deprecated function in the future
        OverworldBiomes.addContinentalBiome(MOOSE_BIOME_KEY, OverworldClimate.COOL, 2D);

        /* Nether Registry
         *
         * MooseBiome registry for the nether world
         * - Nether Feature Registry
         * - Biome Modifications
         */

        // Registry
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ORE_MOOSE_NETHER.getValue(), MooseBiome.ORE_MOOSE_NETHER);
        // Biome Modifications
        // FIXME Use non-deprecated function in the future
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_MOOSE_NETHER);
    }
}
