import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 100;

        while (balance > 0) {
            System.out.print("Enter the distance (for quit press 0): ");
            int distance = sc.nextInt();

            if (distance == 0) {
                break;
            }

            int fare = (distance <= 5) ? 10 : (distance <= 10 ? 20 : 30);

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Deducted fare: " + fare);
                System.out.println("Remaining money: " + balance);
            } 
			else {
                System.out.println("Insufficient money");
                break;
            }
        }
    }
}
