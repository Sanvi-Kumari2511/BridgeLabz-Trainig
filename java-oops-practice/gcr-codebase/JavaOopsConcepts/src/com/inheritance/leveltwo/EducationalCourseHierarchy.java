package com.inheritance.leveltwo;

public class EducationalCourseHierarchy {
	
	    public static void main(String[] args) {

	        Course basicCourse = new Course("Core Java", 4);

	        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 8, "Masai", true);

	        PaidOnlineCourse paidCourse = new PaidOnlineCourse("AI & ML", 12, "Coursera", true, 20000, 20);

	        System.out.println(basicCourse.getCourseDetails());
	        System.out.println(onlineCourse.getCourseDetails());
	        System.out.println(paidCourse.getCourseDetails());
	    }
	}

