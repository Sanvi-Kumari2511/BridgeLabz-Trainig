package com.designprinciples.levelone;
import java.util.ArrayList;

public class Course {
	
	    private String courseName;
	    private ArrayList<Student> students;

	    public Course(String courseName) {
	        this.courseName = courseName;
	        students = new ArrayList<>();
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void showStudents() {
	        System.out.println("Students enrolled in " + courseName + ":");
	        for (Student s : students) {
	            System.out.println("- " + s.getName());
	        }
	    }
	}

