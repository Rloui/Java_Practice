package com.roger;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> myCustomers;
    private String name;

    public Branch(String name) {
        this.myCustomers = new ArrayList<Customer>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getMyCustomers() {
        return myCustomers;
    }

    public void addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) > -1) {
            myCustomers.add(new Customer(customerName, initialAmount));
            System.out.println("Customer " + customerName + " with initial deposit of " + initialAmount + "was added.");
        } else {
            System.out.println("This Customer already exsits");
        }
    }

    public void addCustomerTransaction(String customerName, double amount) {
        int exsistingCustomer = findCustomer(customerName);

        if (exsistingCustomer <= -1) {
            myCustomers.get(exsistingCustomer).addTransaction(amount);
            System.out.println("Added " + amount + " of funds to " + customerName + " account.");
        } else {
            System.out.println("This Customer does not exsits");
        }
    }

    private int findCustomer(String customerName) {
        return myCustomers.indexOf(customerName);
    }
}
