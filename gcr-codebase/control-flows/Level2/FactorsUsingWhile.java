import java.util.Scanner;

// Program to find factors of a number using while loop

public class FactorsUsingWhile
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
                
                int i=1;
                
                // loop until i is amaller than number
                while(i < number)
                {
                 if(number % i ==0)
                 {
                  System.out.println("The value is  " + i);
                 }
               
                 i++;

                 }
                
               //closing the scanner 
                sc.close();
            }
 }
