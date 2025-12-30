import java.util.Scanner;

public class TemperatureLogger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature over 7 days: ");
        double[] temperature = new double[7];
        double sum = 0;
        double maximum;

        //Taking input from user
        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperature[i] = sc.nextDouble();
            sum += temperature[i];
        }

        //Finding the maximum temperature
        maximum = temperature[0];
        for (int i = 1; i < temperature.length; i++) {
            if (temperature[i] > maximum) {
                maximum = temperature[i];
            }
        }

        double average = sum / temperature.length;

        //Displaying the results
        System.out.println("\nAverage: " + average);
        System.out.println("Maximum: " + maximum);
    }
}
