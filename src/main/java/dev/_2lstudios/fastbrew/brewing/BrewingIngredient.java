package dev._2lstudios.fastbrew.brewing;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class BrewingIngredient {
    private final Material material;
    private final int amount;

    public BrewingIngredient(Material material, int amount) {
        this.material = material;
        this.amount = amount;
    }

    public Material getMaterial() {
        return material;
    }

    public int getAmount() {
        return amount;
    }

    public boolean is(final ItemStack item) {
        return item.getType() == material && item.getAmount() >= amount;
    }
}
