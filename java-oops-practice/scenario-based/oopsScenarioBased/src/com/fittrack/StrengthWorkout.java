package com.fittrack;

public class StrengthWorkout extends Workout  {

	    public StrengthWorkout(double duration) {
	        super("Strength", duration);
	    }

	    //Override
	    public void calculateCalories() {
	        caloriesBurned = duration * 6; // Strength training burns 6 cal per minute
	    }
	}


