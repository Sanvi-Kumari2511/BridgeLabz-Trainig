package com.singlylinkedlist;

public class StudentList {
	    
	    // head of linked list
	    private Student start;   

	    //Add student at the beginning
	    public void insertAtStart(int roll, String name, int age, char grade) {
	        Student node = new Student(roll, name, age, grade);
	        node.next = start;
	        start = node;
	        System.out.println("Student inserted at start");
	    }

	    //Add student at the end
	    public void insertAtEnd(int roll, String name, int age, char grade) {
	        Student node = new Student(roll, name, age, grade);

	        if (start == null) {
	            start = node;
	            return;
	        }

	        Student temp = start;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = node;
	        System.out.println("Student inserted at end");
	    }

	    //Add student at a specific position
	    public void insertAtPosition(int position, int roll, String name, int age, char grade) {

	        if (position == 1) {
	            insertAtStart(roll, name, age, grade);
	            return;
	        }

	        Student node = new Student(roll, name, age, grade);
	        Student temp = start;

	        for (int i = 1; i < position - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Your inserted position is invalid");
	            return;
	        }

	        node.next = temp.next;
	        temp.next = node;
	        System.out.println("Student inserted at position " + position);
	    }

	    //Delete student by roll number
	    public void removeByRoll(int roll) {

	        if (start == null) {
	            System.out.println("Student list is empty");
	            return;
	        }

	        if (start.rollNo == roll) {
	            start = start.next;
	            System.out.println("Student record is removed");
	            return;
	        }

	        Student temp = start;
	        while (temp.next != null && temp.next.rollNo != roll) {
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Student is not found");
	        } 
	        else {
	            temp.next = temp.next.next;
	            System.out.println("Student record is removed");
	        }
	    }

	    //Search student by roll number
	    public void findStudent(int roll) {

	        Student temp = start;

	        while (temp != null) {
	            if (temp.rollNo == roll) {
	                System.out.println("\nStudent Details:");
	                System.out.println("Roll Number : " + temp.rollNo);
	                System.out.println("Name        : " + temp.name);
	                System.out.println("Age         : " + temp.age);
	                System.out.println("Grade       : " + temp.grade);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Student is not found");
	    }

	    //Update student grade
	    public void modifyGrade(int roll, char newGrade) {

	        Student temp = start;

	        while (temp != null) {
	            if (temp.rollNo == roll) {
	                temp.grade = newGrade;
	                System.out.println("Student's grade successfully updated");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Student is not found");
	    }

	    //Displaying all student records
	    public void showAll() {

	        if (start == null) {
	            System.out.println("There is no studnt record");
	            return;
	        }

	        Student temp = start;
	        System.out.println("\nRollNo  Name   Age  Grade");

	        while (temp != null) {
	            System.out.println(temp.rollNo + "      " + temp.name + "   " + temp.age + "    " + temp.grade);
	            temp = temp.next;
	        }
	    }
}

