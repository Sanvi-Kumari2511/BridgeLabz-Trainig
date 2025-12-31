package com.inheritance.levelone;

public class Employee {
   
	private String name;
	private int id;
	private double salary;
	
	Employee (String name, int id, double salary){
		  this.name = name;
		  this.id = id;
		  this.salary = salary;
	
	}
	
	 void displayDetails() {
		  System.out.println("Display details of the employee:");
		  System.out.println("Display Name: " + name);
		  System.out.println("Display id: " + id);
		  System.out.println("Display Salary: " + salary);
	 }
	 
}
