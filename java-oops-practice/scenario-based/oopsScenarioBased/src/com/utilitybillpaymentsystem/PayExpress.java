package com.utilitybillpaymentsystem;

import java.time.LocalDate;

public class PayExpress {
	public static void main(String[] args) { 
	
		//Creating sample bills
		ElectricityBill eBill = new ElectricityBill(2000, LocalDate.of(2026, 01, 20));
		InternetBill iBill = new InternetBill(1000, LocalDate.of(2026, 01, 25));
		WaterBill wBill = new WaterBill(500, LocalDate.of(2026, 01, 31));
		
		//Sending remineders
		eBill.sendReminder();
		iBill.sendReminder();
		wBill.sendReminder();
		
		System.out.println();
		
		//Paying some bill
		eBill.pay();
		iBill.pay();
		
		//Calculation of late fee example
		System.out.println("Late fee for water bill is : " + wBill.calculateLateFee(200));
		
	}
}