package puffel_.moose.mod.Registries;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import puffel_.moose.mod.Item.CustomAxeItem;
import puffel_.moose.mod.Item.CustomHoeItem;
import puffel_.moose.mod.Item.CustomPickaxeItem;
import puffel_.moose.mod.Item.*;
import puffel_.moose.mod.MooseMod;

public class ModItems {
    // Items
    public static final SwordItem MOOSE_SWORD = new SwordItem(MooseSword.INSTANCE, 10, 1.6f, new Item.Settings().maxCount(1).fireproof());
    public static final ShovelItem MOOSE_SHOVEL = new ShovelItem(MooseShovel.INSTANCE, 7.5f, 0.8f, new Item.Settings().maxCount(1).fireproof());
    public static final CustomPickaxeItem MOOSE_PICKAXE = new CustomPickaxeItem(MoosePickaxe.INSTANCE, 7, 1.2f, new Item.Settings().maxCount(1).fireproof());
    public static final CustomAxeItem MOOSE_AXE = new CustomAxeItem(MooseAxe.INSTANCE, 11, 0.8f, new Item.Settings().maxCount(1).fireproof());
    public static final CustomHoeItem MOOSE_HOE = new CustomHoeItem(MooseHoe.INSTANCE, 5, 1f, new Item.Settings().maxCount(1).fireproof());

    public static final MooseEssence MOOSE_ESSENCE = new MooseEssence(new Item.Settings().maxCount(16));
    public static final MooseIngot MOOSE_INGOT = new MooseIngot(new Item.Settings().fireproof());

    // BlockItems
    public static final BlockItem MOOSE_BLOCK = new BlockItem(ModBlocks.MOOSE_BLOCK, new Item.Settings().fireproof());
    public static final BlockItem MOOSE_ORE = new BlockItem(ModBlocks.MOOSE_ORE, new Item.Settings());

    // Armor
    public static final Item MOOSE_HEAD = new ArmorItem(MooseArmor.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().maxCount(1).fireproof());

    public static void register() {
        // Items
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_sword"), MOOSE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_pickaxe"), MOOSE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_axe"), MOOSE_AXE);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_shovel"), MOOSE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_hoe"), MOOSE_HOE);

        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_essence"), MOOSE_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_ingot"), MOOSE_INGOT);

        // BlockItems
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_block"), MOOSE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_ore"), MOOSE_ORE);

        // Armor
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_head"), MOOSE_HEAD);
    }
}
