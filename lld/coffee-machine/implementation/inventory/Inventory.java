package com.anukriti.coffee_machine.inventory;

import com.anukriti.coffee_machine.enums.Ingredient;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Ingredient, Double> ingredientsInventory;

    public Inventory(Map<Ingredient, Double> ingredientsInventory){
        this.ingredientsInventory =
                new HashMap<Ingredient, Double>(ingredientsInventory);
    }

    public boolean checkIngredient(Ingredient ingredient, Double quantity){
        if(quantity == null || quantity <= 0) return false;

        return ingredientsInventory.containsKey(ingredient)
                && ingredientsInventory.get(ingredient) >= quantity;
    }

    public boolean removeStock(Ingredient ingredient, Double quantity){
        if(!checkIngredient(ingredient, quantity)) return false;

        ingredientsInventory.put(ingredient, ingredientsInventory.get(ingredient) - quantity);
        return true;
    }

    public void addStock(Ingredient ingredient, Double quantity){
        if (quantity == null || quantity <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be positive");
        }

        ingredientsInventory.put(ingredient, ingredientsInventory.getOrDefault(ingredient, 0.0) + quantity);
    }
}
