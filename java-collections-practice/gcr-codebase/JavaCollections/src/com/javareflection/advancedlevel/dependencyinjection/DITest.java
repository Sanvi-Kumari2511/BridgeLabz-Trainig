package com.javareflection.advancedlevel.dependencyinjection;
public class DITest {

    public static void main(String[] args) {

        //Get Car object 
        Car car = SimpleDIContainer.getObject(Car.class);

        car.drive();
    }
}