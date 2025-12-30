package com.designprinciples.levelone;
import java.util.ArrayList;

public class Hospital {
	
	    private String hospitalName;
	    private ArrayList<Doctor> doctors;
	    private ArrayList<Patient> patients;

	    public Hospital(String hospitalName) {
	        this.hospitalName = hospitalName;
	        doctors = new ArrayList<>();
	        patients = new ArrayList<>();
	    }

	    public void addDoctor(Doctor doctor) {
	        doctors.add(doctor);
	    }

	    public void addPatient(Patient patient) {
	        patients.add(patient);
	    }

	    public void showHospitalDetails() {
	        System.out.println("Hospital: " + hospitalName);
	        System.out.println("Doctors Available: " + doctors.size());
	        System.out.println("Patients Registered: " + patients.size());
	    }
	}

