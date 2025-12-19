import java.util.Scanner;

//  Program FizzBuzz, take a number as user input, and check for a positive integer.

public class FizzBuzzProgram
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user's input
             System.out.print("Enter a number : ");
             int number = sc.nextInt();
            
             // Check the nuber is positive or not
              if(number>0)
               {
              System.out.println(number + " is a positive number");
               }
              else
               {
              System.out.println(number + " is a negative number");
               }
               for(int i=1; i<=number; i++)
               {
               if(i % 3 == 0 && i % 5 ==0)
               {
               System.out.println("FizzBuzz");
                }
               else if (i % 3==0)
               {
               System.out.println("Fizz");
                }
                else if (i % 5 == 0)
                {
                  System.out.println("Buzz");
                 }
                 else
                 {
                  System.out.println("The Numbers are: " + i);
                 }
                 }

               //closing the scanner 
                sc.close();
            }
 }
