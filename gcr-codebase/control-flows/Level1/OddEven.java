import java.util.Scanner;

//  Program to print odd and even numbers between 1 to the number entered by the user.

public class OddEven
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
              
             // Taking user's input
             System.out.print("Enter a number : ");
             int number = sc.nextInt();
            
             // Check the nuber is natural number 
              if(number <= 0)
               {
              System.out.println(number + " is not a natural number");
               return;
               }
                            
               for(int i=1; i<=number; i++)
               {
               if(i % 2 == 0)
               {
               System.out.println(i + " is an even number");
                }
               else
               {
               System.out.println(i + " is an odd number");
                }
                }

               //closing the scanner 
                sc.close();
            }
 }
