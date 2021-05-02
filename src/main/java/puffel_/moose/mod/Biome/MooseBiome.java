package puffel_.moose.mod.Biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
import puffel_.moose.mod.Registries.ModBlocks;

public class MooseBiome {
    /* Biome Block Layer Settings For Moose Biome
     *
     * Biome block settings are currently set to
     * the TernarySurfaceConfig, block layers
     * are not permanent, and may change in the
     * future.
     */
    public static ConfiguredSurfaceBuilder<TernarySurfaceConfig> MOOSE_BIOME_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    ModBlocks.MOOSE_GRASS.getDefaultState(),
                    ModBlocks.MOOSE_DIRT.getDefaultState(),
                    ModBlocks.MOOSE_STONE.getDefaultState()
            ));
    public static ConfiguredFeature<?, ?> ORE_MOOSE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.MOOSE_ORE.getDefaultState(),
                    3
            ))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64
            ))).spreadHorizontally().repeat(5);
    public static ConfiguredFeature<?, ?> ORE_MOOSE_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.NETHERRACK,
                    ModBlocks.MOOSE_ORE.getDefaultState(),
                    4
            ))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64
            )))
            .spreadHorizontally()
            .repeat(15);

    public static Biome createMooseBiome() {
        /* Biome Settings For Moose Biome
         *
         * Biome settings are currently set to default
         * biome settings provided by Mojang's
         * DefaultBiomeFeatures. Custom biome features
         * will be added in the future
         *
         * TODO: Add custom biome features
         */
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        spawnSettings.playerSpawnFriendly();

        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(MOOSE_BIOME_SURFACE_BUILDER);

        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);

        return new Biome.Builder()
                .precipitation(Biome.Precipitation.SNOW) // TODO: Consider a custom biome precipitation
                .category(Biome.Category.MUSHROOM) // TODO: Create custom biome category
                .effects(new BiomeEffects.Builder()
                    .waterColor(0xFF69B4)
                    .waterFogColor(0xE6A1C3)
                    .fogColor(0x008080)
                    .skyColor(0xFFE5B4)
                    .build())
                .depth(0.3f)
                .scale(0.1f)
                .temperature(0.5f)
                .downfall(0.1f)
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }
}
