import java.util.Scanner;

public class MovieTicketBookingApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Total capacity
        int totalSeats = 5;   
        char continueBooking = 'y';

        do {
            int choiceOfMovie, choiceOfSeat;
            int numberOfSeats;
            int bill = 0;
            int seatPrice = 0;

            if (totalSeats == 0) {
                System.out.println("No seats available");
                break;
            }

            System.out.println("Available Seats: " + totalSeats);

            System.out.println("Select Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
            choiceOfMovie = sc.nextInt();

            switch (choiceOfMovie) {
                case 1:
                    bill += 500;
                    break;
                case 2:
                    bill += 600;
                    break;
                case 3:
                    bill += 700;
                    break;
                default:
                    System.out.println("Wrong choice of movie");
            }

            System.out.println("Select Seat Type:");
            System.out.println("1. Gold");
            System.out.println("2. Silver");
            choiceOfSeat = sc.nextInt();

            if (choiceOfSeat == 1) {
                seatPrice = 200;
            } else if (choiceOfSeat == 2) {
                seatPrice = 300;
            } else {
                System.out.println("Wrong choice of seat");
            }

            System.out.println("Enter number of seats:");
            numberOfSeats = sc.nextInt();

            if (numberOfSeats > totalSeats) {
                System.out.println("Not enough seats available!");
                continue;
            }

            bill += seatPrice * numberOfSeats;

            System.out.println("Do you want snacks? (1 = Yes, 2 = No)");
            int choiceOfSnacks = sc.nextInt();

            if (choiceOfSnacks == 1) {
                bill += 100 * numberOfSeats;
            }

            totalSeats -= numberOfSeats;

            System.out.println("Seats Booked: " + numberOfSeats);
            System.out.println("Remaining Seats: " + totalSeats);
            System.out.println("Total Ticket Price: " + bill);

            System.out.println("Book ticket for next customer? (y/n)");
            continueBooking = sc.next().charAt(0);

        } 
		while (continueBooking == 'y' || continueBooking == 'Y');

        System.out.println("Thank you for ticket booking!");
    }
}
