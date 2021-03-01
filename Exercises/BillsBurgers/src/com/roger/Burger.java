package com.roger;

public class Burger {
    private String rollType;
    private String meat;
    private double price;
    private String name;
    private boolean lettuce;
    private boolean tomato;
    private boolean pickle;
    private boolean cheese;

    public Burger(String rollType, String meat, double price, String name, boolean lettuce, boolean tomato, boolean pickle, boolean cheese) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickle = pickle;
        this.cheese = cheese;
    }

    public double total() {
        int counter = 0;

        switch (true) {
            case lettuce:
                counter += 1;
            case tomato:
                counter += 1;
            case pickle:
                counter += 1;
            case cheese:
                counter += 1;
        }

        this.price = (counter * 1.07) + 5.99;

        System.out.println("");
        return price;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isPickle() {
        return pickle;
    }

    public boolean isCheese() {
        return cheese;
    }
}
