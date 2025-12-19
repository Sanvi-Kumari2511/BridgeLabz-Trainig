import java.util.Scanner;

//  Program to print odd and even numbers between 1 to the number entered by the user.

public class MultiplicationTable
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user's input
             System.out.print("Enter a number: ");
             int number = sc.nextInt();

             System.out.println("\nMultiplication table of " + number + " from 6 to 9: ");     
             for(int i=6; i<=9; i++)
             {                                 
             System.out.println(number + " * " + i + " = " + (number * i));
              }
             //closing the scanner 
             sc.close();
          }
  }
