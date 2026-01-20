package com.javacollections.javastreams;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Serialization {
	
	    //Employee class as inner static class
	    public static class Employee implements Serializable {
	        private static final long serialVersionUID = 1L;

	        private int id;
	        private String name;
	        private String department;
	        private double salary;

	        //Constructor
	        public Employee(int id, String name, String department, double salary) {
	            this.id = id;
	            this.name = name;
	            this.department = department;
	            this.salary = salary;
	        }

	        //Display method
	        public void display() {
	            System.out.println("ID: " + id + ", Name: " + name +
	                    ", Department: " + department + ", Salary: " + salary);
	        }
	    }

	  
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Employee> employees = new ArrayList<>();

	        
	        //Input Employee Details
	       
	        System.out.print("How many employees do you want to add? ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
	            System.out.print("ID: ");
	            int id = sc.nextInt();
	            sc.nextLine(); 
	            
	            System.out.print("Name: ");
	            String name = sc.nextLine();
	            System.out.print("Department: ");
	            String dept = sc.nextLine();
	            System.out.print("Salary: ");
	            double salary = sc.nextDouble();
	            sc.nextLine();

	            employees.add(new Employee(id, name, dept, salary));
	        }

	        String filename = "employees.ser"; 

	        
	        //Serialization (Save Objects)
	      
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
	            oos.writeObject(employees); 
	            System.out.println("\nEmployees saved successfully in " + filename);
	        } 
	        
	        catch (IOException e) {
	            System.out.println("Error saving employees: " + e.getMessage());
	        }

	        
	        //Deserialization (Read Objects)
	       
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
	            ArrayList<Employee> savedEmployees = (ArrayList<Employee>) ois.readObject();

	            System.out.println("\nEmployees retrieved from file:");
	            for (Employee emp : savedEmployees) {
	                emp.display();
	            }

	        } 
	        
	        catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        } 
	        
	        catch (ClassNotFoundException e) {
	            System.out.println("Class not found: " + e.getMessage());
	        }
      }
}
