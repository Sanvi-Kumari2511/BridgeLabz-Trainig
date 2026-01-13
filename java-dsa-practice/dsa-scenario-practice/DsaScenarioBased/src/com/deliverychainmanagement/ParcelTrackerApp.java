package com.deliverychainmanagement;

public class ParcelTrackerApp {
	
	    public static void main(String[] args) {

	        //Initialize parcel tracking
	        ParcelTracker tracker = new ParcelTracker("Packed");

	        //Adding default stages
	        tracker.addStage("Shipped");
	        tracker.addStage("In Transit");
	        tracker.addStage("Delivered");

	        //Adding custom checkpoint
	        tracker.addCheckpointAfter("Shipped", "Customs Check");

	        //Forward tracking
	        tracker.trackParcel();

	        //Detect missing stages
	        tracker.detectMissingStage();
	    }
}

