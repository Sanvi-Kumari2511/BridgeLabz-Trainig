package com.roundaboutvehicleflow;

public class RoundAbout {

	    private Vehicle tail;   
	    private int size;       
	    private int capacity;  

	    //Constructor
	    public RoundAbout(int capacity) {
	        this.capacity = capacity;
	        this.tail = null;
	        this.size = 0;
	    }

	    //Adding vehicle to roundabout
	    public void addVehicle(String number) {
	        if (size == capacity) {
	            System.out.println("Roundabout capacity reached");
	            return;
	        }

	        Vehicle newVehicle = new Vehicle(number);

	        //If roundabout is empty
	        if (tail == null) {
	        	
	            tail = newVehicle;
	            tail.next = tail;
	        } 
	        
	        //If roundabout already has vehicles
	        else {
	        	
	            newVehicle.next = tail.next;
	            tail.next = newVehicle;
	            tail = newVehicle;
	        }

	        size++;
	        System.out.println("Vehicle has entered roundabout: " + number);
	    }

	    //Removing vehicle from roundabout
	    public void removeVehicle() {
	    	
	        if (tail == null) {
	            System.out.println("Roundabout is currently empty");
	            return;
	        }

	        Vehicle head = tail.next;
	        System.out.println("Vehicle exited the roundabout: " + head.number);

	        //If only one vehicle exists
	        if (tail == head) {
	            tail = null;
	        } 
	        //More than one vehicle
	        else {
	        	
	            tail.next = head.next;
	        }

	        size--;
	    }

	    //Displaying current roundabout state
	    public void printRoundabout() {
	        if (tail == null) {
	        	
	            System.out.println("Roundabout is empty.");
	            return;
	        }

	        Vehicle temp = tail.next;
	        System.out.print("Vehicles currently circulating: ");

	        do {
	        	
	            System.out.print(temp.number + " -> ");
	            temp = temp.next;
	        } 
	        
	        while (temp != tail.next);

	        System.out.println("(back to start)");
	    }

	    //Checking if roundabout is full
	    public boolean isFull() {
	        return size == capacity;
	    }

	    //Checking if roundabout is empty
	    public boolean isEmpty() {
	        return size == 0;
	    }
}


