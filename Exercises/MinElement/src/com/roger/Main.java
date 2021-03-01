package com.roger;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Count: ");
        int count = scanner.nextInt();
        scanner.nextLine();


        int[] array = readIntegers(count);
        scanner.close();
        System.out.println("The Min is: " + findMin(array));

    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " numbers:");
        int[] integers = new int[count];

        for (int i = 0; i < count; i++) {
            integers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return integers;
    }

    public static int findMin(int[] array) {
        int temp = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < temp) {
                temp = array[i];
            }
        }
        return temp;
    }
}
