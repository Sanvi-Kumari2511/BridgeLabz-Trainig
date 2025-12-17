import java.util.Scanner;

public class DistanceConverter 
{
    public static void main(String[] args) 
    {
        // Taking inputs from users
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        // Converting feet into yards and miles
        double yards = feet / 3.0;               
        double miles = yards / 1760.0;   

        // Displaying outputs
        System.out.println("Your distance in yards is " + yards + " while in miles is " + miles + " and in feet is " + feet);
     }
}





