import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    //Creating a method to generate a number for guess
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    //Creating a method to get the user feedback
    public static char getUserFeedback(Scanner sc) {
        System.out.print("Enter feedback: ");
        return sc.next().charAt(0);
    }

    //Craeting a method to update the range based on the feedback
    public static int[] updateRange(char feedback, int guess, int low, int high) {
        if (feedback == 'h') {
            high = guess - 1;
        } 
		else if (feedback == 'l') {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean isCorrect = false;

        System.out.println("Chhose a number between 1 to 100: ");
       // System.out.println("I will try to guess it!");

        while (!isCorrect && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("\nGuessing number is: " + guess);

            char feedback = getUserFeedback(sc);

            if (feedback == 'c') {
                System.out.println("Yay! I guessed the number correctly");
                isCorrect = true;
            } 
			else {
                int[] range = updateRange(feedback, guess, low, high);
                low = range[0];
                high = range[1];
            }
        }
    }
}
