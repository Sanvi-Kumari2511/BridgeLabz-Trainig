import java.util.Scanner;
 public class UnitConvertor3 { 
 
   //Creating method to convert Fahrenheit to Celsius and returning the value
   public static double fahrenheitToCelsius(double fahrenheit){
   double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
   return fahrenheit2celsius;
   }
   
   //Creating method to convert Celsius to Fahrenheit and returning the value
   public static double celsiusToFahrenheit(double celsius){
   double celsius2fahrenheit = (celsius * 9 / 5) + 32;
   return celsius2fahrenheit;
   }
   
   //Creating method to convert pounds to kilograms and returning the value
   public static double poundsToKilograms(double pounds){
   double pounds2kilograms = 0.453592;
   return pounds * pounds2kilograms;
   }
   
   //Creating method to convert kilograms to pounds and returning the value
   public static double kilogramsToPounds(double kilograms){
   double kilograms2pounds = 2.20462;
   return kilograms * kilograms2pounds;
   }
   
   //Creating method to convert gallons to liters and returning the value
   public static double gallonsToLiters(double gallons){
   double gallons2liters = 3.78541; 
   return gallons * gallons2liters;
   }
   
   //Creating method to convert liters to gallons and returning the value
   public static double litersToGallons(double liters){
   double liters2gallons = 0.264172; 
   return liters * liters2gallons;
   }
   
   public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
		//Taking input from user and displaying results
        System.out.print("Enter value in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit = " + fahrenheitToCelsius(fahrenheit) + " Celsius");

        System.out.print("Enter value in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println(celsius + " Celsius = " + celsiusToFahrenheit(celsius) + " Fahrenheit");

        System.out.print("Enter value in Pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " pounds = " + poundsToKilograms(pounds) + " kilograms");

        System.out.print("Enter value in Kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println(kilograms + " kilograms = " + kilogramsToPounds(kilograms) + " pounds");

        System.out.print("Enter value in Gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons = " + gallonsToLiters(gallons) + " liters");

        System.out.print("Enter value in Liters: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters = " + litersToGallons(liters) + " gallons");

        }
        }
   
   
   