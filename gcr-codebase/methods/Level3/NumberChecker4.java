import java.util.*;
import java.util.Arrays;

   public class NumberChecker4 {
   
    //Creating a method to check number is prime or not
	public static boolean isPrime(int number) {
    if (number <= 1) 
    return false;

    for (int i = 2; i <= number / 2; i++) {
    if (number % i == 0)
	return false;
    }
    return true;
    }
	
	//Creating a method to check the number is neon or not
    public static boolean isNeon(int number) {
    int square = number * number;
    int sum = 0;

    while (square > 0) {
    sum += square % 10;
    square /= 10;
    }
    return sum == number;
    }
	
	//Creating a method to check the number is spy or not
    public static boolean isSpy(int number) {
    int sum = 0, product = 1;

    while (number > 0) {
    int digit = number % 10;
    sum += digit;
    product *= digit;
    number /= 10;
    }
    return sum == product;
    }
	
	//Creating a method to check the number is automorphic or not
    public static boolean isAutomorphic(int number) {
    int square = number * number;

    while (number > 0) {
    if (number % 10 != square % 10)
    return false;

    number /= 10;
    square /= 10;
    }
    return true;
	}
	//Creating a method to check the number is buzz or not 
    public static boolean isBuzz(int number) {
    return number % 7 == 0 || number % 10 == 7;
    }
     
	 
	 public static void main(String[] args) {
        
		//Taking input from user and displaying results
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(isPrime(number))
        System.out.println(number + " is a rime number");
        else
        System.out.println(number + " is not a rime number");

        if(isNeon(number))
        System.out.println(number + " is a neon number");
        else
        System.out.println(number + " is not a neon number");

        if(isSpy(number))
        System.out.println(number + " is a spy number");
        else
        System.out.println(number + " is not a spy number");

        if(isAutomorphic(number))
        System.out.println(number + " is an automorphic number");
        else
        System.out.println(number + " is not an automorphic number");

	    if(isBuzz(number))
        System.out.println(number + " is a Buzz number");
        else
        System.out.println(number + " is not a Buzz number");
        }
        }