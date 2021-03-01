package com.roger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall1 = new Wall("West");
        Wall wall1 = new Wall("East");
        Wall wall1 = new Wall("South");
        Wall wall1 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 25);
        Bed bed = new Bed("Modern", 4, 3, 2);
        Lamp lamp = new Lamp("Classics", false, 75);


    }
}
