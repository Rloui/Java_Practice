package com.roger;

public class Main {

    public static void main(String[] args) {
        Car porche = new Car(); // created an object called porche from the Car Class which serves as a template
        Car holden = new Car(); Car // Car is a constructor

        System.out.println("Model is " + porche.getModel());
        porche.setModel("Carrera");
        System.out.println("Model is " + porche.getModel());
    }
}
