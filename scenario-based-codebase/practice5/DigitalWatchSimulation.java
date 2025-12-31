import java.util.Scanner;

public class DigitalWatchSimulation {

    public static void main(String[] args) {

        boolean powerCut = false;

        for (int hour = 0; hour < 24; hour++) {

            for (int minute = 0; minute < 60; minute++) {

                //Power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("+----------------+");
                    System.out.println("|    POWER CUT   |");
                    System.out.println("|    at 13:00    |");
                    System.out.println("|  Watch Stopped |");
                    System.out.println("+----------------+");
                    powerCut = true;
                    break;
                }

                //Clear spacing between every updates
                System.out.println("+----------------+");
                System.out.printf("|     %02d:%02d      |\n", hour, minute);
                System.out.println("+----------------+");
            }

            if (powerCut) {
                break;
            }
        }
    }
}
