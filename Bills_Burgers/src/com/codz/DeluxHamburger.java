package com.codz;

//Import Extras
import com.codz.extras.Chips;
import com.codz.extras.Drinks;

public class DeluxHamburger extends Hamburger {
    private Drinks drink;
    private Chips chips;

    //Burger Price
    private double price;
    private final double basePrice = 3.4;

    public DeluxHamburger() {
        super.setName("Deluxe");
        super.setBreadRollType("creamy white");
        this.setMeat("Bacon & kebab");
        this.price = basePrice;
        addChips();
        addDrinks();
    }

    public void addDrinks(){
        this.drink = new Drinks();
    }

    public void addChips(){
        this.chips = new Chips();
    }

    @Override
    public double customizeBurger() {
        System.out.println("Customizing burger ...");
        System.out.println("Base price of " + this.getName() + " Burger with " + this.getBreadRollType() +
                " and meat " + this.getMeat() +
                " roll type is " + this.price);

        if ( drink != null){
            this.price += drink.getPrice();
            System.out.println("Added " + drink.getName() + " ... " + " price : " + drink.getPrice());
        }
        if ( chips != null){
            this.price += chips.getPrice();
            System.out.println("Added " + chips.getName() + " ... " + " price : " + chips.getPrice());
        }
        return price;
    }


    //Should not be able to add or create instances of Extras tomato, lettuce, carrot and cheese
    @Override
    public void addLettuce() {
        System.out.println("Sorry cannot add and extras to " + getName() + " burger.");
    }

    @Override
    public void addTomato() {
        System.out.println("Sorry cannot add and extras to " + getName() + " burger.");
    }

    @Override
    public void addCarrot() {
        System.out.println("Sorry cannot add and extras to " + getName() + " burger.");
    }

    @Override
    public void addCheese() {
        System.out.println("Sorry cannot add and extras to " + getName() + " burger.");
    }
}
