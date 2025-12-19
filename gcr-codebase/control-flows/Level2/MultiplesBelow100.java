import java.util.Scanner;

// Program to find all the multiples of a number taken as user input below 100.

public class MultiplesBelow100
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

              System.out.println("Multiples of " + number + " below 100 are: ");
                   
              for(int i = 100; i >= 1; i--)
              {
               if(i % number == 0)
               {
                System.out.println(i);
               }
               }
               //closing the scanner 
                sc.close();
            }
 }
