package com.bagnballorganizer;

import java.util.ArrayList;
import java.util.Scanner;

public class BallOrganizer {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Bag> bags = new ArrayList<>();

	        //Creating some bags
	        System.out.print("Enter number of bags: ");
	        int numBags = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < numBags; i++) {
	        	
	            System.out.println("Enter Bag " + (i + 1) + " ID, Color, Capacity:");
	            String id = sc.next();
	            String color = sc.next();
	            int capacity = sc.nextInt();
	            bags.add(new Bag(id, color, capacity));
	        }

	        boolean exit = false;
	        
	        while (!exit) {
	        	
	            System.out.println("\nOptions:\n1. Add Ball\n2. Remove Ball\n3. Display Balls in Bag\n4. Display All Bags\n5. Exit");
	            System.out.print("Choose option: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	            
	                case 1:
	                    System.out.print("Enter Bag ID to add ball: ");
	                    String bagIdAdd = sc.next();
	                    Bag bagAdd = findBag(bags, bagIdAdd);
	                    
	                    if (bagAdd != null) {
	                    	
	                        System.out.print("Enter Ball ID, Color, Size: ");
	                        String bId = sc.next();
	                        String bColor = sc.next();
	                        String bSize = sc.next();
	                        bagAdd.addBall(new Ball(bId, bColor, bSize));
	                    }
	                    break;
	                    
	                case 2:
	                	
	                    System.out.print("Enter Bag ID to remove ball from: ");
	                    String bagIdRemove = sc.next();
	                    Bag bagRemove = findBag(bags, bagIdRemove);
	                    
	                    if (bagRemove != null) {
	                    	
	                        System.out.print("Enter Ball ID to remove: ");
	                        String bIdRemove = sc.next();
	                        bagRemove.removeBall(bIdRemove);
	                    }
	                    break;
	                    
	                case 3:
	                	
	                    System.out.print("Enter Bag ID to display balls: ");
	                    String bagIdDisplay = sc.next();
	                    Bag bagDisplay = findBag(bags, bagIdDisplay);
	                    
	                    if (bagDisplay != null) {
	                        bagDisplay.displayBalls();
	                    }
	                    break;
	                    
	                case 4:
	                	
	                    System.out.println("All Bags:");
	                    for (Bag b : bags) {
	                        b.displayInfo();
	                    }
	                    break;
	                    
	                case 5:
	                	
	                    exit = true;
	                    break;
	                    
	                default:
	                    System.out.println("Invalid option!");
	            }
	        }
	    }

	    //Helper method to find a bag by ID
	    private static Bag findBag(ArrayList<Bag> bags, String id) {
	        for (Bag b : bags) {
	            if (b.getId().equals(id)) {
	                return b;
	            }
	        }
	        System.out.println("Bag with ID " + id + " not found!");
	        return null;
	    }
}

