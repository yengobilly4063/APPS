package com.codz;

//Import from ChoiceLists
import com.codz.ChoiceList.*;

//Regular imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SellBurger {

//    public static void sellBurger(){  //Change this class to a void
//
//        int choice = chooseBurger();
//        switch (choice) {
//            case 1:
//                System.out.println("Preparing Normal Hamburger...");
//                Hamburger ham = new Hamburger();
//                System.out.println("\nChoosing toppings...\n");
//                chooseRegularToppings();
//            case 2:
//                System.out.println("Preparing Healthy Burger...");
//                Hamburger helthyHam = new HealthyBurger(false, false);
//                System.out.println("\nChoosing toppings...\n");
//                chooseRegularToppings();
//            case 3:
//                System.out.println("Preparing Deluxe Burger...");
//                Hamburger deluxeHam = new DeluxHamburger(false, false);
//                System.out.println("\nChoosing toppings...\n");
//                chooseRegularToppings();
//        }
//    }
//
//
//    public static int chooseBurger(){
//
//        int choice;
//        ArrayList <Integer> validChoices = ChoiceListOptions.validBurgerChoices();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please make an order " +
//                "\n\t1. Normal Burger" +
//                "\n\t2. Healthy Burger" +
//                "\n\t3. Deluxe Burger");
//        System.out.print("Input choice ...: ");
//        boolean hasNextInt = sc.hasNextInt();
//
//        if (hasNextInt) {
//            choice = sc.nextInt();
//            if ( validChoices.contains(choice) ) {
//                System.out.println("\nChoice " + choice + "... :)\n");
//                return choice;
//            }else{
//                System.out.println("Choice not found\n");
//                chooseBurger();
//            }
//        }else{
//            System.out.println("Entry not allowed");
//            chooseBurger();
//        }
//        sc.close();
//        return -1;
//    }
//
//    public static void chooseRegularToppings(){
//        //Set Variables
//        List <Integer> validChoices = ChoiceListOptions.validRegularToppingsChoices();
//        int choice;
//        boolean start = true;
//        //Open Scanner
//
//
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Please make an order " +
//                    "\n\t1. lettuce" +
//                    "\n\t2. tomatoes" +
//                    "\n\t3. carrots" +
//                    "\n\t4. cheese" +
//                    "\n\t5. all extras" +   ///Resolve the price to zero then add all extras
//                    "\n\t6. exit");
//            System.out.print("Input choice ...: ");
//            boolean hasNextInt = sc.hasNextInt();
//            if ( hasNextInt ){
//                choice = sc.nextInt();
//                if ( validChoices.contains(choice)){
//                    switch (choice){
//                        case 1:
//                            System.out.println("Choice -> " + choice);
//                            continue;
//                        case 2:
//                            System.out.println("Choice -> " + choice);
//                            continue;
//                        case 3:
//                            System.out.println("Choice -> " + choice);
//                            continue;
//                        case 4:
//                            System.out.println("Choice -> " + choice);
//                            continue;
//                        case 5:
//                            System.out.println("Choice -> " + choice);
//                            continue;
//                        case 6:
//                            System.out.println("Choice -> " + choice);
//                            start = false;
//                    }
//                }else{
//                    System.out.println("\nChoice is out of range. Choose again");
//                    System.out.println("Please make a valid choice \n");
//                    continue;
//                }
//            }else{
//                System.out.println("\nEntry not allowed !!\n");
//                continue;
//            }
//            sc.close();
//            System.out.println("Checking start ..." + start);
//        }while ( start );
//
//        System.out.println("Exiting program ...");
//        //Close Scanner
//
//    }



//    public static void chooseRegularToppings(){
//        //Set Variables
//        ArrayList <Integer> validChoices = ChoiceListOptions.validRegularToppingsChoices();
//        int choice;
//        boolean start = true;
//
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Please make an order " +
//                    "\n\t1. lettuce" +
//                    "\n\t2. tomatoes" +
//                    "\n\t3. carrots" +
//                    "\n\t4. cheese" +
//                    "\n\t5. all extras" +   ///Resolve the price to zero then add all extras
//                    "\n\t6. exit");
//            System.out.print("Input choice ...: ");
//            boolean hasNextInt = sc.hasNextInt();
//            if ( hasNextInt ){
//                choice = sc.nextInt();
//                if ( validChoices.contains(choice)){
//                    switch (choice){
//                        case 1:
//                            System.out.println("Choice -> " + choice);
//                            continue;
//                        case 2:
//                            System.out.println("Choice -> " + choice);
//                            continue;
//                        case 3:
//                            System.out.println("Choice -> " + choice);
//                            continue;
//                        case 4:
//                            System.out.println("Choice -> " + choice);
//                            continue;
//                        case 5:
//                            System.out.println("Choice -> " + choice);
//                            continue;
//                        case 6:
//                            System.out.println("Choice -> " + choice);
//                            sc.close();
//                            start = false;
//                    }
//                }else{
//                    System.out.println("Choice has to be in range 1-6");
//                    System.out.println("Please make a valid choice \n");
//                    continue;
//                }
//            }else{
//                sc.next();
//                System.out.println("Input must be a valid number");
//                continue;
//            }
//            sc.close();
//        }while ( start );
//
//        System.out.println("Exiting program ...");
//
//    }

}























//UnUsed Code
//public static void setBasics(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please make an order " +
//                "\n\t1. lettuce" +
//                "\n\t2. tomatoes" +
//                "\n\t3. carrots" +
//                "\n\t4. cheese" +
//                "\n\t5. all extras" +   ///Resolve the price to zero then add all extras
//                "\n\t6. exit");
//        System.out.print("Input choice ...: ");
//        boolean hasNextInt = sc.hasNextInt();
//        if (hasNextInt) {
//            int choice = sc.nextInt();
//            if ( (choice == 1) || (choice == 2) || (choice == 3) || (choice == 4) || (choice == 5) || (choice == 6) ) {
//                switch ( choice ){
//                    case 1:
//                        System.out.println("Chose 1");
//                        setBasics();
//                    case 2:
//                        System.out.println("Chose 2");
//                        setBasics();
//                    case 3:
//                        System.out.println("Chose 3");
//                        setBasics();
//                    case 4:
//                        System.out.println("Chose 4");
//                        setBasics();
//                    case 5:
//                        System.out.println("Chose 5");
//                        setBasics();
//                    case 6:
//                        System.out.println("ending basic choice ...");
//                }
//            }else{
//                System.out.println("\nChoice is out of range. Choose again");
//                setBasics();
//            }
//        }else{
//            System.out.println("\nEntry not allowed !!\n");
//            setBasics();
//        }
//    sc.close();
//}