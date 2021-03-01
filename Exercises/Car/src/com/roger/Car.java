package com.roger;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManuanl;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManuanl) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManuanl = isManuanl;
        this.currentGear = 1;
    }

    public void changeCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction);

    }


}
