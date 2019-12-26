package com.solvd.model;

public class Dish {

    private final String name;
    private final double weight;
    private final double price;

    public Dish (String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
