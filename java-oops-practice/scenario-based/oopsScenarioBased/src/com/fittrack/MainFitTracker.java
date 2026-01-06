package com.fittrack;

public class MainFitTracker {

	    public static void main(String[] args) {

	        //Creatingn a user with a custom daily calorie goal
	        UserProfile user1 = new UserProfile("Sanvi", 28, 65, 600);

	        //Initializing tracker for the user
	        FitTracker tracker = new FitTracker(user1);

	        //Start workout
	        tracker.startWorkout();

	        //Adding Cardio and Strength workouts
	        CardioWorkout cardio = new CardioWorkout(30);     
	        StrengthWorkout strength = new StrengthWorkout(45);

	        tracker.addWorkout(cardio);
	        tracker.addWorkout(strength);

	        //Stop workout
	        tracker.stopWorkout();

	        //Show workout summary
	        tracker.showSummary();
	    }
	}

