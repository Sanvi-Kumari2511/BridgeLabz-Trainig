import java.util.Scanner;
public class PrimeCheck
{
   public static void  main(String args [])
{
    Scanner sc=new Scanner(System.in);
    
    //Taking user's input
     System.out.println("Enter a number: ");
     int number = sc.nextInt();
           
      boolean isPrime = true; 

     // checking conditions for prime number
        if (number <= 1) {
        isPrime = false;
        }
        else {
      
        for (int i = 2; i < number; i++) {
        if (number % i == 0) {
        
        // If number is divisible by i, it's not prime
          isPrime = false;
          break;                
               }
            }
        }

        // Print the result
           if (isPrime) {
           System.out.println(number + " is a prime number");
        } 
          else {
          System.out.println(number + " is not a prime number");
        }
    }
}

