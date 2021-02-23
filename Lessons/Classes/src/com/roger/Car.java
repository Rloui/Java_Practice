package com.roger;

public class Car { // the public key word is an access modifier, public means unrestricted access to the class
    private int doors; // this is a state variable, called a field
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) { // setter
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model; // when using this it refers to the field
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() { // getter
        return this.model;
    }
}
