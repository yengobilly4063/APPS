package com.codz;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    private double acountBalance = 0;

    public Customer(String name, double initialAmount) {
        this.name = name;
        transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public double getAcountBalance() {
        for(int i=0; i<transactions.size(); i++){
            //Run through all transactions and do math. Ensures transactions were properly validated before added.
            acountBalance += transactions.get(i);
        }
        return acountBalance;
    }


}
