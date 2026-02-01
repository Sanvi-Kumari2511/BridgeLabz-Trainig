package com.functionalinterface.multivehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalApp {
	public static void main(String[] args) {

        //Creating vehicle objects
        Car car = new Car();
        Bike bike = new Bike();
        Bus bus = new Bus();

        //Store rent actions using lambda expressions
        List<VehicleAction> rentActions = new ArrayList<>();
        rentActions.add(() -> car.rent());
        rentActions.add(() -> bike.rent());
        rentActions.add(() -> bus.rent());

        //Store return actions using lambda expressions
        List<VehicleAction> returnActions = new ArrayList<>();
        returnActions.add(() -> car.returnVehicle());
        returnActions.add(() -> bike.returnVehicle());
        returnActions.add(() -> bus.returnVehicle());

        //Execute all rent actions
        System.out.println("Renting Vehicles:");
        rentActions.forEach(action -> action.action());

        System.out.println();

        //Execute all return actions
        System.out.println("Returning Vehicles:");
        returnActions.forEach(action -> action.action());
    }
}
