package com.constructor.levelone;

public class MainPerson {
	public static void main(String args []){
	    Person originalPerson = new Person("Sanvi", 21);
		originalPerson.show();
		
		System.out.println();
		
		Person clonedPerson = new Person(originalPerson);
		clonedPerson.show();
	}
}
