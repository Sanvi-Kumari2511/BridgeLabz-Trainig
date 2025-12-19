import java.util.Scanner;

// Program to print the greatest factor of a number beside itself using a while loop.

public class GreatestFactorsWhile
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user's input
             System.out.print("Enter a number: ");
             int number = sc.nextInt();
             
             int greatestFactor = 1;
             int counter = number - 1;
              while(counter >= 1)
               {
          
               // checking factor
               if(number % counter == 0)
               {
                greatestFactor = counter;
                break;
                }
                counter--;
                }
                System.out.println("Greatest factor of " + number + " is: " +greatestFactor);
                   
               //closing the scanner 
                sc.close();
            }
 }
