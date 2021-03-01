package com.roger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("sub= " + calculator.getSubtractionResult());
        System.out.println("mult= " + calculator.getMultiplicationResult());
        System.out.println("div= " + calculator.getDivisionResult());

    }
}
