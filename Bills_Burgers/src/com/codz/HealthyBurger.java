package com.codz;

public class HealthyBurger extends Hamburger {

    private boolean ketchup;
    private boolean salad;

    private final double x_ketchup = 0.3;
    private final double x_salad = 0.4;

    public HealthyBurger(boolean ketchup, boolean salad ) {
        super("brown rye bread roll", "small beef");
        this.ketchup = ketchup;
        this.salad = salad;
        double newPrice = 0;
        if (ketchup){
            newPrice += this.x_ketchup;
            System.out.println("Adding price of ketchup " + this.x_ketchup);
        }
        if(salad){
            newPrice += this.x_salad;
            System.out.println("Adding price of salad " + this.x_salad);
        }
        if ( !salad && !ketchup){
            System.out.println("No extras were added");
        }
        newPrice += super.getBasePrice();
        super.setPrice(newPrice);
        System.out.println("Current price is " + super.getPrice());

    }

    public boolean isKetchup() {
        return ketchup;
    }

    public boolean isSalad() {
        return salad;
    }

    @Override
    public double getBasePrice() {
        System.out.println("HealthyBurger().getBasePrice()-->");
        return super.getBasePrice();
    }
}
