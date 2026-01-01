package com.encapsulation;

abstract class Employee implements Department {

	    //Encapsulated fields
	    private int employeeId;
	    private String name;
	    protected double baseSalary;
	    protected String department;

	    //Constructor
	    public Employee(int employeeId, String name, double BaseSalary) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.baseSalary = baseSalary;
	    }

	    //Abstract method
	    public abstract double calculateSalary();

	    //Concrete method
	    public void displayDetails() {
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Name of employee: " + name);
	        System.out.println("Department of employee: " + department);
	        System.out.println("Salary of employee: " + calculateSalary());
	        System.out.println("---------------------------");
	    }

	    //Getters & Setters (Encapsulation)
	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    //Interface methods
	    //Override
	    public void assignDepartment(String departmentName) {
	        this.department = departmentName;
	    }

	    //Override
	    public String getDepartmentDetails() {
	        return department;
	    }
	}

