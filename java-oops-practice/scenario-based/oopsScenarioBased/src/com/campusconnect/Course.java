package com.campusconnect;
import java.util.ArrayList;
 
public class Course {

	    String courseName;
	    Faculty faculty;
	    ArrayList<Student> students;

	    Course(String courseName, Faculty faculty) {
	        this.courseName = courseName;
	        this.faculty = faculty;
	        students = new ArrayList<>();
	    }

	    void addStudent(Student student) {
	        students.add(student);
	    }

	    void removeStudent(Student student) {
	        students.remove(student);
	    }
	}

