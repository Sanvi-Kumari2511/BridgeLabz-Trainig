import java.util.Scanner;

// program to find the sum of numbers until the user enters 0.

public class SumOfNumbers
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
     
             double total = 0.0;

            // Taking input from user
             System.out.print(" Enter a user input value : ");
             double value = sc.nextDouble();

 
            // printing the sum of numbers
             while(value != 0)
             {
              total += value;
               System.out.print("Enter a user input value again");
                value = sc.nextDouble();
              }
              System.out.println("Total value = " + total);

              //closing the scanner 
               sc.close();
            }
     }