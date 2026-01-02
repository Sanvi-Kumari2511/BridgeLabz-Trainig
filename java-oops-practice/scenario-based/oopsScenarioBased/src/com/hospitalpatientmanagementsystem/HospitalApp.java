package com.hospitalpatientmanagementsystem;

public class HospitalApp {

	    public static void main(String[] args) {

	        Doctor d1 = new Doctor("Dr. Sharma", "General");

	        Patient p1 = new InPatient("Sanvi", 21, 5);
	        p1.assignDoctor(d1);

	        Patient p2 = new OutPatient("Sandip", 22);
            
	        System.out.println();
	        
	        p1.displayInfo();
	        
	        System.out.println("\n------------------------------------------- ");
	        
	        p2.displayInfo();
	        
	        System.out.println("\n------------------------------------------- ");
	        
	        d1.displayInfo();

	        Bill bill = new Bill(10000, 0.18, 500);
	        
	        System.out.println("\n------------------------------------------- ");
	        System.out.println("Total Bill Amount: " + bill.calculatePayment());
	       
	    }
	}


