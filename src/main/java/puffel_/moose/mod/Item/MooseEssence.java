package puffel_.moose.mod.Item;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import puffel_.moose.mod.MooseMod;
import puffel_.moose.mod.Registries.ModItems;

import javax.swing.*;

public class MooseEssence extends Item {
    public MooseEssence(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();

        try {
            if (context.getWorld().getBlockState(context.getBlockPos()).equals(Blocks.WATER.getDefaultState())) {
                player.clearActiveItem();
                player.giveItemStack(new ItemStack(ModItems.FLOPPY_MOOSE_ESSENCE, 1));
                return ActionResult.SUCCESS;
            } else if (context.getWorld().getBlockState(context.getBlockPos()).equals(Blocks.LAVA.getDefaultState())) {
                player.clearActiveItem();
                player.giveItemStack(new ItemStack(ModItems.STIFF_MOOSE_ESSENCE, 1));
                return ActionResult.SUCCESS;
            } else {
                return ActionResult.PASS;
           }
        } catch (Exception err) {
            err.printStackTrace();
            return ActionResult.FAIL;
        }
    }
}
