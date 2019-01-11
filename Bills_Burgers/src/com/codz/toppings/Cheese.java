package com.codz.toppings;

public class Cheese {
    private String name;
    private final double price = 0.32;

    public Cheese() {
        this.name = "Cheese";
    }


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
