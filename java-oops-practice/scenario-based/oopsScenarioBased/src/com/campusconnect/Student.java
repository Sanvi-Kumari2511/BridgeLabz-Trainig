package com.campusconnect;
class Student extends Person implements ICourseActions {
	
	    private int[] grades;   
	    private int gradeCount;

	    Student(String name, String email, int id) {
	        super(name, email, id);
	        grades = new int[3];
	        gradeCount = 0;
	    }

	    void addGrade(int grade) {
	        grades[gradeCount++] = grade;
	    }

	    double calculateGPA() {
	        int sum = 0;
	        for (int i = 0; i < gradeCount; i++) {
	            sum += grades[i];  
	        }
	        return (double) sum / gradeCount;
	    }

	    public void enrollCourse(Course course) {
	        course.addStudent(this);
	        System.out.println(name + " enrolled in " + course.courseName);
	    }

	    public void dropCourse(Course course) {
	        course.removeStudent(this);
	        System.out.println(name + " dropped " + course.courseName);
	    }

	    //Override
	    void printDetails() {   
	        super.printDetails();
	        System.out.println("Role: Student");
	        System.out.println("GPA: " + calculateGPA());
	    }
	}

