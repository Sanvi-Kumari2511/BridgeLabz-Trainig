package com.csvdatahandling.sortrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCSVRecordByColumn {
	 static class Employee {
	        int id;
	        String name;
	        String department;
	        double salary;

	        Employee(int id, String name, String department, double salary) {
	            this.id = id;
	            this.name = name;
	            this.department = department;
	            this.salary = salary;
	        }
	    }

	    public static void main(String[] args) {

	        String filePath = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\sortrecords\\question7\\employee.csv";
	        String line;
	        List<Employee> employees = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

	            //Skip header
	            br.readLine();

	            while ((line = br.readLine()) != null) {

	                String[] data = line.split(",");

	                int id = Integer.parseInt(data[0]);
	                String name = data[1];
	                String department = data[2];
	                double salary = Double.parseDouble(data[3]);

	                employees.add(new Employee(id, name, department, salary));
	            }

	        }
	        
	        catch (IOException e) {
	            e.printStackTrace();
	        }

	        //Sort by salary (Column)
	        Collections.sort(employees, Comparator.comparingDouble(e -> -e.salary));

	        //Printing top 5 highest paid employees
	        System.out.println("Top 5 Highest Paid Employees:");
	        System.out.println("--------------------------------");

	        
	        for (int i = 0; i < Math.min(5, employees.size()); i++) {
	            Employee e = employees.get(i);
	            System.out.println("Name       : " + e.name);
	            System.out.println("Department : " + e.department);
	            System.out.println("Salary     : " + e.salary);
	            System.out.println("------------------------------");
	        }
	  }
}
