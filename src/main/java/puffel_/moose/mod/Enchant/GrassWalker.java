package puffel_.moose.mod.Enchant;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Fertilizable;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import puffel_.moose.mod.Registries.ModBlocks;
import puffel_.moose.mod.Registries.ModItems;
import puffel_.moose.mod.Registries.ModStatusEffects;
import puffel_.moose.mod.StatusEffect.FloppyStatusEffect;

/* Grass Walker Enchant
 *
 * The grass walker enchant will be
 * similar to soul speed and frost
 * walker. This enchant will bonemeal
 * anything it walks on, althought it
 * cannot be used with soul speed.
 */

public class GrassWalker extends Enchantment {

    private Block standingOnBlock;

    public GrassWalker(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    public int getMinPower(int level) {
        return level * 15;
    }

    public int getMaxPower(int level) {
        return this.getMinPower(level) + 20;
    }

    public boolean isTreasure() {
        return true;
    }

    public int getMaxLevel() {
        return 3;
    }

    public static void bonemealGround(LivingEntity entity, World world, BlockPos pos, int level) {
        // this only works in the overworld and the nether
        if (!world.getDimension().hasEnderDragonFight()) {
            BlockState block = world.getBlockState(pos);
            if (block.getBlock().is(Blocks.GRASS_BLOCK)) {
                entity.applyStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1, level));
                entity.applyStatusEffect(new StatusEffectInstance(ModStatusEffects.FLOPPY_STATUS_EFFECT, 1, 1));
            } else if (block.getBlock().is(ModBlocks.MOOSE_GRASS)) {
                entity.applyStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1, level + 1));
                entity.applyStatusEffect(new StatusEffectInstance(ModStatusEffects.FLOPPY_STATUS_EFFECT, 1, 2));
            } else {
                return;
            }

            if (block.getBlock() instanceof Fertilizable) {
                Fertilizable fertilizable = (Fertilizable)block.getBlock();

                if (fertilizable.isFertilizable(world, pos, block, world.isClient)) {
                    if (world instanceof ServerWorld) {
                        if (!fertilizable.canGrow(world, world.random, pos, block)) return;

                        fertilizable.grow((ServerWorld)world, world.random, pos, block);
                        entity.getArmorItems().forEach(itemStack -> {
                            if (itemStack.isItemEqual(new ItemStack(ModItems.MOOSE_BOOTS))) {
                                if (!itemStack.hasEnchantments()) return;
                                if (itemStack.getEnchantments().contains(this.)) {

                                }
                            }
                        });
                    }
                }
            }
        }
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.SOUL_SPEED;
    }
}
