package com.codz;

import com.codz.DataBase.DB_Connect;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

public class Main {

    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        Connection con = DB_Connect.getConnection();    //Get connection to Database

        printInstructions();
        boolean quit = false;
        while (!quit){
            System.out.print("\nPLease enter an option : ");
            boolean hasNextInt = scan.hasNextInt();
            if (hasNextInt){
                int option = scan.nextInt();
                scan.nextLine();
                switch (option){
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        storeContact();
                        break;
                    case 2:
                        modifyContact();
                        break;
                    case 3:
                        deleteContact();
                        break;
                    case 4:
                        System.out.println("\n==Contact Info==\n");
                        findQueryContact();
                        break;
                    case 5:
                        System.out.println("\n==Phone contacts==\n");
                        listAllContact();
                        break;
                    case 6:
                        quit = true;
                        System.out.println("Exiting program...");
                        break;
                }
            }else{
                System.out.println("Invalid input");
                scan.nextLine();
            }

        }
    }

    private static void printInstructions(){
        System.out.println("Press :");
        System.out.println("0.\tTo list options");
        System.out.println("1.\tTo add contact");
        System.out.println("2.\tTo modify contact");
        System.out.println("3.\tTo delete contact");
        System.out.println("4.\tTo Find/query contact");
        System.out.println("5.\tTo List all contact");
        System.out.println("6.\tTo quit");
    }

    private static void storeContact(){
        Contacts contacts = new Contacts();

        System.out.print("Enter contact name :");
        String name = scan.nextLine();
        contacts.setName(name);

        System.out.print("Enter phone number :");
        String phoneNumber = scan.nextLine();
        contacts.setPhoneNumber(phoneNumber);

        mobilePhone.storeContact(contacts);
    }

    public static void modifyContact(){
        boolean stopSearch = false;
        Contacts currentContact;
        int count = 0;

        while(!stopSearch){
            System.out.print("Please enter name/number to search :");
            String searchInfo = scan.nextLine();
            currentContact = mobilePhone.findContact(searchInfo);
            if(currentContact != null){
                System.out.println("Enter new contact details");
                mobilePhone.modifyContact(currentContact, getContact());
                stopSearch = true;
                break;
            }else{
                count++;
                if (count==3){
                    System.out.println("Search exhausted");
                    stopSearch = true;
                    break;
                }else{
                    System.out.println("Search again please");
                }
            }
        }
    }

    private static Contacts getContact(){
        Contacts contacts  = new Contacts();

        System.out.print("Enter contact name :");
        String name = scan.nextLine();
        contacts.setName(name);

        System.out.print("Enter phone number :");
        String phoneNumber = scan.nextLine();
        contacts.setPhoneNumber(phoneNumber);

        return contacts;
    }

    private static void listAllContact(){
        mobilePhone.printAllContacts();
    }

    private static void deleteContact(){
        boolean stopSearch = false;
        Contacts currentContact = new Contacts();
        int count = 0;

        while(!stopSearch){
            System.out.print("Please enter name/number to delete :");
            String searchInfo = scan.nextLine();
            currentContact = mobilePhone.findContact(searchInfo);
            if(currentContact != null){
                mobilePhone.removeContact(currentContact);
                stopSearch = true;
                break;
            }else{
                count++;
                if (count==3){
                    System.out.println("Last try : No contacts found");
                    stopSearch = true;
                    break;
                }else{
                    System.out.println("try again please");
                }
            }
        }
    }
    private static void findQueryContact(){
        boolean stopSearch = false;
        Contacts currentContact = new Contacts();
        int count = 0;

        while(!stopSearch){
            System.out.print("Please enter name/number to find :");
            String searchInfo = scan.nextLine();
            currentContact = mobilePhone.findContact(searchInfo);
            if(currentContact != null){
                mobilePhone.printContact(currentContact);
                stopSearch = true;
                break;
            }else{
                count++;
                if (count==3){
                    System.out.println("Last try : No contacts found");
                    stopSearch = true;
                    break;
                }else{
                    System.out.println("try again please");
                }
            }
        }
    }

}
