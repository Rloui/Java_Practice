package com.roger;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double num) {
        this.firstNumber = num;
    }

    public void setSecondNumber(double num) {
        this.secondNumber = num;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        if(secondNumber != 0) {
            return this.firstNumber / this.secondNumber;
        } else {
            return 0;
        }
    }
}
