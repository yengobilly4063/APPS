package com.codz;

import com.codz.toppings.*;

public class Hamburger {
    //Number of burgers made
    private static int NUMBER_OF_BURGERS_MADE = 0;

    private String breadRollType;
    private String meat;
    private Lettuce lettuce;
    private Tomato tomato;
    private Carrot carrot;
    private Cheese cheese;


    //Burger Price
    private double price = 0;
    private final double basePrice = 1.6;

    public Hamburger(){
        //Class Constructor with no parameters
        this.breadRollType = "Ham bread";
        this.meat = "Small Beef flat";
        NUMBER_OF_BURGERS_MADE++;
        //Temporal Code
        this.carrot = new Carrot();
    }

    public Hamburger(String breadRollType, String meat){
        this.breadRollType = breadRollType;
        this.meat = meat;

        //Temporal Code Code to be added when Making choices
        this.carrot = new Carrot();
    }


    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public Lettuce getLettuce() {
        return lettuce;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public Carrot getCarrot() {
        return carrot;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public double getX_lettuce() {
        return lettuce.getPrice();
    }

    public double getX_tomato() {
        return tomato.getPrice();
    }

    public double getX_carrot() {
        return carrot.getPrice();
    }

    public double getX_cheese() {
        return cheese.getPrice();
    }

    public double getPrice() {
        return price;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getNumberOfBurgersMade() {
        return NUMBER_OF_BURGERS_MADE;
    }
}
