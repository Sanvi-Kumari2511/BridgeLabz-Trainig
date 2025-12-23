import java.util.Scanner;

public class PrimeChecker {

    //Creating a method to check the number is palindrome or not
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //Checking the number is prime or not
        boolean result = isPrime(number);

        //Displaying the result
        if (result) {
            System.out.println(number + " is a prime number.");
        } 
		else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
