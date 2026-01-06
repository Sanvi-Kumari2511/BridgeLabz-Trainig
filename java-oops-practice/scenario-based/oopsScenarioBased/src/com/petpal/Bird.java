package com.petpal;

public class Bird extends Pet implements IInteractable{

	    public Bird(String name, int age) {
	        super(name, "Bird", age);
	    }

	    //Bird-specific sound
	    @Override
	    public void makeSound() {
	        System.out.println(name + " says: Chirp! Chirp!");
	    }
	}


