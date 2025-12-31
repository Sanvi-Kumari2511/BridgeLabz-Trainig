package com.inheritance.leveltwo;

public class Waiter extends PersonRestaurant implements Worker {
	
	    Waiter(String name, int id) {
	        super(name, id);
	    }

	    //Override
	    public void performDuties() {
	        System.out.println("Waiter is taking orders and serving customers");
	    }
	}

