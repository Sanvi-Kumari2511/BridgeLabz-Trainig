package com.fittrack;

public class CardioWorkout extends Workout {

	    public CardioWorkout(double duration) {
	        super("Cardio", duration);
	    }

	    //Override
	    public void calculateCalories() {
	        caloriesBurned = duration * 8; 
	    }
	}

