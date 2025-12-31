package com.inheritance.leveltwo;

class Chef extends PersonRestaurant implements Worker{
	

	    Chef(String name, int id) {
	        super(name, id);
	    }

	    //Override
	    public void performDuties() {
	    
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Role: Chef");
	        System.out.println("Duties: cooking food");
	    }
	}


