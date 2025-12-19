import java.util.Scanner;

//Program to check if a number is an Abundant Number.

public class AbundantNumber
{
   public static void  main(String args [])
  {
    Scanner sc=new Scanner(System.in);
    
    //Taking user's input
     System.out.println("Enter a number : ");
     int number = sc.nextInt();

      int sum = 0;
       
      for(int i = 1; i < number; i++) {
      if(number % i == 0) {
      sum += i;
      }
     }
     
      if(sum > number) {
       System.out.println(number + " is Abundant Number");
      }
      else {
      System.out.println(number + " is not Abundant Number");

             }
         } 
            
      }

