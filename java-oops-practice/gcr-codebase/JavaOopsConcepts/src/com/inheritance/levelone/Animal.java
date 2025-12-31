package com.inheritance.levelone;
import java.util.Scanner;

public class Animal {
	
	private String name;
	private int age;
	
	//Constructor of class Animal
	Animal (String name, int age) {
		     this.name = name;
		     this.age = age;
		     
		}
	
	   //Creating a method for overridden
	   void makeSound() {
		   
		    System.out.println("Make a sound");
	   }
	}


