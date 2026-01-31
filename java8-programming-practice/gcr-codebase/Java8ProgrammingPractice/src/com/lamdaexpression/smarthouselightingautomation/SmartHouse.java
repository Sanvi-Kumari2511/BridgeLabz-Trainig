package com.lamdaexpression.smarthouselightingautomation;

public class SmartHouse {
   public static void main(String args []) {
	   LightAction motion = () -> System.out.println("Light on at full brightness");
	   LightAction nightTime = () -> System.out.println("Light on at dimmed brightness");
	   LightAction voiceCommands = () -> System.out.println("Light controlled through voice");
	   
	   motion.execute();
	   nightTime.execute();
	   voiceCommands.execute();
	   
   }
}
