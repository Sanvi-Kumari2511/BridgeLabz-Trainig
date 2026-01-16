package com.studentrankgenerator;

public class Student {
	 int rollNo;    
	    String name;    
	    int score;     

	    //Constructor to initialize student details
	    Student(int rollNo, String name, int score) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.score = score;
	    }

	    //Displaying student details
	    void display() {
	        System.out.println("Roll: " + rollNo + " | Name: " + name +   " | Score: " + score);
	    }
}
