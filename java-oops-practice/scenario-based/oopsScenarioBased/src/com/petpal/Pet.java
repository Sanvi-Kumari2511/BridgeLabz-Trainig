package com.petpal;
import java.util.Random;

public class Pet {
	
	    protected String name;   
	    protected String type;   
	    protected int age;      

	    //Encapsulated health and mood data
	    private int hunger;      
	    private int energy;      
	    private int mood;        
	    
	    //Constructor with random default values
	    public Pet(String name, String type, int age) {
	        this.name = name;
	        this.type = type;
	        this.age = age;

	        Random rand = new Random();
	        this.hunger = rand.nextInt(50);      
	        this.energy = rand.nextInt(50) + 50; 
	        this.mood = rand.nextInt(50) + 50;   
	    }

	    //Feed the pet 
	    public void feed() {
	        hunger -= 20;
	        mood += 10;
	        normalizeValues();
	        System.out.println(name + " has been fed.");
	    }

	    //Playing with the pet 
	    public void play() {
	        energy -= 20;
	        hunger += 10;
	        mood += 15;
	        normalizeValues();
	        System.out.println(name + " enjoyed playing!");
	    }

	    //Pet sleeps 
	    public void sleep() {
	        energy += 30;
	        mood += 5;
	        normalizeValues();
	        System.out.println(name + " is sleeping peacefully.");
	    }

	    //Ensure values stay within 0–100
	    private void normalizeValues() {
	        hunger = Math.max(0, Math.min(100, hunger));
	        energy = Math.max(0, Math.min(100, energy));
	        mood = Math.max(0, Math.min(100, mood));
	    }

	    //Displaying pet status 
	    public void showStatus() {
	        System.out.println("Pet: " + name + " (" + type + ")");
	        System.out.println("Hunger: " + hunger + ", Energy: " + energy + ", Mood: " + mood);
	    }

	    //Polymorphic method 
	    public void makeSound() {
	        System.out.println("The pet makes a sound.");
	    }
	}

