import java.util.*;
import java.util.Arrays;

   public class NumberChecker5 {
   
    //Creating a method to find sum of proper divisors
    public static int properDivisors(int number) {
    int sum = 0;

    for (int i = 1; i <= number / 2; i++) {
    if (number % i == 0)
	sum += i;
    }

    return sum;
    }

    //Creating a method to check the number is perfect or not
    public static boolean isPerfect(int number) {
    return properDivisors(number) == number;
    }

    //Creating a method to check the number is abundant or not
    public static boolean isAbundant(int number) {
    return properDivisors(number) > number;
    }

    //Creating a method to check the number is deficient or not
    public static boolean isDeficient(int number) {
    return properDivisors(number) < number;
    }

    //Creating a method to cjeck number is factorial or not
    public static int factorial(int digit) {
    int fact = 1;

    for (int i = 1; i <= digit; i++) {
    fact *= i;
    }
    return fact;
    }

    //Creating a method to check number is strong or not
    public static boolean isStrong(int number) {
    int num = number;
    int sum = 0;

    while (num > 0) {
    int digit = num % 10;
    sum += factorial(digit);
    num /= 10;
    }

    return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking user's input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPerfect(number))
        System.out.println(number + " is a perfect number");
        else
        System.out.println(number + " is not a perfect number");

        if (isAbundant(number))
        System.out.println(number + " is an Abundant number");
        else
        System.out.println(number + " is not an Abundant number");

        if (isDeficient(number))
        System.out.println(number + " is a Deficient number");
        else
        System.out.println(number + " is not a Deficient number");

        if (isStrong(number))
        System.out.println(number + " is a Strong number");
        else
        System.out.println(number + " is not a Strong number");
        }
        }