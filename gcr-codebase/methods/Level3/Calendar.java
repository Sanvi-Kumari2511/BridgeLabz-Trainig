import java.util.Scanner;

public class Calendar {

    public static String putMonths(int month) {
    String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
    return months[month - 1];
    }

    public static int putDays(int month, int year) {
    int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //Checking conditions for leap year
    if (month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
    return 29;
    }
    return days[month - 1];
    }

    public static int dayFirst(int day, int month, int year) {
    int y0 = year - (14 - month) / 12;
    int x = y0 + y0/4 - y0/100 + y0/400;
    int m0 = month + 12 * ((14 - month) / 12) - 2;
    return (day + x + (31*m0)/12) % 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
		//Taking input from user
        System.out.print("Enter month from 1 to 12: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String nameOfMonth = putMonths(month);
        int days = putDays(month, year);
        int firstDay = dayFirst(1, month, year); 

        System.out.println("\n\n\t" + nameOfMonth + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
        System.out.print("    ");
        }

        //Dispalying dates
        for (int i = 1; i <= days; i++) {
        System.out.printf("%3d ", i);

        if ((i + firstDay) % 7 == 0) {
        System.out.println();
        }
        }
        System.out.println();
        }
        }