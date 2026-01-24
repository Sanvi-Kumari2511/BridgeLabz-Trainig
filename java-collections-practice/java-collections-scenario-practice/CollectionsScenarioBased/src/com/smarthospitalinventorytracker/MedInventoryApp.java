package com.smarthospitalinventorytracker;

import com.smarthospitalinventorytracker.MedInventory;

public class MedInventoryApp {
	
	    public static void main(String[] args) {

	        try {
	            MedInventory.processInventory("D:\\testing\\Java Programming Workspace\\java-collections-practice\\java-collections-scenario-practice\\CollectionsScenarioBased\\src\\inventory.csv");
	        } 
	        
	        catch (Exception e) {
	        	
	            System.out.println(e.getMessage());
	        }
	    }
}
