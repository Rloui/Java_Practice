package com.roger;

public class Main {

    public static void main(String[] args) {

    Bank bank = new Bank("Bank of Delaware");
    bank.addNewBranch("Dover");
//
    bank.addCustomer("Dover", "Mike", 44.98);
//    bank.addCustomer("Dover", "Bobby", 887.09);
//    bank.addCustomer("Dover", "Lisa", 540.88);
//
//    bank.addNewBranch("Sydney");
//
//    bank.addCustomer("Sydnyr", "Rovert", 345.98);
//
//    bank.addTransaction("Sydney", 99.08, "Rovert");
//    bank.addTransaction("Dover", 88.36, "Mike");
//    bank.addTransaction("Dover", 8008.36, "Mike");
//
//    bank.addTransaction("Dover", 768.21, "Lisa");
//
    bank.listCustomers("Dover", false);




    }
}
