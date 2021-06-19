package puffel_.moose.mod.Enchant;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

import java.util.Random;

/* Antlers Enchantment
 *
 * The antlers enchant is basically thorns
 * but more powerful. It is also much harder
 * to enchant with. The antlers enchant
 * deals the amount of damage in it's level
 * plus 1 heart. So antlers 5 could do as
 * much as 6 hearts of damage.
 *
 * Functionality may change in the future
 */

public class Antlers extends Enchantment {
    public Antlers(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }
    public int getMinPower(int level) {
        return 15 + 20 * (level - 1);
    }

    public int getMaxPower(int level) {
        return super.getMinPower(level) + 60;
    }

    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        int randomDamage = user.getRandom().nextInt(level * 2 + 2);

        if (attacker != null) {
            attacker.damage(DamageSource.thorns(user), randomDamage);
        }

        super.onUserDamaged(user, attacker, level);
    }
}

