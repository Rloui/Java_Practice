package com.roger;

public class Main {

    public static void main(String[] args) {
        /*

        for(int i = 8; i > 2; i--) {
            System.out.println("The interest rate is " + i + " and the interest is " + String.format("%.2f", calculateInterest(10000, i)));
        }
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++) {
            if((i % 3) == 0 && (i % 5 == 0)) {
                sum += i;
                System.out.println("This number met the condition " + i);
                count++;
                if(count == 5)break;
            }
        }
        System.out.println("This is the sum " + sum);

         */

        //System.out.println(sumOdd(1, 100));

        int number = 4;
        int finishNumber = 20;
        int countEven = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number " + number);
            countEven++;
            if(countEven == 5)break;
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }

    public static boolean isOdd(int number) {
        if(number > 0 && (number % 2) != 0){
            return true;
        }
        return false;
    }

    public static double sumOdd(int start, int end) {
        int sum = 0;

        if(start <= end && start > 0) {
            for(int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }

    public static boolean isEvenNumber(int num) {
        if((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
