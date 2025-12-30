package com.designprinciples.levelone;
import java.util.ArrayList;

public class Department {
	
	    private String departmentName;
	    private ArrayList<Employee> employees;

	    public Department(String departmentName) {
	        this.departmentName = departmentName;
	        employees = new ArrayList<>();
	    }

	    // Creating Employee inside Department 
	    public void addEmployee(int empId, String name) {
	        employees.add(new Employee(empId, name));
	    }

	    public void showEmployees() {
	        System.out.println("Department: " + departmentName);
	        for (Employee emp : employees) {
	            emp.displayEmployee();
	        }
	    }
	}

