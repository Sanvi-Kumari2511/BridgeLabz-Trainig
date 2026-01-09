package com.medistore;
import java.time.LocalDate;

public class MedistoreApp {
	    public static void main(String[] args) {
	    	
	        ISellable med1 = new Tablet("Paracetamol", 3.5, LocalDate.of(2026, 6, 1));
	        ISellable med2 = new Syrup("Cough Syrup", 100, LocalDate.of(2025, 3, 1));

	        med1.sell(20);
	        med2.sell(5);
	    }
	}

