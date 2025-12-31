package com.inheritance.leveltwo;

public class MainRestaurant {
	    public static void main(String[] args) {

	        Worker chef = new Chef("Sanvi", 101);
	        Worker waiter = new Waiter("Sandip", 102);

	        chef.performDuties();
	        System.out.println();
	        waiter.performDuties();
	    }
	}

