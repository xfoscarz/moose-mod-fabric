package puffel_.moose.mod.Item;

import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import puffel_.moose.mod.Registries.ModItems;

public class MooseEssence extends Item {
    public MooseEssence(Settings settings) {
        super(settings);
    }

    /* Player Right Click Item On Block
     *
     * This method is for detecting if user
     * right clicks MooseEssence on water
     * or lava
     */
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        // check @Nullable
        if (context.getPlayer() == null) return super.useOnBlock(context);
    
        PlayerEntity user = context.getPlayer();
        World world = context.getWorld();
        Hand hand = context.getHand();
        ItemStack item = user.getStackInHand(hand);
        BlockState usedOn = world.getBlockState(context.getBlockPos());
        int itemCount = item.getCount();
        
        // Replace PlayerEntity's current hand with the corresponding item with the same item count
        if (usedOn == Blocks.WATER.getDefaultState()) {
            context.getPlayer().setStackInHand(hand, new ItemStack(ModItems.FLOPPY_MOOSE_ESSENCE, itemCount));
        } else if (usedOn == Blocks.LAVA.getDefaultState()) {
            context.getPlayer().setStackInHand(hand, new ItemStack(ModItems.STIFF_MOOSE_ESSENCE, itemCount));
        }

        return super.useOnBlock(context);
    }

    /* Player Right Click Item
     *
     * This method is for detecting if user
     * right clicks MooseEssence while their
     * in the water/on fire
     */
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack item = user.getStackInHand(hand);

        if (user.isTouchingWaterOrRain() && !user.isOnFire()) {
            user.setStackInHand(hand, new ItemStack(ModItems.FLOPPY_MOOSE_ESSENCE, item.getCount()));
        } else if (!user.isTouchingWaterOrRain() && user.isOnFire()) {
            user.setStackInHand(hand, new ItemStack(ModItems.STIFF_MOOSE_ESSENCE, item.getCount()));
        }
        return super.use(world, user, hand);
    }
}
