package com.universitycourseenrollmentsystem;

public class UniversityApp {
	
	    public static void main(String[] args) {

	        Course c1 = new Course("CS101", "DSA");
	        Faculty f1 = new Faculty("Dr. Ritu");

	        Student s1 = new Undergraduate("Sanvi", 101);
	       
	        Enrollment e1 = new Enrollment(s1, c1, f1);
	       
	        e1.gradeStudent(82);
	       
	        s1.showTranscript();
	    }
	}
