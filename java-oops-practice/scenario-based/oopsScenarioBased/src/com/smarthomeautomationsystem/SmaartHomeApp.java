package com.smarthomeautomationsystem;

public class SmaartHomeApp {

	    public static void main(String[] args) {

	        //Appliances
	        Appliance light = new Light();
	        Appliance fan = new Fan();
	        Appliance ac = new Ac(1500);

	        //User controller
	        UserController controller = new UserController();

	        //Turning appliances ON
	        controller.powerOn(light);
	        controller.powerOn(fan);
	        controller.powerOn(ac);

	        //Comparing energy usage
	        controller.compareUsage(ac, fan);

	        //Turning appliances OFF
	        controller.powerOff(light);
	        controller.powerOff(ac);
	    }
	}

