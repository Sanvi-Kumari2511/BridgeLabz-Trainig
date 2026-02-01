package com.methodreferences.hospitalpatientidprint;

public class Patient {
	int id;
    String name;

    //Constructor to initialize patient details
    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Method to print patient ID
    public void printId() {
        System.out.println("Patient ID: " + id);
    }
}
