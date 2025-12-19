import java.util.Scanner;

//  Program to print odd and even numbers between 1 to the number entered by the user.

public class Bonus
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user's input
             System.out.print("Enter salary: ");
             double salary = sc.nextDouble();

             System.out.print("Enter years of service: ");
             int years = sc.nextInt();
            
             // Check the condition
              if(years>5)
               {
               double bonus = salary * 0.05;
               System.out.println("Bonus : " + bonus);
               }
               else
               {
               System.out.println("No bonus");
               }
               //closing the scanner 
                sc.close();
            }
 }
