import java.util.Scanner;

public class TemperatureConverter {

    //Creating a method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    //Creating a method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
       
       public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        //Displaying the result
        System.out.println("Celsius to Fahrenheit: " +
                celsiusToFahrenheit(celsius));

        System.out.println("Fahrenheit to Celsius: " +
                fahrenheitToCelsius(fahrenheit));
    }
}
