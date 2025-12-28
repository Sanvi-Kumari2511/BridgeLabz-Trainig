package com.constructor.levelone;

public class Circle {
double radius;
	
	//Default constructor
	Circle(){
	  
	}
	
	//Parameterized constructor
	Circle(double radius){
	   this.radius = radius;
	}
	
	void show(){
	   System.out.println("Radius: " + radius);
	}
}
