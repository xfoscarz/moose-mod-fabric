package puffel_.moose.mod.Registries;

import net.minecraft.entity.EquipmentSlot;
import java.util.List;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import puffel_.moose.mod.Item.*;
import puffel_.moose.mod.MooseMod;
import net.minecraft.entity.effect.StatusEffectInstance;

public class ModItems {
    // Food Components
    // your a genius
    public static final FoodComponent MOOSE_ESSENCE_FOOD_COMPONENT = new FoodComponent.Builder().alwaysEdible().snack().hunger(0).build();

    // Items
    public static final SwordItem MOOSE_SWORD = new SwordItem(MooseSword.INSTANCE, 10, 1.6f, new Item.Settings().maxCount(1).fireproof());
    public static final ShovelItem MOOSE_SHOVEL = new ShovelItem(MooseShovel.INSTANCE, 7.5f, 0.8f, new Item.Settings().maxCount(1).fireproof());
    public static final CustomPickaxeItem MOOSE_PICKAXE = new CustomPickaxeItem(MoosePickaxe.INSTANCE, 7, 1.2f, new Item.Settings().maxCount(1).fireproof());
    public static final CustomAxeItem MOOSE_AXE = new CustomAxeItem(MooseAxe.INSTANCE, 11, 0.8f, new Item.Settings().maxCount(1).fireproof());
    public static final CustomHoeItem MOOSE_HOE = new CustomHoeItem(MooseHoe.INSTANCE, 5, 1f, new Item.Settings().maxCount(1).fireproof());

    public static final MooseIngot MOOSE_INGOT = new MooseIngot(new Item.Settings().fireproof());
    public static final MooseEssence MOOSE_ESSENCE = new MooseEssence(new Item.Settings().maxCount(16).food(MOOSE_ESSENCE_FOOD_COMPONENT));
    public static final FloppyMooseEssence FLOPPY_MOOSE_ESSENCE = new FloppyMooseEssence(new Item.Settings().maxCount(16).fireproof());
    public static final StiffMooseEssence STIFF_MOOSE_ESSENCE = new StiffMooseEssence(new Item.Settings().maxCount(16).fireproof());
    public static final RawMooseEssence RAW_MOOSE_ESSENCE = new RawMooseEssence(new Item.Settings().fireproof());

    // BlockItems
    public static final BlockItem MOOSE_BLOCK = new BlockItem(ModBlocks.MOOSE_BLOCK, new Item.Settings().fireproof());
    public static final BlockItem MOOSE_ORE = new BlockItem(ModBlocks.MOOSE_ORE, new Item.Settings().fireproof());
    public static final BlockItem MOOSE_STONE = new BlockItem(ModBlocks.MOOSE_STONE, new Item.Settings());
    public static final BlockItem MOOSE_LOG = new BlockItem(ModBlocks.MOOSE_LOG, new Item.Settings().fireproof());
    public static final BlockItem MOOSE_PLANK = new BlockItem(ModBlocks.MOOSE_PLANK, new Item.Settings().fireproof());
    public static final BlockItem MOOSE_GRASS = new BlockItem(ModBlocks.MOOSE_GRASS, new Item.Settings());
    public static final BlockItem MOOSE_DIRT = new BlockItem(ModBlocks.MOOSE_DIRT, new Item.Settings());

    // Armor
    public static final Item MOOSE_HEAD = new ArmorItem(MooseArmor.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().maxCount(1).fireproof());
    public static final Item MOOSE_CHESTPLATE = new ArmorItem(MooseArmor.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().maxCount(1).fireproof());
    public static final Item MOOSE_LEGGINGS = new ArmorItem(MooseArmor.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().maxCount(1).fireproof());
    public static final Item MOOSE_BOOTS = new ArmorItem(MooseArmor.INSTANCE, EquipmentSlot.FEET, new Item.Settings().maxCount(1).fireproof());

    public static void register() {
        // Register
        
        // Items
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_sword"), MOOSE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_pickaxe"), MOOSE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_axe"), MOOSE_AXE);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_shovel"), MOOSE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_hoe"), MOOSE_HOE);

        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_essence"), MOOSE_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "floppy_moose_essence"), FLOPPY_MOOSE_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "stiff_moose_essence"), STIFF_MOOSE_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_ingot"), MOOSE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "raw_moose_essence"), RAW_MOOSE_ESSENCE);

        // BlockItems
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_block"), MOOSE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_ore"), MOOSE_ORE);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_stone"), MOOSE_STONE);

        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_log"), MOOSE_LOG);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_plank"), MOOSE_PLANK);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_grass"), MOOSE_GRASS);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_dirt"), MOOSE_DIRT);

        // Armor
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_helmet"), MOOSE_HEAD);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_chestplate"), MOOSE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_leggings"), MOOSE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MooseMod.MOD_ID, "moose_boots"), MOOSE_BOOTS);
    }
}
