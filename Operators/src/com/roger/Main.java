package com.roger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        System.out.println("result: " + result);

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("the car was true");
        }

        //1
        double number = 20.00;

        //2
        double number2 = 80.00;

        //3
        double sum = (number + number2) * 100.00;

        //4
        double remainder = sum % 40;
        System.out.println("remainder: " + remainder);

        //5
        boolean bool = (remainder == 0) ? true : false;

        //6
        System.out.println("bool: " + bool);

        //7
        if (bool == !true) {
            System.out.println("Got some remainder");
        }

        
    }
}
