import java.util.Scanner;

// program to count down the number from the user input value to 1 using a for loop for a rocket launch.

public class CountdownUsingFor
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
     
            // Taking input from user
            System.out.print(" Enter a counter value : ");
            int counter = sc.nextInt();
 
            // print the counter value
             for(int i=counter; i>=1; i--)
             {
              System.out.println("Counter = " + i);
             }
       }
 }