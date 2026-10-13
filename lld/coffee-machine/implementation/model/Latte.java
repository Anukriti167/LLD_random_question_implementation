package com.anukriti.coffee_machine.model;

import com.anukriti.coffee_machine.enums.Ingredient;

import java.util.Map;

public class Latte extends Beverage{
    public Latte(String id, Map<Ingredient, Double> ingredientList, Double price) {
        super(id, ingredientList, price);
    }

    public void prepare() {
        //Implementations
    }
}
