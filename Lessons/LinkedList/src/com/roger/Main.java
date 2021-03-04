package com.roger;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96); // instaniates a customer object
        Customer anotherCustomer; // creates another customer object
        anotherCustomer = customer; // for object data types assignments points variable to the others location in memory
        anotherCustomer.setBalance(12.18); // this changes the original objects balance value
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>(); // instantiates an array list

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        // to insert into the arrayList had to move the arrayElements down relative to that position
        // to remove an element from the arrayList had to move the arrayElements up relative to that position
        // this can be very time costly for larger data sets

        intList.add(1,2); // this inserts a specific value at a specific index

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
