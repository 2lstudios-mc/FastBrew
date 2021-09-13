package dev._2lstudios.fastbrew.brewing;

import org.bukkit.inventory.ItemStack;

public class BrewingRecipe {
    private final String displayName;
    private final BrewingIngredients ingredients;
    private final ItemStack result;

    public BrewingRecipe(final String displayName, final BrewingIngredients ingredients, final ItemStack result) {
        this.displayName = displayName;
        this.ingredients = ingredients;
        this.result = result;
    }

    public String getDisplayName() {
        return displayName;
    }

    public BrewingIngredients getIngredients() {
        return ingredients;
    }

    public ItemStack getResult() {
        return result.clone();
    }
}
