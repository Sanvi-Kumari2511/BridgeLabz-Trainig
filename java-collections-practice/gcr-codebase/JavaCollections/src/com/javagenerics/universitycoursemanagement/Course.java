package com.javagenerics.universitycoursemanagement;
import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
	private List<T> courses = new ArrayList<>();

    //Add course
    public void addCourse(T course) {
        courses.add(course);
    }

    //Get all courses
    public List<T> getCourses() {
        return courses;
    }

    //Wildcard method to display any course type
    public static void displayCourses(List<? extends CourseType> list) {
        for (CourseType course : list) {
            System.out.println(course.getEvaluationType());
        }
    }
}
