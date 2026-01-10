package com.onlinelearningportal;

public class Course {
	
	    private String title;           
	    private Instructor instructor; 
	    private double rating;          
	    private String[] modules;       
	    private String review;          

	    //Constructor with default modules
	    public Course(String title, Instructor instructor) {
	        this.title = title;
	        this.instructor = instructor;
	        this.modules = new String[] { "Introduction", "Basics", "Advanced" };
	        this.review = "Internal review only";
	        this.rating = 0.0;
	    }

	    //Constructor with custom module list
	    public Course(String title, Instructor instructor, String[] modules) {
	        this.title = title;
	        this.instructor = instructor;
	        this.modules = modules;
	        this.review = "Internal review only";
	        this.rating = 8.0;
	    }

	    //Protected method to update rating (encapsulation)
	    protected void updateRating(double newRating) {
	        if (newRating >= 0 && newRating <= 5) {
	            rating = newRating;
	        }
	    }

	    //Public getter for rating
	    public double getRating() {
	        return rating;
	    }

	    //Getter for review
	    public String getReview() {
	        return review;
	    }
	}

