package puffel_.moose.mod.Item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import puffel_.moose.mod.Registries.ModItems;

public class MooseArmor implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {40, 42, 45, 40};
    private static final int[] PROTECTION_VALUES = new int[] {5, 5, 5, 5};

    public static final MooseArmor INSTANCE = new MooseArmor();

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 30;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.MOOSE_ESSENCE);
    }

    @Override
    public String getName() {
        return "moose";
    }

    @Override
    public float getToughness() {
        return 3.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }
}