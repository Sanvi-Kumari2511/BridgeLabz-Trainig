package com.smartsurveyanalyzer;

public class Feedback <T> {
	 private T type;         
	    private String message;  
	    private int rating;     

	    //Constructor to initialize feedback details
	    public Feedback(T type, String message, int rating) {
	        this.type = type;
	        this.message = message;
	        this.rating = rating;
	    }

	    //Method to get ratings
	    public int getRating() {
	        return rating;
	    }

	    //Method to get message
	    public String getMessage() {
	        return message;
	    }

	    //Method to get type
	    public T getType() {
	        return type;
	    }
}
