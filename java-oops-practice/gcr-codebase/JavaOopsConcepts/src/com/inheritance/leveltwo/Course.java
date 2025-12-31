package com.inheritance.leveltwo;

public class Course {
	    String courseName;
	    int duration; 

	    //Constructor
	    Course(String courseName, int duration) {
	        this.courseName = courseName;
	        this.duration = duration;
	    }

	    String getCourseDetails() {
	        return "Course Name: " + courseName + ", Duration: " + duration + " weeks";
	    }
	}


