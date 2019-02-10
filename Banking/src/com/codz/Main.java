package com.codz;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("SWEDBANK");

//        test_bank(bank);


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






}
