package com.roger;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        //System.out.println(calcFeetAndInchesToCentimeters(13,1));
        //System.out.println(calcFeetAndInchesToCentimeters(100));

        getDurationString(3945);
        getDurationString(-41);

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

    public static String getDurationString(int min, int sec){
        if(min >= 0 && (sec >= 0 && sec <= 59)){
            int hours = min / 60;
            int minRemaining = min % 60;
            System.out.println(hours + "h " + minRemaining + "m " + sec + "s ");
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int sec){
        if(sec >= 0) {
            int min = sec / 60;
            int secRemaining = sec % 60;

            getDurationString(min, secRemaining);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
