package com.inheritance.leveltwo;

public class Student extends Person {
	    String grade;

	    Student(String name, int age, String grade) {
	        super(name, age);
	        this.grade = grade;
	    }

	    void displayRole() {
	        System.out.println("Role: Student");
	        System.out.println("Name of the student: " + name);
	        System.out.println("Age of the student: " + age);
	        System.out.println("Grade of the student: " + grade);
	    }
	}

