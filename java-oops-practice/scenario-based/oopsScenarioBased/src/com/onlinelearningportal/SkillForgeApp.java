package com.onlinelearningportal;

public class SkillForgeApp {
	
	    public static void main(String[] args) {

	        //Creating instructor
	        Instructor instructor = new Instructor("Prof. Amar Nayak");

	        //Instructor uploads course
	        instructor.uploadCourse("Java Full Stack");

	        //Creating course with custom modules
	        String[] modules = { "Java Basics", "OOP", "Spring Boot", "Projects" };
	        Course course = new Course("Java Full Stack", instructor, modules);

	        //Creating student
	        Student student = new Student("Sanvi");

	        //Tracking progress and score
	        student.updateProgress(50);
	        student.updateProgress(60);
	        student.addScore(90);

	        //Generating certificate
	        student.generateCertificate();

	        //Displaying course rating and review
	        System.out.println("Course Rating: " + course.getRating());
	        System.out.println("Course Review: " + course.getReview());
	    }
	}

