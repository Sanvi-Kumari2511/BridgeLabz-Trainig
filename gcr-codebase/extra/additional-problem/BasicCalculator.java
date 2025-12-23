import java.util.Scanner;

public class BasicCalculator {

    //Addition
    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    //Subtraction
    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    //Multiplication
    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    //Division
    public static double divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Number is not divided by zero");
            return 0;
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        //Performing the operations
        switch (choice) {
            case 1:
                System.out.println("Result: " + add(number1, number2));
                break;
            case 2:
                System.out.println("Result: " + subtract(number1, number2));
                break;
            case 3:
                System.out.println("Result: " + multiply(number1, number2));
                break;
            case 4:
                System.out.println("Result: " + divide(number1, number2));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
