package com.collectors.studentresultgrouping;

public class Student {
   String name;
   int grade;
   
   //Constructor to initialize student details
   Student(String name, int grade){
	   this.name = name;
	   this.grade = grade;
   }
   
   //Getter method to get name of student
   public String getName() {
	   return name;
   }
   
   //Getter method to get grade of student
   public int getGrade() {
	   return grade;
   }
}
