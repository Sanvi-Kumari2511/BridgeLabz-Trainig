package com.javacollections.queueinterface;

public class Patient {
	String name;
    int severity; 

    //Constructor to initialize patient details
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + "(" + severity + ")";
    }
}
