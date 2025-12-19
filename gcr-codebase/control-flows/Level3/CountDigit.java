import java.util.Scanner;

// program to count the number of digits in an integer.

public class CountDigit
{
   public static void  main(String args [])
  {
    Scanner sc=new Scanner(System.in);
    
    //Taking user's input
     System.out.println("Enter a number: ");
     int number = sc.nextInt();
           
        int count = 0;   
        
        while(number > 0) {
         
        number = number / 10;
         
        count++;
          }

           // Printing the result
           
           System.out.println("Number of digits: " + count);
           } 
            
      }

