package com.birdsanctuary;

public class Eagle extends Bird implements Flyable {

	 public Eagle(String id, String name) {
	        super(id, name, "Eagle");
	    }

	    @Override
	    public void fly() {
	        System.out.println(getName() + " is soaring high.");
	    }

	    @Override
	    public void displayInfo() {
	        System.out.println("Eagle | ID: " + getId() + " | Name: " + getName() + " | Can Fly");
	        
	        
	    }
	}