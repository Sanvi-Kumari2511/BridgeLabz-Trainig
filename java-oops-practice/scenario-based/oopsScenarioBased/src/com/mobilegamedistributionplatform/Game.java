package com.mobilegamedistributionplatform;

public class Game {

	    //Game details
	    protected String title;
	    protected String genre;
	    protected double price;
	    protected double rating;

	    
	     //Constructor for paid game
	    public Game(String title, String genre, double price, double rating) {
	        this.title = title;
	        this.genre = genre;
	        this.price = price;
	        this.rating = rating;
	    }

	    
	    //Constructor for free games (price = 0)
	    public Game(String title, String genre, double rating) {
	        this(title, genre, 0.0, rating);
	    }

	    
	     //Applies seasonal discount using operators
	    public void applySeasonalOffer(double discountPercentage) {
	        price = price - (price * discountPercentage / 100);
	    }

	    public String getTitle() {
	        return title;
	    }

	    public double getPrice() {
	        return price;
	    }
}
