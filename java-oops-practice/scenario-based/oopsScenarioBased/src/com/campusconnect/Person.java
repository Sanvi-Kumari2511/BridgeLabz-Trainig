package com.campusconnect;

public class Person {
   protected String name;
   protected String email;
   protected int id;
   
   //Constructor to access the details of a person
   Person(String name, String email, int id){
	   this.name = name;
	   this.email = email;
	   this.id = id;
   }
   
    void printDetails() {
    	System.out.println("Name of person: " + name);
    	System.out.println("Email of person: " + email);
    	System.out.println("Id of person: " + id);
    }
}
