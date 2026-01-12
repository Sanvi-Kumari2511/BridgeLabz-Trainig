package com.roundaboutvehicleflow;

public class TrafficManager {

	    public static void main(String[] args) {

	        //Creating roundabout with capacity 3
	        RoundAbout roundabout = new RoundAbout(3);

	        //Creating waiting queue with capacity 3
	        TrafficQueue waitingQueue = new TrafficQueue(3);
	        
	        System.out.println();
	        
	        //Vehicles arrive
	        waitingQueue.enqueue("CAR-101");
	        waitingQueue.enqueue("CAR-102");
	        waitingQueue.enqueue("CAR-103");

	        System.out.println();
	        
	        //Move vehicles from queue to roundabout
	        moveVehicle(waitingQueue, roundabout);
	        moveVehicle(waitingQueue, roundabout);
	        
	        System.out.println();

	        roundabout.printRoundabout();
	        
	        System.out.println();

	        //Vehicle exits roundabout
	        roundabout.removeVehicle();
	        roundabout.printRoundabout();
	        
	        System.out.println();

	        //New vehicle arrives
	        waitingQueue.enqueue("CAR-104");
	        moveVehicle(waitingQueue, roundabout);
	        
	        System.out.println();

	        roundabout.printRoundabout();
	    }

	    //Move vehicle from queue to roundabout
	    private static void moveVehicle(TrafficQueue queue, RoundAbout roundabout) {

	        if (roundabout.isFull()) {
	            System.out.println("Roundabout full");
	            return;
	        }

	        String vehicle = queue.dequeue();
	        
	        if (vehicle != null) {
	            roundabout.addVehicle(vehicle);
	        }
	    }
}

