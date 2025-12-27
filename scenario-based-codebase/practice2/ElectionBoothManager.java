import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vote;

        while (true) {
            System.out.print("Enter your age (or -1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                System.out.println("Voting is closed");
                break;
            }

            if (age >= 18) {
                System.out.println("You are eligible to vote");
                System.out.print("Choose voting booth (1, 2, or 3): ");
                vote = sc.nextInt();
                System.out.println("Your vote is recorded for candidate " + vote);
            } 
			else {
                System.out.println("You are not eligible to vote");
            }
        }
    }
}
