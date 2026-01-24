package com.smarthospitalinventorytracker;

//Custom exception for critically low inventory
public class LowStockException extends Exception {
	
	public LowStockException(String message) {
		super(message);
	}

}
