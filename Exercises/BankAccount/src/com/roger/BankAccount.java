package com.roger;

import java.util.zip.Deflater;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() { // this is the default constuctor
        this(0001, 0.0, "Default Name", "Default email", "Default Phone Number");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) { // constructor
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public  String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accNum) {
        this.accountNumber = accNum;
    }

    public void setBalance(double num) {
        this.balance = num;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public void makeDeposit(double deposit) {
        this.balance += deposit;
    }

    public void makeWithdrawal(double withdrawAmount) {
        if (this.balance > withdrawAmount) {
            this.balance -= withdrawAmount;
        } else {
            System.out.println("insufficient funds");
        }
    }
}
