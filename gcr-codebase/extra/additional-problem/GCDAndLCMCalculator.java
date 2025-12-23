import java.util.Scanner;

public class GCDAndLCMCalculator {

    //Creating a method to calculate GCD 
    public static int calculateGCD(int number1, int number2) {
        while (number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }
        return number1;
    }

    //Creating a method to calculate LCM 
    public static int calculateLCM(int number1, int number2) {
        return (number1 * number2) / calculateGCD(number1, number2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Takingn input from user
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        //Calculating GCD and LCM
        int gcd = calculateGCD(number1, number2);
        int lcm = calculateLCM(number1, number2);

        //Displaying result
        System.out.println("GCD of " + number1 + " and " + number2 + " is: " + gcd);
        System.out.println("LCM of " + number1 + " and " + number2 + " is: " + lcm);
    }
}
