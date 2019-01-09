package com.codz.toppings;

public class Cheese {
    private String name;
    private final double price = 0.32;

    public Cheese() {
        this.name = "Cheese";
    }

    public void addCarrot(){
        System.out.println("Adding " + getName() + " ... " + " price : " + getPrice());
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
