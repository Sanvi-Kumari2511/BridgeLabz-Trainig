package com.compartmentnavigationsystem;

public class MainTrain {
	public static void main(String[] args) {
		
        Train train = new Train();

        //Adding compartments
        train.addCompartment("C1", "Sleeper");
        train.addCompartment("C2", "AC");
        train.addCompartment("C3", "Pantry");
        train.addCompartment("C4", "WiFi");
        train.addCompartment("C5", "General");

        System.out.println();
        
        //Traversing compartments in forward direction
        train.traverseForward();
        
        System.out.println();
        
      //Traversing compartments in backward direction
        train.traverseBackward();

        System.out.println();
        
        //Displaying adjacent compartments
        train.displayAdjacent("C2");
        train.displayAdjacent("C1");

        //Removing compartment C3
        System.out.println("\nRemoving compartment C3");
        train.removeCompartment("C3");

        System.out.println();
        
        //Traversing and displaying adjacent compartments in forward direction
        train.traverseForward();
        train.displayAdjacent("C2");
        
        System.out.println();
        
        //Traversing and displaying adjacent compartments in backward direction
        train.traverseBackward();
        train.displayAdjacent("C1");
        
    }
}

