import java.util.Scanner;

// program to check whether a number is positive, negative, or zero.

public class PositiveNegativeZero
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
     
            // Taking input from user
            System.out.print(" Enter a number : ");
            int number = sc.nextInt();

            // Checking condition whether a number is positive, negative, or zero
            if(number > 0)
            {

             //Displaying  the outputs
              System.out.println("The number is positive"); 
              }
              else if(number < 0)
              {
              System.out.println("The number is negative"); 
             }
              else
            {
             System.out.println("The number is zero");
            }
       }
}