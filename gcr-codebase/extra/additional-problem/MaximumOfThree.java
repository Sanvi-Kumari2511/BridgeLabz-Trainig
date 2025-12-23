import java.util.Scanner;

public class MaximumOfThree {

    //Creating a method to take input from user
    public static int[] takeInput(Scanner sc) {
        int[] number = new int[3];

        System.out.print("Enter first number: ");
        number[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        number[1] = sc.nextInt();

        System.out.print("Enter third number: ");
        number[2] = sc.nextInt();

        return number;
    }

    //Craeting a method to find maximum of three numbers
    public static int findMaximum(int number1, int number2, int number3) {
        int maximum = number1;

        if (number2 > maximum) {
            maximum = number2;
        }
        if (number3 > maximum) {
            maximum = number3;
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        int[] numbers = takeInput(sc);

        //Finding the maximum number
        int maximum = findMaximum(numbers[0], numbers[1], numbers[2]);

        //Displaying the result
        System.out.println("Maximum number is: " + maximum);
    }
}
