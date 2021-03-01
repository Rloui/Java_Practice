package com.roger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount rogerAccount = new BankAccount(10878, 9860, "Robert Smith", "rsmith@gmail.com", "777-009-9873");
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Boob", 4900.00);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer();
    }
}
