package com.compartmentnavigationsystem;

public class Compartment {
	
   private String name;
   private String service;
   Compartment previous;
   Compartment next;
   
   //Constructor to initialize the compartment details
   Compartment(String name, String service){
	   this.name = name;
	   this.service = service;
   }
   
   //Method to get passengers' name
   public String getName() {
	   return name;
   }
   
   //Method to get services
   public String getService() {
	   return service;
   }
   
   //Override
   public String toString() {
       return name + " [" + service + "]";
   }
}
