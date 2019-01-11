package com.codz.toppings;

public class Lettuce {
    private String name;
    private static final double price = 0.3;

    public Lettuce() {
        this.name = "Lettuce";
    }

    public String getName() {
        return name;
    }

    public static double getPrice() {
        return price;
    }
}
