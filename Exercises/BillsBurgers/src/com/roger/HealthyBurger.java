package com.roger;

public class HealthyBurger extends Burger{
    private boolean onion;
    private boolean seaweed;

    public HealthyBurger(String rollType, String meat, double price, String name, boolean lettuce, boolean tomato, boolean pickle, boolean cheese, boolean onion, boolean seaweed) {
        super(rollType, meat, price, name, lettuce, tomato, pickle, cheese);
        this.onion = onion;
        this.seaweed = seaweed;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isSeaweed() {
        return seaweed;
    }
}
