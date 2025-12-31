package com.inheritance.leveltwo;

public class Device {
   String deviceId;
   boolean status;
   
   //Constructor of Device class
   Device (String deviceId, boolean status){
	   this.deviceId = deviceId;
	   this.status = status;
	   
   }
   
   //Creating a method to be overridden
   void displayStatus() {
	   System.out.println("Displaying the details of Device: ");
	   System.out.println("Types of device id: " + deviceId);
	   System.out.println("Status of device: " + status);
	   
   }
   
}
