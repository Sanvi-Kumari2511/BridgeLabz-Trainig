import java.util.Scanner;

public class Calendar {

    //Creating a method to get the name of the month
    public static String monthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    //Creating a method to check the year is leap or not
    public static boolean isLeap(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            return true;
        return false;
    }

    //Creating a method to get the number of days in the month
    public static int monthDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeap(year)) {
            return 29;
        }
        return days[month - 1];
    }

    //Creating a method to find first day of the month
    public static int firstDay(int month, int year) {

        int day = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        return d0;
    }

    //Creating a method to display calendar
    public static void showCalendar(int month, int year) {

        String monthName = monthName(month);
        int days = monthDays(month, year);
        int firstDay = firstDay(month, year);

        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        //First for loop for proper indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        //Second for loop to display the days of the montth
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month from 1 to 12: ");
        int month = sc.nextInt();

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        showCalendar(month, year);
    }
}
