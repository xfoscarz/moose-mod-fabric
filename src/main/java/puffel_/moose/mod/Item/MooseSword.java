package puffel_.moose.mod.Item;


import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MooseSword implements ToolMaterial {
    public static final MooseSword INSTANCE = new MooseSword();

    @Override
    public int getDurability() {
        return 2561;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0f;
    }

    @Override
    public float getAttackDamage() {
        return 0f;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO change repair ingredient to moose ingots
        return null;
    }
}