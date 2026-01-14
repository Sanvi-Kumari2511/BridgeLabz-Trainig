package com.utilitybillpaymentsystem;
import java.time.LocalDate;

public class InternetBill extends Bill {
  
	public InternetBill(double amount, LocalDate dueDate) {
		super("Internet", amount, dueDate);
	}
	
	//Override
	public void sendReminder() {
		System.out.println("Reminder:  Your internet bill is due on " + getDueDate());
	}
}
