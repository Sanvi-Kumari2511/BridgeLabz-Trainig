package com.parkease;

public class SmartParkingManagementSystem {
	public static void main(String[] args) {

        //Creating vehicles
        Vehicle car = new Car("MH12A1234");
        Vehicle bike = new Bike("MH14Y5678");

        //Creating parking slots
        ParkingSlot slot1 = new ParkingSlot(101, "Zone A", "Car");
        ParkingSlot slot2 = new ParkingSlot(102, "Zone B", "Bike");

        // Parking manager
        ParkingManager manager = new ParkingManager();

        //Assigning slots
        manager.assignSlot(slot1, car);
        manager.assignSlot(slot2, bike);

        //Calculate parking charges
        System.out.println("Car Charges: " + car.calculateCharges(6));
        System.out.println("Bike Charges: " + bike.calculateCharges(4));

        //Releasing slots
        manager.releaseSlot(slot1);
        manager.releaseSlot(slot2);

        //Displaying logs
        System.out.println("\nBooking Logs:");
        System.out.println(manager.getBookingLog());
    }
}

