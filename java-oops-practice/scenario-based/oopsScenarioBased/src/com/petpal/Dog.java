package com.petpal;

public class Dog extends Pet implements IInteractable {
	
	    public Dog(String name, int age) {
	        super(name, "Dog", age);
	    }

	    //Dog-specific sound (Override)
	    public void makeSound() {
	        System.out.println(name + " says: Woof! Woof!");
	    }
	}


