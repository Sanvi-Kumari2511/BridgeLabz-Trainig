package com.singlylinkedlist;

import java.util.Scanner;

public class StudentApp {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        StudentList list = new StudentList();
	        int choice;

	        do {
	            System.out.println("\n--- Students Record ---");
	            System.out.println("1. Insert at Start");
	            System.out.println("2. Insert at End");
	            System.out.println("3. Insert at Position");
	            System.out.println("4. Delete by Roll Number");
	            System.out.println("5. Search by Roll Number");
	            System.out.println("6. Update Grade");
	            System.out.println("7. Display All");
	            System.out.println("8. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    list.insertAtStart(11, "Sanvi", 21, 'A');
	                    break;

	                case 2:
	                    list.insertAtEnd(12, "Swati", 21, 'B');
	                    break;

	                case 3:
	                    list.insertAtPosition(2, 13, "Sandip", 22, 'A');
	                    break;

	                case 4:
	                    list.removeByRoll(12);
	                    break;

	                case 5:
	                    list.findStudent(11);
	                    break;

	                case 6:
	                    list.modifyGrade(11, 'A');
	                    break;

	                case 7:
	                    list.showAll();
	                    break;

	                case 8:
	                    System.out.println("Exit from the program");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }

	        } 
	        while (choice != 8);
	    }
	}

