import java.util.Scanner;
public class LibraryRemminderApp {
    public static void main(String args []) {
         Scanner sc = new Scanner(System.in);
		 
        int perDayFine = 5;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nBook number " + i + ":");

            System.out.println("Enter due day number:");
            int dueDay = sc.nextInt();

            System.out.println("Enter return day number:");
            int returnDay = sc.nextInt();

            if (returnDay > dueDay) {
                int lateDays = returnDay - dueDay;
                int fine = lateDays * perDayFine;
                System.out.println(lateDays + " days late returned");
                System.out.println("Fine to pay: ₹" + fine);
            } 
			else {
                System.out.println("Books returned on time so there is no fine");
            }
        }

        System.out.println("\nThank you for visit!");
    }
}
