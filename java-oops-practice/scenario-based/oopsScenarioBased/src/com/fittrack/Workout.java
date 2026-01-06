package com.fittrack;
import java.time.LocalDateTime;

public class Workout {
	
	    protected String type;           
	    protected double duration;       
	    protected double caloriesBurned;  
	    protected LocalDateTime startTime;
	    protected LocalDateTime endTime;

	    //Constructor
	    public Workout(String type, double duration) {
	        this.type = type;
	        this.duration = duration;
	    }

	    //Getter for calories burned
	    public double getCaloriesBurned() {
	        return caloriesBurned;
	    }

	    //Log the workout details
	    public void logWorkout() {
	        System.out.println(type + " workout logged. Duration: " + duration + " mins, Calories: " + caloriesBurned);
	    }

	    //Calculating calories
	    public void calculateCalories() {
	        caloriesBurned = duration * 5;
	    }
	}

