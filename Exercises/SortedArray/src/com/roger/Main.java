package com.roger;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
	// write your code here
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        printArray(sortIntegers(myIntegers));

    }

    public static int[] getIntegers(int arraySize) { // takes user input and puts those numbers into the array

        int numbers[] = new int[arraySize];
        System.out.println("Enter " + arraySize + "  integer values:\r");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        return numbers;
    }

    public static void printArray(int[] array) { //prints the array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = new int[unsortedArray.length];

        // shortcut to copying an array
        //int[] sortedArray = Arrays.copyOf(unsortedArray,  unsortedArray.length);

        for (int i = 0; i < unsortedArray.length; i++) { // this copies the array to a new one which we will minipulate
            sortedArray[i] = unsortedArray[i];
        }
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i +1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i +1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

