import java.util.Scanner;

public class FibonacciSequence {

    //Creating a method to generate and print the Fibonacci sequence
    public static void printFibonacci(int value) {

        if (value <= 0) {
            System.out.println("Please enter a positive number: ");
            return;
        }

        int number1 = 0, number2 = 1;

        System.out.print("Fibonacci Sequence is: ");

        for (int i = 1; i <= value; i++) {
            System.out.print(number1 + " ");

            int next = number1 + number2;
            number1 = number2;
            number2 = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter number of values: ");
        int number = sc.nextInt();

        //Calling the method
        printFibonacci(number);
    }
}
