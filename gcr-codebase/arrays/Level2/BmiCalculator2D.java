import java.util.Scanner;

public class BmiCalculator2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          
        //Taking inputs from users
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for(int i = 0; i < number; i++) {

        System.out.println("\nPerson " + (i+1));

        //Validating height of a person
        double height;
        do {
        System.out.print("Enter height in (m) : ");
        height = sc.nextDouble();
        if(height <= 0)
        System.out.println("Height must be positive");
         } 
        while(height <= 0);

       //Validating weight of a person
        double weight;
        do {
        System.out.print("Enter weight in (kg) : ");
        weight = sc.nextDouble();
        if(weight <= 0)
        System.out.println("Weight must be positive!");
         }
        while(weight <= 0);

        //Storing height & weight
        personData[i][0] = height;
        personData[i][1] = weight;

        //Calculating BMI of a person
        personData[i][2] = weight / (height * height);
        double bmi = personData[i][2];

        //Checking BMI category of a person
        if(bmi < 18.5)
        weightStatus[i] = "Underweight";
        else if(bmi >= 18.5 && bmi <= 24.9)
        weightStatus[i] = "Normal";
        else if(bmi >= 25.0 && bmi <= 39.9)
        weightStatus[i] = "Overweight";
        else
        weightStatus[i] = "Obese";
        }
         //Displaying outputs
        for(int i = 0; i < number; i++) {
        System.out.println("Person " + (i+1) + " : Height: " + personData[i][0] + ", Weight: " + personData[i][1] +  ", BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
    }
}
