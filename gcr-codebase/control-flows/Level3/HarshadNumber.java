import java.util.Scanner;

//Program to check if a number taken from the user is a Harshad Number.


public class HarshadNumber
{
   public static void  main(String args [])
  {
    Scanner sc=new Scanner(System.in);
    
    //Taking user's input
     System.out.println("Enter a number : ");
     int number = sc.nextInt();

      int sum = 0;
       
      int originalNumber = number;

      while(number > 0) {
      int digit = number % 10;
      sum += digit;
      number /= 10;
      }
       
       if(originalNumber % sum ==0) {
        System.out.println(originalNumber + " is Harshad Number");
      }
       else{
       System.out.println(originalNumber + " is not a Harshad Number");
          }

         } 
            
      }

