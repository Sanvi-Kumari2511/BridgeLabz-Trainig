package com.inheritance.levelone;
import java.util.Scanner;

class Dog extends Animal {
	
    //Constructor
	Dog (String name, int age){
		super(name, age);
	}
	
	  //Override
	  void makeSound() {
		  System.out.println("Dogs bark");
	}
}
