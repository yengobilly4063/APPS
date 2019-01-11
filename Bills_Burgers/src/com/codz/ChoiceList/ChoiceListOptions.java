package com.codz.ChoiceList;

import java.util.ArrayList;

public class ChoiceListOptions {

    public ChoiceListOptions() {
        //Needs not variables to be instantiated
        //By default
    }

    public static ArrayList<Integer> validBurgerChoices(){
        ArrayList <Integer> choices = new ArrayList<>();
        choices.add(1);     //Hamburger
        choices.add(2);     //HealthyBurger
        choices.add(3);     //Deluxe Burger
        return choices;
    }



    public static ArrayList<Integer> validRegularToppingsChoices(){
        ArrayList <Integer> choices = new ArrayList<>();
        choices.add(1);     //Lettuce
        choices.add(2);     //Tomato
        choices.add(3);     //Carrot
        choices.add(4);     //Cheese
        choices.add(5);     //All
        choices.add(6);     //exit

        return choices;
    }

}
