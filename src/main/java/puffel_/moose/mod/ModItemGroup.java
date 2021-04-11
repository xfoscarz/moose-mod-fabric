package puffel_.moose.mod;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import puffel_.moose.mod.Registries.ModBlocks;
import puffel_.moose.mod.Registries.ModItems;

import static puffel_.moose.mod.MooseMod.MOD_ID;

public class ModItemGroup {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder
        .create(new Identifier(MOD_ID, "general"))
        .icon(() -> new ItemStack(ModBlocks.MOOSE_BLOCK))
        .appendItems(stack -> {
            // Items
            stack.add(new ItemStack(ModItems.MOOSE_ESSENCE));
            stack.add(new ItemStack(ModItems.MOOSE_INGOT));

            // Blocks
            stack.add(new ItemStack(ModItems.MOOSE_BLOCK));
            stack.add(new ItemStack(ModItems.MOOSE_ORE));

            // Tools
            stack.add(new ItemStack(ModItems.MOOSE_SWORD));
            stack.add(new ItemStack(ModItems.MOOSE_PICKAXE));
            stack.add(new ItemStack(ModItems.MOOSE_AXE));
            stack.add(new ItemStack(ModItems.MOOSE_SHOVEL));
            stack.add(new ItemStack(ModItems.MOOSE_HOE));

            // Armor
            stack.add(new ItemStack(ModItems.MOOSE_HEAD));
            stack.add(new ItemStack(ModItems.MOOSE_CHESTPLATE));
            stack.add(new ItemStack(ModItems.MOOSE_LEGGINGS));
            stack.add(new ItemStack(ModItems.MOOSE_BOOTS));
        })
        .build();
}
