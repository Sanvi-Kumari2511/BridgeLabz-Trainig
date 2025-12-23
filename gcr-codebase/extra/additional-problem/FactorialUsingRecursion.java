import java.util.Scanner;

public class FactorialUsingRecursion {

    //Creating a method to calculate factorial of a number using recursion
    public static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;   
        }
		
		//Recursive calling
        return number * factorial(number - 1);   
    }

    //Creating a method to display the result
    public static void showResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //Calculating factorial
        long fact = factorial(number);

        //Displaying the output
        showResult(number, fact);
    }
}
