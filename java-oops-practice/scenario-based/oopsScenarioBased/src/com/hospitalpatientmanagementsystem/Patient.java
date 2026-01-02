package com.hospitalpatientmanagementsystem;

public class Patient {

	    private String name;
	    private int age;
	    
	    //Sensitive data
	    protected Doctor doctor;
	    private String medicalHistory;   

	    //Normal admission
	    Patient(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    //Emergency admission (Overloaded Constructor)
	    Patient(String name, int age, String medicalHistory) {
	        this.name = name;
	        this.age = age;
	        this.medicalHistory = medicalHistory;
	    }

	    public void assignDoctor(Doctor doctor) {
	        this.doctor = doctor;
	    }

	    public String getSummary() {
	        return "Name of patient: " + name + ", Age of patient: " + age;
	    }

	    public void displayInfo() {
	        System.out.println(getSummary());
	    }
	}


