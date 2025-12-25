import java.util.Scanner;

public class BmiFitnessTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaring the variables
        double height;
        double weight;
        double bmi;

        //Taking input from user
        System.out.print("Enter height (meters): ");
        height = sc.nextDouble();

        System.out.print("Enter weight (kilograms): ");
        weight = sc.nextDouble();

        //Calculating BMI
        bmi = weight / (height * height);

        System.out.println("BMI is: " + bmi);

        //Checking the conditions for BMI
        if (bmi < 18.5) {
            System.out.println("Category of BMI : Underweight");
        } 
		else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category of BMI: Normal");
        } 
		else {
            System.out.println("Category of BMI: Overweight");
        }
    }
}
