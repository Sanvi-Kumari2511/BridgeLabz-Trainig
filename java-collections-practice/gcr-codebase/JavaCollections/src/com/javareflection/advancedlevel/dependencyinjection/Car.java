package com.javareflection.advancedlevel.dependencyinjection;
public class Car {

    @Inject  
    private Engine engine;

    //Method drive
    public void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}