package com.codz.toppings;

public class Tomato {
    private String name;
    private static final double price = 0.2;

    public Tomato() {
        this.name = "Tomato";
    }

    public static double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
