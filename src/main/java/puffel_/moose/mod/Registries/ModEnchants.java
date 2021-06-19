package puffel_.moose.mod.Registries;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import puffel_.moose.mod.Enchant.Antlers;
import puffel_.moose.mod.MooseMod;

public class ModEnchants {
    public static Enchantment ANTLERS = new Antlers(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR_HEAD, new EquipmentSlot[]{EquipmentSlot.HEAD});

    void register() {
        Registry.register(Registry.ENCHANTMENT, new Identifier(MooseMod.MOD_ID, "antlers"), ANTLERS);
    }
}
