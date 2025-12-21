import java.util.Scanner;
 public class UnitConvertor { 
 
   //Creating a method to convert km to miles and returning a value
   public static double kmToMiles(double km){
   double km2miles = 0.621371;
   return km * km2miles;
   }
   
   //Creating a method to convert miles to km2miles and returning the value
    public static double milesToKm(double miles){
	double miles2km = 1.60934;
	return miles * miles2km;
	}
	
	//Creating a method to convert meters to feet and returning the value
	public static double metersToFeet(double meters){
	double meters2feet = 3.28084;
	return meters * meters2feet;
	}
	
	//Creating a method to convert feet to meters and returning the value
	public static double feetToMeters(double feet){
	double feet2meters = 0.3048;
	return feet * feet2meters;
	}
	
	public static void main(String args []){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter distance in km : ");
        double km = sc.nextDouble();
        System.out.println(km + " km = " + kmToMiles(km) + " miles");

        //User input for miles
        System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles = " + milesToKm(miles) + " km");

        //User input for meters
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters = " + metersToFeet(meters) + " feet");

        //User input for feet
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet = " + feetToMeters(feet) + " meters");

    }
	}
   
   