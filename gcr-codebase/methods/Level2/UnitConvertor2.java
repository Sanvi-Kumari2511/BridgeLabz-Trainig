import java.util.Scanner;
 public class UnitConvertor2 { 
 
   //Creating method to convert yards to feet and returning the value
   public static double yardsToFeet(double yards){
   double yards2feet = 3;
   return yards * yards2feet;
   }
   
   //Creating method to convert feet to yards and returning the value
   public static double feetToYards(double feet){
   double feet2yards = 0.333333;
   return feet * feet2yards;
   }
   
   //Creating method to convert meters to inches and returning the value
   public static double metersToInches(double meters){
   double meters2inches = 39.3701;
   return meters * meters2inches;
   }
   
   //Creating method to convert inches to meters and returning the value
   public static double inchesToMeters(double inches){
   double inches2meters = 0.0254;
   return inches * inches2meters;
   }
   
   //Creating method to convert inches to centimeters and returning the value
   public static double inchesToCentimeters(double inches){
   double inches2centimeters = 2.54;
   return inches * inches2centimeters;
   }
   
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        //Taking input from user and displaaying the results
        System.out.print("Enter value in yards: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards = " + yardsToFeet(yards) + " feet");

        System.out.print("Enter value in feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet = " + feetToYards(feet) + " yards");

        System.out.print("Enter value in meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters = " + metersToInches(meters) + " inches");

        System.out.print("Enter value in inches: ");
        double inches1 = sc.nextDouble();
        System.out.println(inches1 + " inches = " + inchesToMeters(inches1) + " meters");

        System.out.print("Enter value in inches: ");
        double inches2 = sc.nextDouble();
        System.out.println(inches2 + " inches = " + inchesToCentimeters(inches2) + " centimeters");
		}
		}