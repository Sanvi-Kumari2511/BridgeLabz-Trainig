package com.constructor.levelone;

public class MainCircle {
	public static void main(String args[]){
	    //By default constructor
		Circle c1 = new Circle();
		c1.show();
		 
		//By parameterized constructor
		Circle c2 = new Circle(6.0);
		c2.show();
	}
}
