package puffel_.moose.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import puffel_.moose.mod.Registries.ModBiomes;
import puffel_.moose.mod.Registries.ModBlocks;
import puffel_.moose.mod.Registries.ModItems;

public class MooseMod implements ModInitializer {
    public static final String[] DEVELOPERS = {
            "cinzfurz",
            "nf2m",
            "Puffel_",
            "JustSticky"
    };

    public static final String MOD_ID = "mooses";
    public static final String VERSION = "PRE-Snapshot 21w17a";

    @Override
    public void onInitialize() {
        System.out.println("\n\033[34m" +
                "  __  __                        __  __           _ \n" +
                " |  \\/  | ___   ___  ___  ___  |  \\/  | ___   __| |\n" +
                " | |\\/| |/ _ \\ / _ \\/ __|/ _ \\ | |\\/| |/ _ \\ / _` |\n" +
                " | |  | | (_) | (_) \\__ \\  __/ | |  | | (_) | (_| |\n" +
                " |_|  |_|\\___/ \\___/|___/\\___| |_|  |_|\\___/ \\__,_|\n" +
                "                                                   ");

        System.out.println("\n\033[0m-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\033[31mMoosesMod \033[33m" + VERSION + "\n\033[0mThe collaborative efforts of\n\033[32m" + String.join(", ", DEVELOPERS) + "\n\033[0m-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        // Registration
        ModBlocks.register();
        ModItems.register();
        ModBiomes.register();

        // Events
        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, blockEntity) -> { });
    }

    // CustomItemGroup
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder
        .create(new Identifier(MOD_ID, "general"))
        .icon(() -> new ItemStack(ModBlocks.MOOSE_BLOCK))
        .appendItems(stack -> {
            // Items
            stack.add(new ItemStack(ModItems.MOOSE_ESSENCE));
            stack.add(new ItemStack(ModItems.MOOSE_INGOT));

            // Blocks
            stack.add(new ItemStack(ModItems.MOOSE_GRASS));
            stack.add(new ItemStack(ModItems.MOOSE_DIRT));
            stack.add(new ItemStack(ModItems.MOOSE_STONE));
            stack.add(new ItemStack(ModItems.MOOSE_LOG));
            stack.add(new ItemStack(ModItems.MOOSE_PLANK));
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
        }).build();
}

