package com.roger;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int num1;
        int num2;

        for (int i = 0; i < array.length/2; i++) {
            num1 = array[i];
            num2 = array[array.length - ( 1 +i)];
            array[i] = num2;
            array[array.length - ( 1 +i)] = num1;
        }

    }
}
