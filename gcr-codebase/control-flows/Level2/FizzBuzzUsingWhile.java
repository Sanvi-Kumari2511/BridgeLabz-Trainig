import java.util.Scanner;

//  Program FizzBuzz, take a number as user input, and check for a positive integer using while loop.

public class FizzBuzzUsingWhile
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user's input
             System.out.print("Enter a number : ");
             int number = sc.nextInt();
            
             // Check the nuber is positive
              if(number < 0)
               {
              System.out.println(number + " is a negative number");
               return;
               }
             
               int i=1;
               while(i<=number)
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

                 i++;

                 }

               //closing the scanner 
                sc.close();
            }
 }
