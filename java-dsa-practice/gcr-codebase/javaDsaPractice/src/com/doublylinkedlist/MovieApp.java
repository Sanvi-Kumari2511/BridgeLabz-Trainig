package com.doublylinkedlist;
import java.util.Scanner; 

public class MovieApp {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        MovieList list = new MovieList();
	        int choice;

	        do {
	            System.out.println("\n--- Movie Management System ---");
	            System.out.println("1. Add Movie at Beginning");
	            System.out.println("2. Add Movie at End");
	            System.out.println("3. Add Movie at Position");
	            System.out.println("4. Remove Movie by Title");
	            System.out.println("5. Search Movie by Director");
	            System.out.println("6. Search Movie by Rating");
	            System.out.println("7. Update Movie Rating");
	            System.out.println("8. Display Movies Forward");
	            System.out.println("9. Display Movies Reverse");
	            System.out.println("10. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    list.addAtBeginning("Inception", "Nolan", 2010, 9.0);
	                    break;

	                case 2:
	                    list.addAtEnd("Interstellar", "Nolan", 2014, 8.8);
	                    break;

	                case 3:
	                    list.addAtPosition(2, "Avatar", "Cameron", 2009, 8.0);
	                    break;

	                case 4:
	                    list.removeByTitle("Avatar");
	                    break;

	                case 5:
	                    list.searchByDirector("Nolan");
	                    break;

	                case 6:
	                    list.searchByRating(8.8);
	                    break;

	                case 7:
	                    list.updateRating("Inception", 9.5);
	                    break;

	                case 8:
	                    list.displayForward();
	                    break;

	                case 9:
	                    list.displayReverse();
	                    break;

	                case 10:
	                    System.out.println("Program exit");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }

	        } while (choice != 10);
	    }
	}

