package com.encapsulation;

abstract class Patient {
	//Encapsulated fields
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;

    //Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    //Abstract method
    public abstract double calculateBill();

    //Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID is: " + patientId);
        System.out.println("Patient Name is: " + name);
        System.out.println("Patient Age is: " + age);
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    protected String getDiagnosis() {
        return diagnosis;
    }

}
