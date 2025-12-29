import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;
        int choice;

        do {
			
            System.out.println("\nChoose a mobile operator: ");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. BSNL");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            //Exit condition
            if (choice == 4) {
                System.out.println("Thank you for using recharge simulator");
                break;
            }

            System.out.print("Enter amount for mobile recharge: ");
            double amount = sc.nextDouble();
            balance += amount;

            //Switch case for offers
            switch (choice) {
                case 1:
                    System.out.println("Jio: 1.5GB/day for 30 days");
                    break;

                case 2:
                    System.out.println("Airtel: 1GB/day for 28 days");
                    break;

                case 3:
                    System.out.println("BSNL: 2GB/day for 250 days");
                    break;

                default:
                    System.out.println("Wrong operator");
                    balance -= amount;
                    continue;
            }

            //Displaying results
            System.out.println("Your mobile recharge is successfully done");
            System.out.println("Balance after recharge is: " + balance);

        } while (true);   

        sc.close();
    }
}
