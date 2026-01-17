package com.birdsanctuary;

public class Penguin extends Bird implements Swimmable {
	
	 public Penguin(String id, String name) {
	        super(id, name, "Penguin");
	    }

	    @Override
	    public void swim() {
	        System.out.println(getName() + " is swimming fast.");
	    }

	    @Override
	    public void displayInfo() {
	        System.out.println("Penguin | ID: " + getId() + " | Name: " + getName() + " | Can Swim");
	    }
	}