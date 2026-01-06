package com.fittrack;

public class UserProfile {
	
	    private String name;              
	    private int age;                 
	    private double weight;             
	    private double dailyGoalCalories;  

	    //Constructor with default daily goal
	    public UserProfile(String name, int age, double weight) {
	        this.name = name;
	        this.age = age;
	        this.weight = weight;
	        this.dailyGoalCalories = 500; // Default goal
	    }

	    //Constructor with custom daily goal
	    public UserProfile(String name, int age, double weight, double dailyGoalCalories) {
	        this.name = name;
	        this.age = age;
	        this.weight = weight;
	        this.dailyGoalCalories = dailyGoalCalories;
	    }

	    //Getters
	    public String getName() { return name; }
	    public int getAge() { return age; }
	    public double getWeight() { return weight; }
	    public double getDailyGoalCalories() { return dailyGoalCalories; }

	    //Setter for weight 
	    public void setWeight(double weight) { this.weight = weight; }

	    //Calculating remaining calories to reach daily goal
	    public double remainingCalories(double caloriesBurned) {
	        return dailyGoalCalories - caloriesBurned;
	    }
	}

