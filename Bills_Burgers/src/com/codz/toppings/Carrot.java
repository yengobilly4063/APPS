package com.codz.toppings;

public class Carrot {
    private String name;
    private final double price = 0.25;

    public Carrot() {
        this.name = "Carrot";
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
