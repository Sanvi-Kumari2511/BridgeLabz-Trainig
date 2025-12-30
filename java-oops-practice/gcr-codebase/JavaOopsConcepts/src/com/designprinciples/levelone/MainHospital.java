package com.designprinciples.levelone;

public class MainHospital {

	    public static void main(String[] args) {

	        Hospital hospital = new Hospital("City Hospital");

	        Doctor d1 = new Doctor("Sharma", "Cardiologist");
	        Doctor d2 = new Doctor("Mehta", "Orthopedic");

	        Patient p1 = new Patient("Sanvi");
	        Patient p2 = new Patient("Sandip");

	        hospital.addDoctor(d1);
	        hospital.addDoctor(d2);

	        hospital.addPatient(p1);
	        hospital.addPatient(p2);

	        d1.consult(p1);
	        d1.consult(p2);
	        d2.consult(p1);

	        System.out.println();
	        p1.viewDoctors();
	        System.out.println();
	        p2.viewDoctors();
	    }
	}


