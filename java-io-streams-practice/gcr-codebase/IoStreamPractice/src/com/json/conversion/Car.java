package com.json.conversion;

public class Car {

    private String brand;
    private String model;
    private int year;

    //No-argument constructor 
    public Car() {}

    //Parameterized constructor to initialize car details
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //Getters and setters to access car details
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
