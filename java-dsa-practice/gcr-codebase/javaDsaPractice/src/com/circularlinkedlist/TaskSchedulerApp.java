package com.circularlinkedlist;
import java.util.Scanner;
 
public class TaskSchedulerApp {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        TaskList list = new TaskList();
	        int choice;

	        do {
	            System.out.println("\n--- Task Scheduler ---");
	            System.out.println("1. Add Task at Beginning");
	            System.out.println("2. Add Task at End");
	            System.out.println("3. Add Task at Position");
	            System.out.println("4. Remove Task by ID");
	            System.out.println("5. View Current & Next Task");
	            System.out.println("6. Display All Tasks");
	            System.out.println("7. Search Task by Priority");
	            System.out.println("8. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    list.addAtBeginning(1, "Design Module", 1, "10-01-2026");
	                    break;

	                case 2:
	                    list.addAtEnd(2, "Write Code", 2, "12-01-2026");
	                    break;

	                case 3:
	                    list.addAtPosition(2, 3, "Testing", 1, "15-01-2026");
	                    break;

	                case 4:
	                    list.removeByTaskId(2);
	                    break;

	                case 5:
	                    list.viewNextTask();
	                    break;

	                case 6:
	                    list.displayAllTasks();
	                    break;

	                case 7:
	                    list.searchByPriority(1);
	                    break;

	                case 8:
	                    System.out.println("Scheduler closed");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }

	        } 
	        while (choice != 8);
	    }
	}

