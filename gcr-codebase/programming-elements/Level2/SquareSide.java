import java.util.Scanner;

public class SquareSide 
{
    public static void main(String[] args) 
    {
        // Taking inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculating perimeter of square
        double side = perimeter / 4.0;

        // Displayning result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}





