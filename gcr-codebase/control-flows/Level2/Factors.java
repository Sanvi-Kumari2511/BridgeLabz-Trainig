import java.util.Scanner;

// Programto find factors of a number

public class Factors
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user's input
             System.out.print("Enter a number: ");
             int number = sc.nextInt();
             

             // Check the number is positive
              if(number < 0)
               {
              System.out.println(number + " is negative number");
              return;
              }
                            
               System.out.println("Factors of " + number + " are: ");
                
                for(int i = 1; i < number; i++)
                {
                 if(number % i ==0)
                 {
                  System.out.println("The value is  " + i);
                 }
                 }
                
               //closing the scanner 
                sc.close();
            }
 }
