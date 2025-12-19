import java.util.Scanner;

// program to find the sum of numbers until the user enters 0 using while loop and break statement.

public class SumOfNumbersUsingWhile
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
     
             double total = 0.0;

             while(true)
             {
               // Taking input from user
             System.out.print(" Enter a user input value : ");
             int value = sc.nextInt();

             if(value<=0)
             {
             break;
              }

              total += value;
              } 

               // printing the sum of numbers
               System.out.println("Total value = " + total);

              //closing the scanner 
               sc.close();
            }
     }