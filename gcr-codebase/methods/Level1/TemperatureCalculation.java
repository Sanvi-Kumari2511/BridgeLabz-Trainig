import java.util.Scanner;

 public class TemperatureCalculation { 

    //Creating a method
	public static double calculateWindChill(double temperature, double windSpeed){
	double windChill = + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
	return windChill;
	}
	
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	
	//Taking user's input
	System.out.println("Enter Temperature : ");
	double temperature = sc.nextDouble();
	
	System.out.println("Enter Windspeed : ");
	double windSpeed = sc.nextDouble();
	
	//Creating object
	TemperatureCalculation object = new TemperatureCalculation();
	
	//Calling method
	double windResult = object.calculateWindChill(temperature, windSpeed);
	
	//Displaying results
	System.out.println("Wind Speed is : " + windResult);
	}
	}
	
	
	