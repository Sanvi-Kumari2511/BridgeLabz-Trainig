package com.emergencypatientnavigation;

public class MainAmbulanceRoute {
	
	    public static void main(String[] args) {

	        AmbulanceRoute route = new AmbulanceRoute();

	        //Adding hospital units
	        route.addUnit("Emergency");
	        
	        route.addUnit("Radiology");
	        
	        route.addUnit("Surgery");
	        
	        route.addUnit("ICU");

	        //Displaying route
	        route.displayUnits();

	        //Simulating ambulance navigation
	        route.findAvailableUnit("Emergency");

	        //Unit under maintenance
	        route.removeUnit("Radiology");

	        //Updated route
	        route.displayUnits();

	        //Redirecting patient again
	        route.findAvailableUnit("Emergency");
	    }
}

