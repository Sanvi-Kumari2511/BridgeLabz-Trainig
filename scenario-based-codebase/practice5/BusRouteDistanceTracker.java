import java.util.Scanner;
public class BusRouteDistanceTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Tracking the stop number
        int stop = 1;

        //Storing total distance covered
        double totalDistance = 0;

        char choice = 'n';

        while (true) {

            //Taking distance input for current stop
            System.out.print("Enter distance for stop " + stop + " (in km): ");
            double distance = sc.nextDouble();

            //Adding current distance to total distance
            totalDistance += distance;

            //Displaying total distance covered so far
            System.out.println("Total distance covered: " + totalDistance + " km");

            //Asking user if they want to get off at this stop
            System.out.print("Do you want to get off at this stop? (y/n): ");
            choice = sc.next().charAt(0);

            //Checking if user wants to exit the bus
            if (choice == 'y' || choice == 'Y') {
                System.out.println("Passenger got off at the Stop " + stop);
                break;
            }

            //Moving to next stop
            stop++;
        }

        //Displaying final distance traveled by the passenger
        System.out.println("Final distance traveled: " + totalDistance + " km");
    }
}
