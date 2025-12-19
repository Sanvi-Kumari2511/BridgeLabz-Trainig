import java.util.Scanner;

// Program to print the greatest factor of a number beside itself using a loop.

public class GreatestFactors
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user's input
             System.out.print("Enter a number: ");
             int number = sc.nextInt();
             
             int greatestFactor = 1;

             
              for(int i = number - 1; i >= 1; i--)
               {
               if(number % i == 0)
               {
                greatestFactor = i;
                break;
                }
                }
                System.out.println("Greatest factor of " + number + " is: " +greatestFactor);
                   
               //closing the scanner 
                sc.close();
            }
 }
