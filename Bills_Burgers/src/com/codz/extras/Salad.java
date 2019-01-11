package com.codz.extras;

public class Salad {
    private String name;
    private final double price = 0.4;

    public Salad() {
        this.name = "Salad";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
