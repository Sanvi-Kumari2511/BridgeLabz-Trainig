import java.util.Scanner;

//program to check or the natural number and write the sum of n      natural numbers 

public class NaturalNumber
{
    public static void main(String args[])
       {
         Scanner sc=new Scanner(System.in);
     
         // Taking input from user
          System.out.print(" Enter natural number : ");
          int number = sc.nextInt();

           // Checking condition of natural numbers
           if(number>0)
           {
            
            // Calculating sum of natural numbers
            int sum = (number*(number+1))/2;

            //Displaying if the number is a positive integer then the output is
            System.out.println("The sum of " + number + " natural numbers is " + sum); 
             }
            else
            {
              System.out.println("The number " + number + " is not natural number"); 
             }
       }
}