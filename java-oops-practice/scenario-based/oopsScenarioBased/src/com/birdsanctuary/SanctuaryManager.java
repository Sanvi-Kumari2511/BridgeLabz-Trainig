
package com.birdsanctuary;
import java.util.*;

public class SanctuaryManager {
	
	    private ArrayList<Bird> birds = new ArrayList<>();

	    public void addBird(Bird bird) {
	        birds.add(bird);
	    }

	    public void displayAll() {
	        for (Bird b : birds) {
	            b.displayInfo();
	            b.eat();
	        }
	    }

	    public void displayFlyable() {
	        for (Bird b : birds) {
	            if (b instanceof Flyable) {
	                ((Flyable) b).fly();   
	            }
	        }
	    }

	    public void displaySwimmable() {
	        for (Bird b : birds) {
	            if (b instanceof Swimmable) {
	                ((Swimmable) b).swim();
	            }
	        }
	    }

	    public void deleteBirdById(String id) {
	        boolean removed = birds.removeIf(b -> b.getId().equals(id));
	        if (removed) {
	            System.out.println("Bird removed successfully.");
	        } else {
	            System.out.println("Bird with given ID not found.");
	        }
	    }
	   
	    public void report() {
	        int fly = 0, swim = 0, both = 0, neither = 0;

	        for (Bird b : birds) {
	            boolean f = b instanceof Flyable;
	            boolean s = b instanceof Swimmable;

	            if (f && s) both++;
	            else if (f) fly++;
	            else if (s) swim++;
	            else neither++;
	        }

	        System.out.println();
	    
	        System.out.println("====== Sanctuary Report ======");
	        
	        System.out.println();
	  
	        System.out.println("Flyable: " + fly);
	        System.out.println("Swimmable: " + swim);
	        System.out.println("Both: " + both);
	        System.out.println("Neither: " + neither);
	    }

	    // Reflection + Annotation
	    public void showDeveloperInfo() {
	        for (Bird b : birds) {
	        	
	            Class<?> cls = b.getClass();
	            
	            if (cls.isAnnotationPresent(DeveloperInfo.class)) {
	            	
	                DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
	                
	                System.out.println("Developed by: " + info.name() + " | Version: " + info.version());
	            }
	      }
	 }
}


