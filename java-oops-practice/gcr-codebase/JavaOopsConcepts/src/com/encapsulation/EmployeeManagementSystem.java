package com.encapsulation;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

	    public static void main(String[] args) {

	        //Polymorphic list
	        List<Employee> employees = new ArrayList<>();

	        Employee emp1 = new FullTimeEmployee(101, "Sanvi", 50000);
	        emp1.assignDepartment("IT");

	        Employee emp2 = new PartTimeEmployee(102, "Riya", 80, 300);
	        emp2.assignDepartment("HR");

	        employees.add(emp1);
	        employees.add(emp2);

	        //Polymorphism in action
	        for (Employee emp : employees) {
	            emp.displayDetails();
	        }
	    }
	}

