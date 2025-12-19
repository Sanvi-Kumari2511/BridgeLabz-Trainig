import java.util.Scanner;

// Program to find the power of a number usingn while loop.

public class PowerWhile
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user's input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
             
            System.out.print("Enter power: ");
            int power = sc.nextInt();
             
             // checking conditions for positive number
             if(number < 0)
             {
             System.out.println(number + " is negative number");
             return;            
              }

              int result =1;
              int counter = 0;
                         
              while(counter < power)
              {
               result = result * number;
               }
               counter++;

                System.out.println(number + " raised to the power " + power + " is " + result);
                            
               //closing the scanner 
                sc.close();
            }
   }
