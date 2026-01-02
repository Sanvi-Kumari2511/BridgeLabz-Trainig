package com.hospitalpatientmanagementsystem;

public class Doctor {
   private String name;
   private String specialization;
   
   //onstructor
   Doctor(String name, String specialization){
	   this.name = name;
	   this.specialization = specialization;
   }
   
   void displayInfo() {
	   System.out.println("\nInformation of doctor:");
	   System.out.println("Name: " + name);
	   System.out.println("Specialization: " + specialization);
   }
}
