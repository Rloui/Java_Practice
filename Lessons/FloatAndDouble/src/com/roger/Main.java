package com.roger;

public class Main {

    public static void main(String[] args) {
	// floating point numbers use float or double. Double has more percision than the float
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        //float is a single precision number, a double is a precision number
        float myFloatValue = (float) 5f; // you have to use a cast cause the default decimal data type is double
        double myDoubleValue = 5d;
        System.out.println("MyIntValue = " + myIntValue / 3);
        System.out.println("MyFloatValue = " + myFloatValue / 3);
        System.out.println("MyDoubleValue = " + myDoubleValue / 3);

        int pounds = 200;
        double kgConversion = pounds * 0.4549237;
        System.out.println("kgConversion: " + kgConversion);


        
    }
}
