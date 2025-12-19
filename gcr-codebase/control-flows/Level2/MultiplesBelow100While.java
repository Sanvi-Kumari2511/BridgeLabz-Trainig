import java.util.Scanner;

// Program to find all the multiples of a number taken as user input below 100 using while loop.

public class MultiplesBelow100While
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user's input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
             
             // checking conditions
             if(number <= 0 ||  number >= 100)
             {
             System.out.println("Enter a positive integer less than 100");
              return;
              }
              
              int counter = 100;
              System.out.println("Multiples of " + number + " below 100 are: ");
                   
              while(counter > 1)
              {
               if(i % number == 0)
               {
                System.out.println(counter);
               }

               counter--;

               }
               //closing the scanner 
                sc.close();
            }
 }
