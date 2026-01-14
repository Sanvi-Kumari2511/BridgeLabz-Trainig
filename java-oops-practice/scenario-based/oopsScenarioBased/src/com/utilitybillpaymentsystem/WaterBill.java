package com.utilitybillpaymentsystem;
import java.time.LocalDate;

public class WaterBill extends Bill {
	public WaterBill(double amount, LocalDate dueDate) {
		super("Water", amount, dueDate);
	}
	
	//Override
	public void sendReminder() {
		System.out.println("Reminder: Your water bill is due on " + getDueDate());
	}

}
