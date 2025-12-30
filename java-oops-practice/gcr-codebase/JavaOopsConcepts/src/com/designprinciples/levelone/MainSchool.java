package com.designprinciples.levelone;

public class MainSchool {

	    public static void main(String[] args) {

	        School school = new School("DAV Public School");

	        Student s1 = new Student("Sanvi");
	        Student s2 = new Student("Sandip");

	        Course Maths = new Course("Mathematics");
	        Course Science = new Course("Science");

	        school.addStudent(s1);
	        school.addStudent(s2);

	        s1.enrollCourse(Maths);
	        s1.enrollCourse(Science);
	        s2.enrollCourse(Science);

	        System.out.println();
	        s1.viewCourses();
	        System.out.println();
	        s2.viewCourses();
	        System.out.println();
	        Science.showStudents();
	    }
	}

