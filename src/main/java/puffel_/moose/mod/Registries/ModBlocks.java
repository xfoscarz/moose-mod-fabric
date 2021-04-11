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
    public static final MooseOre MOOSE_ORE = new MooseOre(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.0f, 30.0f).sounds(BlockSoundGroup.ANCIENT_DEBRIS).luminance(5));
    public static final MooseBlock MOOSE_BLOCK = new MooseBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.5f, 50.0f).sounds(BlockSoundGroup.NETHERITE).luminance(5));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(MooseMod.MOD_ID, "moose_ore"), MOOSE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MooseMod.MOD_ID, "moose_block"), MOOSE_BLOCK);
    }
}
