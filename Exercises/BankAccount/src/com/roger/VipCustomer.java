package com.roger;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() { // constructor
        this("Default name", 5000.00, "default@email.com"); // calls the third constructor
    }

    public VipCustomer(String name, double creditLimit) { // constructor
        this(name, creditLimit, "unknown@email"); // calls the third constructor
    }

    public VipCustomer(String name, double creditLimit, String email) { // this constructor is the only one that saves all the fields
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
