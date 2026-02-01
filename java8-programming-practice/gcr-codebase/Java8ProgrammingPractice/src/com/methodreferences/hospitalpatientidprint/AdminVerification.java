package com.methodreferences.hospitalpatientidprint;

 import java.util.List;
 import java.util.ArrayList;
 
public class AdminVerification {
	public static void main(String[] args) {

        //Creating a patient list
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(101, "Sanvi"));
        patients.add(new Patient(102, "Manvi"));
        patients.add(new Patient(103, "Janvi"));

        //Printing IDs using method reference
        System.out.println("Patient IDs:");

        //Method reference syntax
        patients.forEach(Patient::printId);
    }
}
