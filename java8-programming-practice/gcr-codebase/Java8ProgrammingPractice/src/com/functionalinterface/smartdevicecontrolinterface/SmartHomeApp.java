package com.functionalinterface.smartdevicecontrolinterface;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeApp {
  public static void main(String args []) {
	  
	  //Creating device objects
	  Light light = new Light();
	  AC ac = new AC();
	  TV tv = new TV();
	  
  //Creating a list of turnOn action using lamda
  List<DeviceAction> turnOnActions = new ArrayList<>();
  turnOnActions.add(() -> light.turnOn());
  turnOnActions.add(() -> ac.turnOn());
  turnOnActions.add(() -> tv.turnOn());
  
  //Creating a list of turnOff action using lamda
  List<DeviceAction> turnOffActions = new ArrayList<>();
  turnOffActions.add(() -> light.turnOff());
  turnOffActions.add(() -> ac.turnOff());
  turnOffActions.add(() -> tv.turnOff());
  
  //Execute all turn ON actions
  System.out.println("Turning ON all devices:");
  turnOnActions.forEach(action -> action.deviceAction());

  System.out.println();
  
  //Execute all turn OFF actions
  System.out.println("Turning OFF all devices:");
  turnOffActions.forEach(action -> action.deviceAction());
   }
}
