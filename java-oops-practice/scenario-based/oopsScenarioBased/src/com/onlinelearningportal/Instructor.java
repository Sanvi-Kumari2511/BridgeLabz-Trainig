package com.onlinelearningportal;

 class Instructor extends User {

	    //Constructor to initialize intructor's details
	    public Instructor(String name) {
	        super(name);
	    }

	    //Uploading course method
	    public void uploadCourse(String title) {
	        System.out.println("Instructor -> " + name + " uploaded course: " + title);
	    }
	}
