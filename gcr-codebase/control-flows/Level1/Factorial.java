import java.util.Scanner;

// Program to find the factorial of an integer entered by the user.

public class Factorial
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user input
             System.out.print("Take a number : ");
             int number = sc.nextInt();
             int i=number; 
             if(number>=0)
             {
             int factorial=1;
             while(number>0)
             {
              factorial *= number;
              number--;
              }
              System.out.println("The factorial of " + i + " is " + factorial);
             }
             else
              {
               System.out.println("There is no factorial for negative numbers");
               }
             //closing the scanner 
             sc.close();
            }
      }
