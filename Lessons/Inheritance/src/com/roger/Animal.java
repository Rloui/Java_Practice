package com.roger;

public class Animal {
    private String name;
    private int brain;
    private int size;
    private int weight;

    public Animal(String name, int brain, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void eat() {
        System.out.println("Animale.eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal is moving at " + speed);

    }
}
