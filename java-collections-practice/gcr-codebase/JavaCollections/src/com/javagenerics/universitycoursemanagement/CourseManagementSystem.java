package com.javagenerics.universitycoursemanagement;

public class CourseManagementSystem {

	    public static void main(String[] args) {

	        //Exam courses
	        Course<ExamCourse> examCourses = new Course<>();
	        examCourses.addCourse(new ExamCourse());

	        //Assignment courses
	        Course<AssignmentCourse> assignmentCourses = new Course<>();
	        assignmentCourses.addCourse(new AssignmentCourse());

	        //Research courses
	        Course<ResearchCourse> researchCourses = new Course<>();
	        researchCourses.addCourse(new ResearchCourse());

	        System.out.println("Exam Courses:");
	        Course.displayCourses(examCourses.getCourses());

	        System.out.println("\nAssignment Courses:");
	        Course.displayCourses(assignmentCourses.getCourses());

	        System.out.println("\nResearch Courses:");
	        Course.displayCourses(researchCourses.getCourses());
	    }
	}
