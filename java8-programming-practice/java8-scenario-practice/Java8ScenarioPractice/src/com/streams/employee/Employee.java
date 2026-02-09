package com.streams.employee;

public class Employee {
   int id;
   String name;
   int age;
   String gender;
   String department;
   int yearOfJoining;
   double salary;
   
   //Constructor to initialize employee details
   Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary){
	   this.id = id;
	   this.name = name;
	   this.age = age;
	   this.gender = gender;
	   this.department = department;
	   this.yearOfJoining = yearOfJoining;
	   this.salary = salary;
   }
   
   //Getter method to get id
   public int getId() {
	   return id;
   }
   

   //Getter method to get name
   public String getName() {
	   return name;	
   }
   
   //Getter method to get age
   public int getAge() {
	   return age;
   }
   
   //Getter method to get gender
   public String getGender() {
	   return gender;
	 
   }
   
   //Getter method to get department
   public String getDepartment() {
	   return department;
   }
   
   //Getter method to get year of joining
   public int getYearOfJoining() {
	   return yearOfJoining;
   }
   
   //Getter method to get salary
   public double getSalary() {
	   return salary;
   }
   
   @Override
   public String toString() {
	   return id + " | " + name + " | " + department + " | $" + salary;
   }
   
}
