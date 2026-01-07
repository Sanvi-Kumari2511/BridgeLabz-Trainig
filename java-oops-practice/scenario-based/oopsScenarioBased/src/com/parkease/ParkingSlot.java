package com.parkease;

public class ParkingSlot {
	
	    private int slotId;
	    private boolean isOccupied;        
	    private String vehicleTypeAllowed;
	    private String location;

	    //Constructor for slot initialization
	    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
	        this.slotId = slotId;
	        this.location = location;
	        this.vehicleTypeAllowed = vehicleTypeAllowed;
	        this.isOccupied = false;
	    }

	    //Getter to check availability
	    public boolean isAvailable() {
	        return !isOccupied;
	    }

	    //Internal method to occupy slot
	    protected void occupySlot() {
	        isOccupied = true;
	    }

	    //Internal method to free slot
	    protected void freeSlot() {
	        isOccupied = false;
	    }

	    public String getVehicleTypeAllowed() {
	        return vehicleTypeAllowed;
	    }

	    public int getSlotId() {
	        return slotId;
	    }
	}

