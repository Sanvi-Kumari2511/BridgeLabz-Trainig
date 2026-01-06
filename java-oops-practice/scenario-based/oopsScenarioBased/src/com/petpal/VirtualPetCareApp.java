package com.petpal;

public class VirtualPetCareApp {
	
	    public static void main(String[] args) {

	        //Creating pets
	        Dog dog = new Dog("Buddy", 3);
	        Cat cat = new Cat("Whiskers", 2);
	        Bird bird = new Bird("Tweety", 1);

	        //Interacting with Dog
	        dog.showStatus();
	        dog.feed();
	        dog.play();
	        dog.makeSound();
	        dog.showStatus();

	        System.out.println();

	        //Interacting with Cat
	        cat.showStatus();
	        cat.play();
	        cat.sleep();
	        cat.makeSound();
	        cat.showStatus();

	        System.out.println();

	        //Interacting with Bird
	        bird.showStatus();
	        bird.feed();
	        bird.makeSound();
	        bird.showStatus();
	    }
	}


