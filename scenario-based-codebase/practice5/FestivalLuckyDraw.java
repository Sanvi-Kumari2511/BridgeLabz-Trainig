import java.util.Scanner;
public class FestivalLuckyDraw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice = 'y';

        do {
            System.out.print("Enter your number: ");
            int number = sc.nextInt();

            //Checking for invalid input
            if (number <= 0) {
                System.out.println("Please enter a positive number.");
                continue;
            }

            //Checking winning condition
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift!");
            } 
			else {
                System.out.println("Sorry, better luck next time.");
            }

            System.out.print("Next visitor? (y/n): ");
            choice = sc.next().charAt(0);

        } 
		while (choice == 'y' || choice == 'Y');

        System.out.println("Happy Diwali!");
    }
}
