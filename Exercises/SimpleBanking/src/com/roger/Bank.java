package com.roger;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branch;
    private String name;

    public Bank(String name) {
        this.branch = new ArrayList<Branch>(); // initializes arrayList upon constructor call
    }

    public void addNewBranch(String branchName) {


        if (findBranch(branchName) <= -1) {
            branch.add(new Branch(branchName));
        } else {
            System.out.println("This Branch already exsits");
        }
    }

    public void addCustomer(String branchName, String customerName, double initialAmount) {
        if (findBranch(branchName) > -1) {
            branch.get(findBranch(branchName)).addNewCustomer(customerName, initialAmount);
        }
    }

    public void addTransaction(String branchName,double amount, String customerName) {
        if (findBranch(branchName) > -1) {
            branch.get(findBranch(branchName)).addCustomerTransaction(customerName, amount);
        }
    }

    private int findBranch(Branch branch) {
        return this.branch.indexOf(branch);
    }

    public void listCustomers(String branchName, boolean showTransactions) {
        System.out.println(findBranch(branchName));
        if (findBranch(branchName) <= -1) {
            System.out.println("Customers for branch " + branchName);
            ArrayList<Customer> branchCustomers = branch.get(findBranch(branchName)).getMyCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName());

                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("Amount: " + transactions.get(j));
                    }
                }
            }
        } else {
            System.out.println("Could not find branch.");
        }
    }










































}
