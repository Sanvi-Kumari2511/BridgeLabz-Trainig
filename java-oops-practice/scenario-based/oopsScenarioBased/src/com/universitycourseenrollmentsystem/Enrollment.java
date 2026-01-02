package com.universitycourseenrollmentsystem;

public class Enrollment {
	
	    private Student student;
	    private Course course;
	    private Faculty faculty;
        
	    //Constructor
	    Enrollment(Student student, Course course, Faculty faculty) {
	        this.student = student;
	        this.course = course;
	        this.faculty = faculty;
	    }

	    //Method to show grade of student
	    public void gradeStudent(double marks) {
	        if (student instanceof Graded) {
	            ((Graded) student).assignGrade(marks);
	            
	           System.out.println("Grade assigned by " + faculty.getName() + " for course " + course.getCourseName());
	        }
	    }
	}


