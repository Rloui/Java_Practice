package com.roger;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10]; // this initializes an array of length 10 storing the Object data type String
        int[] intArray = new int[10]; // this initializes an array of length 10 storing the Primitive data type int

        ArrayList<String> strArrayList = new ArrayList<String>(); // this initializes an array list storing the Object data type String
        strArrayList.add("Tim");

        // this initializes an array list storing the Primitive data type int, but it is not possible
        // ArrayList<int> intArrayList = new ArrayList<int>();

        // Array List can only store Object Data Types and not Primitives inorder to store primitives you will need Autoboxxing / Object wraper
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54)); // adds an object of type intClass with the value of 54 to the intClassArrayList

        Integer integer = new Integer(54); // Integer is a class and int is not that is the difference
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>(); // this is auto-boxxing, taking the primitive type and using the object wrapper
        for (int i=0; i<10; i++) {
            intArrayList.add(Integer.valueOf(i)); // this is unboxxing take it from the object wrapper and converting it back to a primitive type
        }

        for (int i=0; i<10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        //------------------------------------------------------
        Integer myIntValue = 56;// at compile time java converts it to this --> Integer.valueOf(56);
        int myInt = myIntValue.intValue();

        //------------------------------------------------------

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.00; dbl <= 10.0; dbl+=0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
//            myDoubleValues.add(dbl); this works the same as the line above because java adds it at compile time
        }

        for (int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
//            double value = myDoubleValues.get(i); this works the same as the line above because java adds it at compile time
            System.out.println(i + " --> " + value);
        }

    }
}
