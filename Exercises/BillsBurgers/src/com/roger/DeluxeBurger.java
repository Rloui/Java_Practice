package com.roger;

public class DeluxeBurger extends Burger {
    private boolean chips;
    private boolean drinks;

    public DeluxeBurger(String rollType, String meat, double price, String name, boolean lettuce, boolean tomato, boolean pickle, boolean cheese, boolean chips, boolean drinks) {
        super(rollType, meat, price, name, lettuce, tomato, pickle, cheese);
        this.chips = chips;
        this.drinks = drinks;
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isDrinks() {
        return drinks;
    }
}
