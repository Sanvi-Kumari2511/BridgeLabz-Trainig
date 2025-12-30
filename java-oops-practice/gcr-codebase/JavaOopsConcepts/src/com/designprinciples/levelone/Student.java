package com.designprinciples.levelone;
import java.util.ArrayList;

public class Student {
	
	    private String name;
	    private ArrayList<Course> courses;

	    public Student(String name) {
	        this.name = name;
	        courses = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    // Enroll student in course
	    public void enrollCourse(Course course) {
	        courses.add(course);
	        course.addStudent(this);
	    }

	    public void viewCourses() {
	        System.out.println("Courses enrolled by " + name + ":");
	        for (Course c : courses) {
	            System.out.println("- " + c.getCourseName());
	        }
	    }
	}


