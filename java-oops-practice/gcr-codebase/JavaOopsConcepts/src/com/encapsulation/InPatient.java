package com.encapsulation;

 class InPatient extends Patient implements MedicalRecord {

	     private int daysAdmitted;
	     private double dailyCharge;

	     public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge) {
	         super(patientId, name, age);
	         this.daysAdmitted = daysAdmitted;
	         this.dailyCharge = dailyCharge;
	     }

	     //Override
	     public double calculateBill() {
	         return daysAdmitted * dailyCharge;
	     }

	     //Override
	     public void addRecord(String record) {
	         setDiagnosis(record);
	     }

	     //Override
	     public void viewRecords() {
	         System.out.println("Diagnosis: " + getDiagnosis());
	     }
	 }

