package com.streams.student;

import java.util.*;

public class Student {
	
  private String name;
  private String firstName;
  private int id;
  private int age;
  private String gender;
  private String department;
  private String city;
  private int rank;
  private List<String> contacts;
  
  public Student(String name, String firstName, int id, int age, String gender, String department, String city, int rank, List<String> contacts) {
	  this.name = name;
	  this.firstName = firstName;
	  this.id = id;
	  this.age = age;
	  this.gender  = gender;
	  this.department = department;
	  this.city = city;
	  this.rank = rank;
	  this.contacts = contacts;
  }
  
  public String getName() {
	  return name;
  }
  
  public String firstName() {
	  return firstName;
  }
  
  public int getId() {
	  return id;
  }
  
  
  
  public int getAge() {
	  return age;
  }
  
  public String getGender() {
	  return gender;
  }
  
  public String getDepartment() {
	  return department;
  }
  
  public int getRank() {
	  return rank;
  }
  
  public String getCity() {
	  return city;
  }
  
  public List<String> getContacts(){
	  return contacts;
  }
  
  @Override
  public String toString() {
	  return "Name: " + name + " | " + "Id: " + id + " | " + "Age: " + age + " | " + "Gender: " + gender + " | " + "City: " + city + " | " + "Contacts: " + contacts + " | " + "Rank: " + rank;
  }
  
   
}
