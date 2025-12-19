import java.util.Scanner;

// Program to check if a number is armstrong or not.

public class Armstrong
{
   public static void  main(String args [])
  {
    Scanner sc=new Scanner(System.in);
    
    //Taking user's input
     System.out.println("Enter a number: ");
     int number = sc.nextInt();
           
        int sum = 0;   
        int originalNumber = number;
     
           
        while (originalNumber > 0) {
        int digit = originalNumber % 10;
        
        sum += digit * digit * digit;
         
        originalNumber = originalNumber/10;
         
          }

           // Print the result
           if (number == sum) {
           System.out.println(number + " is armstrong number");
           } 
          else {
          System.out.println(number + " is not armstrong number");
        }
    }
}

