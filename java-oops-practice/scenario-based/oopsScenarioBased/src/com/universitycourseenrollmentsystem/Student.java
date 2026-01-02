package com.universitycourseenrollmentsystem;

public class Student {
	
	    private String name;
	    private int id;
	    private double gpa;     
	    protected Course course;

	    //Student without elective
	    Student(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    //Student with elective
	    Student(String name, int id, Course elective) {
	        this.name = name;
	        this.id = id;
	        this.course = elective;
	    }
        
	    
	    protected void updateGPA(double gradePoint) {
	        gpa = (gpa + gradePoint) / 2;   
	    }

	    public void showTranscript() {
	        System.out.println("Name of the student: " + name);
	        System.out.println("GPA: " + gpa);
	        
	    }
	}

