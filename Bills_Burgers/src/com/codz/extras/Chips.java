package com.codz.extras;

public class Chips {
    private String name;
    private final double price = 1.81;

    public Chips() {
        this.name = "Potato Chips";
    }

    public Chips(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
