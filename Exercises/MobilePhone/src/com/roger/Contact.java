package com.roger;

import java.util.ArrayList;

public class Contact {
    private String name; // declared a field for name
    private String phoneNumber; // declared a field for phoneNumber

    public Contact(String name, String phoneNumber) { // this is a constructor that initializes the object
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) { // calls the constrictor to create a new contact record
        return new Contact(name, phoneNumber); // it returns that contact record
    }
}

