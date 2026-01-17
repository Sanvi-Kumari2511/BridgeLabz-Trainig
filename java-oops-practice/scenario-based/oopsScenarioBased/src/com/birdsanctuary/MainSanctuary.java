package com.birdsanctuary;
import java.util.Scanner;

public class MainSanctuary {
  
	public static void main(String args []) {
		
		 SanctuaryManager manager = new SanctuaryManager();
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        System.out.println("Welcome to EcoWing Bird Sanctuary");

	        do {
	            System.out.println("\n1. Add Bird");
	            System.out.println("2. Display All Birds");
	            System.out.println("3. Display All Flying Birds");
	            System.out.println("4. Display All Swimming Birds");
	            System.out.println("5. Display Both Flying & Swimming Birds");
	            System.out.println("6. Delete Bird by ID");
	            System.out.println("7. Sanctuary Report");
	            System.out.println("8. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();
	            sc.nextLine(); 

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter Bird ID: ");
	                    String id = sc.nextLine();

	                    System.out.print("Enter Bird Name: ");
	                    String name = sc.nextLine();

	                    System.out.println("Select Bird Type:");
	                    System.out.println("1. Eagle (Fly)");
	                    System.out.println("2. Duck (Fly & Swim)");
	                    System.out.println("3. Penguin (Swim)");
	                    System.out.println("4. Kiwi (Neither)");

	                    int type = sc.nextInt();

	                    Bird bird = null;

	                    switch (type) {
	                        case 1: bird = new Eagle(id, name); break;
	                        case 2: bird = new Duck(id, name); break;
	                        case 3: bird = new Penguin(id, name); break;
	                        case 4: bird = new Kiwi(id, name); break;
	                        default:
	                            System.out.println("Invalid bird type.");
	                    }

	                    if (bird != null) {
	                        manager.addBird(bird);
	                        System.out.println("Bird added successfully.");
	                    }
	                    break;

	                case 2:
	                    manager.displayAll();
	                    break;

	                case 3:
	                    manager.displayFlyable();
	                    break;

	                case 4:
	                    manager.displaySwimmable();
	                    break;

	                case 5:
	                    System.out.println("Birds that can both Fly & Swim:");
	                    manager.displayFlyable();
	                    manager.displaySwimmable();
	                    break;

	                case 6:
	                    System.out.print("Enter Bird ID to delete: ");
	                    String deleteId = sc.nextLine();
	                    manager.deleteBirdById(deleteId);
	                    break;

	                case 7:
	                    manager.report();
	                    break;

	                case 8:
	                    System.out.println("Thank you for visiting Bird Sanctuary!");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }

	        } while (choice != 8);
	    }
	}