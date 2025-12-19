import java.util.Scanner;

// program to count down the number from the user input value to 1 using a while loop for a rocket launch.

public class ValueCountdown
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
     
            // Taking input from user
            System.out.print(" Enter a counter value : ");
            int counter = sc.nextInt();
 
            // print the counter value
             while(counter >= 1)
             {
              System.out.println("Counter = " + counter);
              counter = counter - 1;
             }
       }
 }