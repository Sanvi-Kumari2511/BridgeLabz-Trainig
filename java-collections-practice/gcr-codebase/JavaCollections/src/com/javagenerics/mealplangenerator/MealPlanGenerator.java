package com.javagenerics.mealplangenerator;

public class MealPlanGenerator {
	public static void main(String[] args) {

        //User selects meal types
        VegetarianMeal veg = new VegetarianMeal();
        KetoMeal keto = new KetoMeal();

        //Generating meals dynamically
        Meal<VegetarianMeal> vegMeal =
                MealGenerator.generateMeal(veg);

        Meal<KetoMeal> ketoMeal =
                MealGenerator.generateMeal(keto);

        //Displaying meals
        vegMeal.showMeal();
        ketoMeal.showMeal();
    }
}
