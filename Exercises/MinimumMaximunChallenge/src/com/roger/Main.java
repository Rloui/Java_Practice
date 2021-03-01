package com.roger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
        int min = 0;
        int max = 0;
        int number = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter Number:");

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                number = scanner.nextInt();

                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number < min){
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        // print results here
        System.out.println("Max number = " + max + " Min number = " + min);


        scanner.close();
    }
}
