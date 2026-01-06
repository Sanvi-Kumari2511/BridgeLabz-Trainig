package com.petpal;

public class Cat extends Pet implements IInteractable {

	    public Cat(String name, int age) {
	        super(name, "Cat", age);
	    }

	    //Cat-specific sound (Override)   
	    public void makeSound() {
	        System.out.println(name + " says: Meow!");
	    }
	}


