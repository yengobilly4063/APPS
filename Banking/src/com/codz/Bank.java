package com.codz;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = "SWEDBANK";
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        System.out.println(branchName + " already exists");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch checkedBranch = findBranch(branchName);
        if(checkedBranch != null){
            return checkedBranch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch checkedBranch = findBranch(branchName);
        if(checkedBranch != null){
            return checkedBranch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(int i=0; i<this.branches.size(); i++){
            Branch checkedBranches = this.branches.get(i);
            if(checkedBranches.getName().equals(branchName)){
                return checkedBranches;
            }
        }
        System.out.println("Branch name :" + branchName.toUpperCase() + " does not exists");
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTranactions, boolean showBalance){
        Branch checkedBranch = findBranch(branchName);
        if(checkedBranch!=null){
            System.out.println("==Customers details for Branch " + checkedBranch.getName().toUpperCase() + "==");
            ArrayList<Customer> branchCustomers = checkedBranch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++){
                Customer customer = branchCustomers.get(i);
                System.out.println("-------------------------------------------");
                System.out.println("[" + (i+1) + "], Customer Name :" + customer.getName());
                if(showTranactions){
                    System.out.println("\t=Transactions=");
                    ArrayList<Double> customerTransactions = customer.getTransactions();
                    for(int j=0; j<customerTransactions.size(); j++){
                        System.out.println("\t[" + (j+1) + "], Amount :" + customerTransactions.get(j));
                    }
                }
                if(showBalance){
                    System.out.println("\tAccount balance :" + customer.getAcountBalance());
                }
            }
            System.out.println("-------------------------------------------");
            return true;
        }else{
            return false;
        }
    }

    public boolean listCustomerDetails(String branchName, String customerName, boolean showBalance){
        Branch branch = findBranch(branchName);
        if (branch != null){
            Customer customer = branch.findCustomer(customerName);
            if(customer != null){
                System.out.println("-------------------------------------------");
                System.out.println("Branch name :" + branch.getName().toUpperCase());
                System.out.println("==Customer Details==");
                System.out.println("Name :" + customer.getName());
                System.out.println("=Transactions=");
                ArrayList<Double> customerTransactions = customer.getTransactions();
                for(int i=0; i<customerTransactions.size(); i++){
                    System.out.println("\t[" + (i+1) + "], Amount :" + customerTransactions.get(i));
                }
                if(showBalance){
                    System.out.println("\tAccount balance :" + customer.getAcountBalance());
                }
                return true;
            }
        }
        return false;
    }



















}