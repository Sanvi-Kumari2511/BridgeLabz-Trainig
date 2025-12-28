package com.constructor.levelone;

public class Person {
	private String name;
	private int age;
	
	//Parameterized constructor
	Person(String name, int age){
	    this.name = name;
		this.age = age;
	}
	
	//Copy constructor
	Person(Person anotherPerson){
	    this.name = anotherPerson.name;
		this.age = anotherPerson.age;
	}
	
	void show(){
	    System.out.println("Name: " + name);
		System.out.println("Age: " + age);
    }	 
}
