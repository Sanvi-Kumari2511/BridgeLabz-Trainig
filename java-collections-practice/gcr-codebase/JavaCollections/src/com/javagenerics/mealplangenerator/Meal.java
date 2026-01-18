package com.javagenerics.mealplangenerator;

public class Meal<T extends MealPlan> {
	 T mealPlan;

	    public Meal(T mealPlan) {
	        this.mealPlan = mealPlan;
	    }

	    public void showMeal() {
	        System.out.println("Generated: " + mealPlan.getMealType());
	    }
}
