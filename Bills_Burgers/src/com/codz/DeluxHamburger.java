package com.codz;

public class DeluxHamburger extends Hamburger {
    private boolean drinks;
    private boolean chips;

    public DeluxHamburger(boolean drinks, boolean chips) {
        super("brown rye bread roll", "small beef");
        this.drinks = drinks;
        this.chips = chips;
    }

    public boolean getDrinks() {
        return drinks;
    }

    public boolean getChips() {
        return chips;
    }

    @Override
    public double getBasePrice() {
        System.out.println("DeluxBurger().getBasePrice()-->");
        return super.getBasePrice();
    }
}
