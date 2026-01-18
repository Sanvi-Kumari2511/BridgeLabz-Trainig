package com.javagenerics.mealplangenerator;

public class MealGenerator {
	//Generic method to validate and generate meal
    public static <T extends MealPlan> Meal<T> generateMeal(T mealPlan) {

        //simple validation
        if (mealPlan == null) {
            throw new IllegalArgumentException("Invalid meal plan");
        }

        return new Meal<>(mealPlan);
    }
}
