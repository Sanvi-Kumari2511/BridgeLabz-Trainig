package com.hospitalqueue;

public class Patient {
   
	int id;
	String name;
	int critically;
	
	Patient(int id, String name, int critically){
		this.id = id;
		this.name = name;
		this.critically = critically;
	}
	
	void display() {
		System.out.println("ID: " + id + " | Name: " + name + " | Critically:  | " + critically);
	}
}
