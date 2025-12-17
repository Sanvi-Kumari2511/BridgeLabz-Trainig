import java.util.Scanner;

//Calculation of area of triangle in square centimeter, square inches, and square feet
public class AreaOfTriangle 
{
    public static void main(String args[]) 
    {

         // Taking user's  input details
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base in cm:");
        double base = sc.nextDouble();

        System.out.println("Enter height in cm:");
        double height = sc.nextDouble();

        // Area of triangle in square centimeter
        double areaInCm = (0.5) * base * height;

        // converting centimeter to inches and calculating area of triangle in square inches
        double baseInInches = base / 2.54;
        double heightInInches = height / 2.54;
        double areaInInches = 0.5 * baseInInches * heightInInches;

        // converting inches to feet and calculating area of triangle in square feet
        double baseInFeet = baseInInches / 12.0;
        double heightInFeet = heightInInches / 12.0;
        double areaInFeet = 0.5 * baseInFeet * heightInFeet;
        
        // Displaying output
        System.out.println("Your area in cm is " + areaInCm + " while in feet is " + areaInFeet + " and inches is " + areaInInches);
    
     }
}
