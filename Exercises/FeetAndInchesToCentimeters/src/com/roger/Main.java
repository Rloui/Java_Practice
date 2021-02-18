package com.roger;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(13,1));
        System.out.println(calcFeetAndInchesToCentimeters(100));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet > 0 && (inches >= 0 && inches <= 12)){
            double cmFeet = feet * 12 * 2.54;
            double cmInches = inches * 2.54;
            double sum = cmFeet + cmInches;

            return sum;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = inches / 12;
            double inchesRemaining = inches % 12;

            double cenimeters = calcFeetAndInchesToCentimeters((int)feet, inchesRemaining);

            System.out.println("inches: " + inches + " feet: " + (int)feet + " inches: " + inchesRemaining + " cenimeters: " + cenimeters);
            return cenimeters;
        }
        return -1;
    }
}
