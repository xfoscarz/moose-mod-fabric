package puffel_.moose.mod.Item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MooseAxe implements ToolMaterial {
    public static final MooseAxe INSTANCE = new MooseAxe();

    @Override
    public int getDurability() {
        return 2561;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0f;
    }

    @Override
    public float getAttackDamage() {
        return 0f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO change repair ingredient to moose ingots
        return null;
    }
}