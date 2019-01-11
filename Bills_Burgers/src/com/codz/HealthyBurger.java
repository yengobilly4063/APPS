package com.codz;

import com.codz.extras.Ketchup;
import com.codz.extras.Salad;

public class HealthyBurger extends Hamburger{

    private Ketchup ketchup;
    private Salad salad;

    //Burger Price
    private double price;
    private final double basePrice = 2.7;

    public HealthyBurger() {
        super.setName("Healthy Burger");
        super.setBreadRollType("brown rye");
        this.setMeat("Bacon");
        this.price = basePrice;

        super.countSoldBurger();
    }

    public void addKetchup(){
        this.ketchup = new Ketchup();
        System.out.println("Added " + ketchup.getName() + " ... " + " price : " + ketchup.getPrice());
    }

    public void addSalad(){
        this.salad = new Salad();
        System.out.println("Added " + salad.getName() + " ... " + " price : " + salad.getPrice());
    }

    @Override
    public double customizeBurger() {
        this.price =  super.customizeBurger();

        if ( ketchup != null){
            this.price += ketchup.getPrice();
            System.out.println("Added " + ketchup.getName() + " ... " + " price : " + ketchup.getPrice());
        }
        if ( salad != null){
            this.price += salad.getPrice();
            System.out.println("Added " + salad.getName() + " ... " + " price : " + salad.getPrice());
        }

        return price;
    }
}
