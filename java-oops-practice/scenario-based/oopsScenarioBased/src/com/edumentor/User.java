package com.edumentor;

public class User {
	
	    protected String name;
	    protected String email;
	    protected int userId;
        
	    //Constructor to access the user's details
	    public User(String name, String email, int userId) {
	        this.name = name;
	        this.email = email;
	        this.userId = userId;
	    }
        
	    //Method to display the user's details
	    public void displayUser() {
	        System.out.println("User: " + name + ", Email: " + email + ", ID: " + userId);
	    }
	}


