package com.solvd.model;

public class Dish {

    private String name;
    private double weight;
    private double price;

    public Dish() {
    }

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
