package com.utilitybillpaymentsystem;
import java.time.LocalDate;

public class ElectricityBill extends Bill {
	
	public ElectricityBill(double amount, LocalDate dueDate) {
		super("Electricity", amount, dueDate);
	}
	
	//Override
	public void sendReminder() {
		System.out.println("Reminder: Your electricity bill is due on " + getDueDate());
	}

}
