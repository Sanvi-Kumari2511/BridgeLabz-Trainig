import java.util.Scanner;

// program to find the sum of numbers until the user enters 0 using while loop and break statement.

public class SumOfNaturalNumbersFor
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user input
             int number = sc.nextInt();
             if(number>0)
            {
            
            // Calculating sum of natural numbers
            int formulaBasedSum = (number*(number+1))/2;
            
            int loopBasedSum = 0;
             for(int i=number; i>0; i--)
             {
               loopBasedSum += i;
              }
               // printing the sum of natural numbers
               System.out.println("The sum of  natural numbers using formula " + formulaBasedSum + " and " + " the sum of  natural numbers using loop " + loopBasedSum);
              }              
              else{
               System.out.println("Number " + number + " is not natural number");
               }
              //closing the scanner 
               sc.close();
            }
     }