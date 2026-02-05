package com.collectors.employeesalarycategorization;
public class Employee {

    private String name;
    private String department;
    private double salary;

    //Constructor to initialize employee details
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    //Getter method to get department
    public String getDepartment() {
        return department;
    }

    //Getter method to get salary
    public double getSalary() {
        return salary;
    }
}