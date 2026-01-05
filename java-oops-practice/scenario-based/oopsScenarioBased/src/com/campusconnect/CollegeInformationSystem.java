package com.campusconnect;

public class CollegeInformationSystem {
	
	    public static void main(String[] args) {

	        Faculty f1 = new Faculty("Dr. Ritu", "ritu@college.edu", 201, "Computer Science");
	        Faculty f2 = new Faculty("Dr. Ram", "ram@college.edu", 202, "Computer Science");

	        Course javaCourse = new Course("Java Programming", f1);
	        Course cppCourse = new Course("CPP Programming", f2);


	        Student s1 = new Student("Sanvi", "sanvi@gmail.com", 101);
	        Student s2 = new Student("Manvi", "manvi@gmail.com", 102);
	       
	        s1.addGrade(9);
	        s2.addGrade(8);
	       

	        s1.enrollCourse(javaCourse);
	        s2.enrollCourse(cppCourse);
	      

	        System.out.println("\n--- Student Details ---");
	        s1.printDetails();
	        
	        System.out.println("\n--- Student Details ---");
	        s2.printDetails();
	        
	        System.out.println("\n--- Faculty Details ---");
	        f1.printDetails();
	        
	        System.out.println("\n--- Faculty Details ---");
	        f2.printDetails();
	    }
	}

