package com.codegym.c0320h1.model;

public class FoodOrder {
    private String name;
    private String foodName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public FoodOrder(String name, String foodName) {
        this.name = name;
        this.foodName = foodName;
    }

    public FoodOrder() {
    }
}
