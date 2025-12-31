package com.inheritance.leveltwo;

class Staff extends Person{
	    String department;

	    Staff(String name, int age, String department) {
	        super(name, age);
	        this.department = department;
	    }

	    void displayRole() {
	        System.out.println("Role: Staff");
	        System.out.println("Name of the staff: " + name);
	        System.out.println("Age of the staff: " + age);
	        System.out.println("Department of the staff: " + department);
	    }
	}

 
