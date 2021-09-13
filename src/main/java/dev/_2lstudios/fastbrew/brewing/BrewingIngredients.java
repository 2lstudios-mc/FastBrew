package dev._2lstudios.fastbrew.brewing;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class BrewingIngredients {
    private final Collection<BrewingIngredient> ingredients = ConcurrentHashMap.newKeySet();

    public Collection<BrewingIngredient> getIngredients() {
        return ingredients;
    }

    public boolean hasIngredients(final ItemStack[] items) {
        final Collection<BrewingIngredient> ingredients = new HashSet<>(this.ingredients);

        for (final ItemStack item : items) {
            final Iterator<BrewingIngredient> iterator = ingredients.iterator();

            while (iterator.hasNext()) {
                final BrewingIngredient ingredient = iterator.next();

                if (ingredient.is(item)) {
                    iterator.remove();
                }
            }
        }

        return ingredients.isEmpty();
    }

    public boolean hasIngredients(final Inventory inventory) {
        return hasIngredients(inventory.getContents());
    }

    public boolean removeIngredients(final Inventory inventory) {
        for (final ItemStack item : inventory.getContents()) {
            for (final BrewingIngredient ingredient : ingredients) {
                if (ingredient.is(item)) {
                    inventory.remove(item);
                }
            }
        }

        return ingredients.isEmpty();
    }
}
