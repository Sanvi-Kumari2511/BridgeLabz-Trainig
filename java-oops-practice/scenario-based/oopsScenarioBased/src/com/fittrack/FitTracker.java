package com.fittrack;
import java.util.ArrayList;
import java.util.List;

public class FitTracker implements ITrackable {
	

	    private UserProfile user;           
	    private List<Workout> workoutLog;   

	    //Constructor
	    public FitTracker(UserProfile user) {
	        this.user = user;
	        this.workoutLog = new ArrayList<>();
	    }

	    //Start workout (Override)
	    public void startWorkout() {
	        System.out.println(user.getName() + " started workout");
	    }

	    //Stop workout ( Override)
	    public void stopWorkout() {
	        System.out.println(user.getName() + " finished workout");
	    }

	    //Adding a workout to the log
	    public void addWorkout(Workout workout) {
	        workout.calculateCalories();  
	        workoutLog.add(workout);      
	        workout.logWorkout();       
	        System.out.println("Remaining calories to reach goal: " + user.remainingCalories(getTotalCalories()));
	    }

	    //Calculating total calories burned today
	    private double getTotalCalories() {
	        double total = 0;
	        for (Workout w : workoutLog) {
	            total += w.getCaloriesBurned();
	        }
	        return total;
	    }

	    //Printing summary of all workouts
	    public void showSummary() {
	        System.out.println("Workout Summary for " + user.getName());
	        System.out.println("Total Calories Burned: " + getTotalCalories());
	        System.out.println("Daily Goal: " + user.getDailyGoalCalories());
	        System.out.println("Remaining: " + user.remainingCalories(getTotalCalories()));
	    }
	}
