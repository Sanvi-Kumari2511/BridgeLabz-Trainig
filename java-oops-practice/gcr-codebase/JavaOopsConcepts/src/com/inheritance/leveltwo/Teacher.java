package com.inheritance.leveltwo;

 class Teacher extends Person{
	
	    String subject;

	    Teacher(String name, int age, String subject) {
	        super(name, age);
	        this.subject = subject;
	    }

	    void displayRole() {
	        System.out.println("Role: Teacher");
	        System.out.println("Name of the teacher: " + name);
	        System.out.println("Age of the teacher: " + age);
	        System.out.println("Subject assigned to the teacher: " + subject);
	    }
	}

