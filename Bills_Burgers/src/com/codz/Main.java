package com.codz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Hamburger ham = new Hamburger();
////        System.out.println("Current number of hamburgers made : " + ham.getNumberOfBurgersMade());
////        Hamburger ham1 = new Hamburger();
////        Hamburger ham2 = new Hamburger();
////        System.out.println("Current number of hamburgers made : " + ham.getNumberOfBurgersMade());

        HealthyBurger ham = new HealthyBurger(false, false);

//        SellBurger.setBasics();
//        System.out.println("We broke out of the while statement");

//        List <Integer> list = validChoices();
//        System.out.println(list);
//        int i = 2;
//        System.out.println(list.contains(i));

        System.out.println("Welcome !!");
//        setBasics();
        System.out.println(ham.getPrice());
        System.out.println(ham.getCarrot().getName());

    }



}





//UNUSED CODE
//public static ArrayList<Integer> validChoices(){
//    ArrayList <Integer> choices = new ArrayList<>();
//    choices.add(1);
//    choices.add(2);
//    choices.add(3);
//    choices.add(4);
//    choices.add(5);
//    choices.add(6);
//
//    return choices;
//}
//
//    public static void setBasics(){
//        //Set Variables
//        List <Integer> validChoices = validChoices();
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
//                            sc.close();
//                            start = false;
//                    }
//                }else{
//                    System.out.println("\nChoice is out of range. Choose again");
//                    System.out.println("Please make a valid choice \n");
//                    continue;
//                }
//            }else{
//                System.out.println("\nEntry not allowed !!\n");
////                sc.next();
//                continue;
//            }
//            sc.close();
//        }while ( start );
//
//        System.out.println("Exiting program ...");
//        //Close Scanner
//
//    }