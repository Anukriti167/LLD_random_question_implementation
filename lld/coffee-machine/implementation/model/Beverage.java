package com.anukriti.coffee_machine.model;

import com.anukriti.coffee_machine.enums.Ingredient;

import java.util.Map;

public abstract class Beverage {
    private String id;
    private Map<Ingredient, Double> ingredientList;
    private Double price;

    public Beverage(String id, Map<Ingredient, Double> ingredientList, Double price){
        this.id = id;
        this.ingredientList = ingredientList;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public Map<Ingredient, Double> getIngredientList() {
        return ingredientList;
    }

    public Double getPrice() {
        return price;
    }

    public abstract void prepare();
}
