package puffel_.moose.mod.Registries;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import puffel_.moose.mod.Block.*;
import puffel_.moose.mod.MooseMod;

public class ModBlocks {
    // Stone
    public static final MooseOre MOOSE_ORE = new MooseOre(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.0f, 30.0f).sounds(BlockSoundGroup.ANCIENT_DEBRIS).luminance(5));
    public static final MooseBlock MOOSE_BLOCK = new MooseBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.5f, 50.0f).sounds(BlockSoundGroup.NETHERITE).luminance(5));
    public static final MooseStone MOOSE_STONE = new MooseStone(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(1.5f, 6.5f).sounds(BlockSoundGroup.STONE));

    // Wood
    public static final MooseGrass MOOSE_GRASS = new MooseGrass(FabricBlockSettings.of(Material.SOIL).breakByTool(FabricToolTags.SHOVELS).strength(0.5f, 0.5f).sounds(BlockSoundGroup.GRASS));
    public static final MooseDirt MOOSE_DIRT = new MooseDirt(FabricBlockSettings.of(Material.SOIL).breakByTool(FabricToolTags.SHOVELS).strength(0.7f, 0.7f).sounds(BlockSoundGroup.GRASS));
    public static final MooseLogs MOOSE_LOG = new MooseLogs(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).strength(2.5f, 5).sounds(BlockSoundGroup.WOOD).luminance(2));
    public static final MoosePlanks MOOSE_PLANK = new MoosePlanks(FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES).strength(2.5f, 5).sounds(BlockSoundGroup.WOOD).luminance(2));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(MooseMod.MOD_ID, "moose_ore"), MOOSE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MooseMod.MOD_ID, "moose_block"), MOOSE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MooseMod.MOD_ID, "moose_stone"), MOOSE_STONE);

        Registry.register(Registry.BLOCK, new Identifier(MooseMod.MOD_ID, "moose_grass"), MOOSE_GRASS);
        Registry.register(Registry.BLOCK, new Identifier(MooseMod.MOD_ID, "moose_dirt"), MOOSE_DIRT);
        Registry.register(Registry.BLOCK, new Identifier(MooseMod.MOD_ID, "moose_log"), MOOSE_LOG);
        Registry.register(Registry.BLOCK, new Identifier(MooseMod.MOD_ID, "moose_plank"), MOOSE_PLANK);
    }
}
