package com.bagnballorganizer;

import java.util.ArrayList;

public class Bag implements Storable {
	
	    private String id;
	    private String color;
	    private int capacity;
	    private ArrayList<Ball> balls; 

	    //Constructor to initialize Bag details
	    public Bag(String id, String color, int capacity) {
	        this.id = id;
	        this.color = color;
	        this.capacity = capacity;
	        balls = new ArrayList<>();
	    }
	    
	    //getter method to get id
	    public String getId() {
	        return id;
	    }

	    //Adding a ball
	    public boolean addBall(Ball ball) {
	        if (balls.size() < capacity) {
	            balls.add(ball);
	            System.out.println("Added " + ball.getId() + " to Bag " + id);
	            return true;
	        } 
	        
	        else {
	            System.out.println("Bag " + id + " is full! Cannot add " + ball.getId());
	            return false;
	        }
	    }

	    //Removing a ball by ID
	    public boolean removeBall(String ballId) {
	        for (Ball ball : balls) {
	            if (ball.getId().equals(ballId)) {
	                balls.remove(ball);
	                System.out.println("Removed " + ballId + " from Bag " + id);
	                return true;
	            }
	        }
	        System.out.println("Ball " + ballId + " not found in Bag " + id);
	        return false;
	    }

	    //Displaying all balls in the bag
	    public void displayBalls() {
	        System.out.println("Bag " + id + " contains " + balls.size() + " balls:");
	        for (Ball ball : balls) {
	            ball.displayInfo();
	        }
	    }

	    //Get ball count
	    public int getBallCount() {
	        return balls.size();
	    }

	    //Displaying bag info(Override)
	    public void displayInfo() {
	        System.out.println("Bag[ID=" + id + ", Color=" + color + ", Capacity=" + capacity +
	                ", Balls=" + getBallCount() + "]");
	   }
}

