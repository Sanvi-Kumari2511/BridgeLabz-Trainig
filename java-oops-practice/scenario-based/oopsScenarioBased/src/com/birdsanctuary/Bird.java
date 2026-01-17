package com.birdsanctuary;

public abstract class Bird {
	
	private String id;
	private String name;
	private String species;
	
	
	//Constructor to initialize the bird's details
	public Bird(String id, String name, String species) {
		this.id = id;
		this.name = name;
		this.species = name;
	}
	 
	
	//Getter method to get id of bird
    public String getId() {
			return id;
	}
	
	//Getter method to get species of bird
	public String getName() {
		return name;
	}
	
	//Getter method to get species of bird
	public String getSpecies() {
			return species;
	}
	
	public void eat() {
		
		System.out.println(name + " is eating");
		
		System.out.println();
	}
	
	public abstract void displayInfo();

}
