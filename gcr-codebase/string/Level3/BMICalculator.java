import java.util.*;

public class BMICalculator {

    //Creating a method to calculate BMI and status
    public static String[] calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi < 18.5 && bmi > 24.9)
            status = "Normal";
        else if (bmi < 25.0 && bmi > 39.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[] { String.format("%.2f", bmi), status };
    }

    //Creating a method that takes 2D array of height and weight as parameters
    public static String[][] findResult(double[][] heightWeight) {

        String[][] result = new String[heightWeight.length][4];

        for (int i = 0; i < heightWeight.length; i++) {

            double weight = heightWeight[i][0];
            double height = heightWeight[i][1];

            String[] data = calculateBMI(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = data[0];
            result[i][3] = data[1];
        }
        return result;
    }

    //Creating a method to display results in tabular format
    public static void show(String[][] arr) {

        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                (i + 1) + "\t" + arr[i][0] + "\t\t"
                + arr[i][1] + "\t\t"
                + arr[i][2] + "\t" + arr[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2]; 

        System.out.println("Enter weight(kg) and height(cm) of 10 persons:");

        for (int i = 0; i < 10; i++) {

            System.out.print("Person " + (i + 1) + " weight: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " height: ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = findResult(data);

        show(result);
    }
}
