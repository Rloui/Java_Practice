package com.roger;

public class Main {

    public static void main(String[] args) {

        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, 4, or 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchChar = 'C';
        switch (switchChar) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
                System.out.println("D was found");
                break;
            case 'E':
                System.out.println("E was found");
                break;
            default:
                System.out.println("None were found");
                break;
        }

    }
}
