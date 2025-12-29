import java.util.Scanner;

public class ParkinglotGateSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalCapacity = 10;
        int occupied = 0;
        int choice;

        while (true) {

            System.out.println("\n1. Vehicle Park");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Show Occupancy");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (occupied < totalCapacity) {
                        occupied++;
                        System.out.println("Parking of vehicle is done.");
                    } else {
                        System.out.println("Parking area is full.");
                    }
                    break;

                case 2:
                    if (occupied > totalCapacity) {
                        occupied--;
                        System.out.println("Vehicle exit successful.");
                    } else {
                        System.out.println("Parking area is empty.");
                    }
                    break;

                case 3:
                    System.out.println("Occupied slots: " + occupied);
                    System.out.println("Available slots: " + (totalCapacity - occupied));
                    break;
					
			    case 4: 
				    System.out.println("exit the park");
					return;
		

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
