package com.codz.extras;

public class Drinks {
    private String name;
    private final double price = 2.1;

    public Drinks() {
        this.name = "Coca-cola";
    }

    public Drinks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
