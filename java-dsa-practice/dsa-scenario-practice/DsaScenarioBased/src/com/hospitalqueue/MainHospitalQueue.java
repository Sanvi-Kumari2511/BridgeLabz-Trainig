package com.hospitalqueue;
import java.util.*;

public class MainHospitalQueue {
    public static void main(String args []) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Number of patients: ");
    	
    	int number = sc.nextInt();
    	
    	Patient[] patients = new Patient[number];
    	
    	for(int i = 0; i < number; i++) {
    		System.out.println("\nEnter patients' details " + (i + 1));
    		System.out.print("ID: ");
    		int id = sc.nextInt();
    		
    		System.out.print("Name: ");
    		String name = sc.next();
    		
    		System.out.print("Critically (1-10): ");
    		int critically = sc.nextInt();
    		
    		patients[i] = new Patient(id, name, critically);
    	}
    	
    	System.out.println();
    	
    	System.out.println("Before sorting: ");
    	for(Patient p: patients) {
    		p.display();
    	}
    	
    	HospitalQueue.bubbleSort(patients);
    	
    	System.out.println("\nAfter Sorting by Critically:");
    	for(Patient p : patients) {
    		p.display();
    	}
    }
}
