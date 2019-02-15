package com.codz;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Bank bank = new Bank("SWEDBANK");


        double trans = getTransactionValue();
        System.out.println("Transsaction = " + trans);

        boolean stop = false;

        while (!stop){
            int choice = getChoice();
            switch (choice){
                case 0:
                    System.out.println("exiting ...");
                    stop = true;
                    break;
                case 1:
                    addBranch(bank);
                    break;
                case 2:
                    addCustomer(bank);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }



    }



    private static void test_bank(Bank bank){
        bank.addBranch("Tallinn");

        bank.addCustomer("Tallinn", "Bill YENGO", 1000.0);
        bank.addCustomer("Tallinn", "Martin", 500.34);
        bank.addCustomer("Tallinn", "Percy", 250.00);

        bank.addBranch("Tartu");
        bank.addCustomer("Tartu", "Taras", 600.08);

        //Add transactions to already existing customer
        bank.addCustomerTransaction("Tallinn", "Bill YENGO", 250.00);
        bank.addCustomerTransaction("Tallinn", "Bill YENGO", -50.00);
        bank.addCustomerTransaction("Tartu", "Taras", 200.50);
        bank.addCustomerTransaction("Tallinn", "Percy", 250.00);

        bank.addBranch("Elva");
        bank.addCustomer("Elva", "John", 100.6);


        //Printouts
        bank.listCustomers("Tallinn", true, true);

        bank.listCustomers("Tartu", true, true);
//
        bank.listCustomerDetails("Tallinn", "Bill YENGO", true);
        bank.listCustomerDetails("Tallinn", "Percy", false);

        if(bank.addBranch("Elva")){
            System.out.println("Elva branch created");
        }

        bank.addBranch("Elva");
        if(!bank.addCustomer("Elva", "Brandy", 150.50)){
            System.out.println("Elva branch does not exist");
        }
        bank.listCustomerDetails("Elva", "Brandy", false);

        if(!bank.addBranch("Tallinn")){
            System.out.println("Tallinn Branch already exists");
        }

    }

    private static void printOptions(){
        System.out.println("Press :");
        System.out.println("0. To Exit");
        System.out.println("1. To add Branch");
        System.out.println("2. To add Customer");
        System.out.println("3. To add Transaction to existing Customer");
        System.out.println("4. To list all Customers");
        System.out.println("5. To list specific Customer details");
    }



    private static void addBranch(Bank bank){
        System.out.print("Enter Branch name : ");
        String branchName = scan.nextLine();
        if(bank.addBranch(branchName)){
            System.out.println("Branch was successfully added");
        }else{
             System.out.println("Operation not successful");
         }
    }

    private static void addCustomer(Bank bank){
        System.out.print("Enter Branch Name : ");
        String branchName = scan.nextLine();
        System.out.println("Enter customer Name : ");
        String customerName = scan.nextLine();
        double transaction = getTransactionValue();
        if(bank.addCustomer(branchName, customerName, transaction)){
            System.out.println("Customer successfully added..");
        }else{
            System.out.println("Operation not successful");
        }
    }


    //Returned Options and Values
    private static int getChoice(){

        boolean stop = false;
        while (!stop){
            System.out.print("Enter Choice :");
            boolean hasNextInt = scan.hasNextInt();
            if(hasNextInt){
                int choice = scan.nextInt();
                scan.nextLine();
                stop = true;
                return choice;
            }
            System.out.println("Invalid input\n");
            scan.nextLine();
        }
        return -1;
    }

    private static double getTransactionValue(){
        boolean stop = false;
        while (!stop){
            System.out.println("Enter Customer Transaction : ");
            boolean hasNextDouble = scan.hasNextDouble();
            if(hasNextDouble){
                double transaction = scan.nextDouble();
                return transaction;
            }
            scan.nextLine();
        }
        return -1;
    }





}
