package com.parkease;

public class ParkingManager {

	    //Internal booking records (restricted access)
	    private String bookingLog = "";

	    //Assigning parking slot
	    public void assignSlot(ParkingSlot slot, Vehicle vehicle) {

	        if (slot.isAvailable() &&
	            slot.getVehicleTypeAllowed().equals(vehicle.getClass().getSimpleName())) {

	            slot.occupySlot();
	            bookingLog += "Slot " + slot.getSlotId() +
	                          " booked for " + vehicle.vehicleNumber + "\n";

	        } 
	        else {
	            bookingLog += "Slot " + slot.getSlotId() +
	                          " booking failed\n";
	        }
	    }

	    //Releasing parking slot
	    public void releaseSlot(ParkingSlot slot) {
	        slot.freeSlot();
	        bookingLog += "Slot " + slot.getSlotId() + " released\n";
	    }

	    //Exposing logs safely
	    public String getBookingLog() {
	        return bookingLog;
	    }
	}
