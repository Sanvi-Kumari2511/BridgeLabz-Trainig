import java.util.Scanner;
public class FitnessChallengeTracker {
    public static void main(String args []){
	    Scanner sc = new Scanner(System.in);
		int pushUps [] = new int [7];
		
		//Taking input for each day
        for (int i = 0; i < pushUps.length; i++) {
            System.out.print("Day " + (i + 1) + " push-ups (0 for the rest days): ");
            pushUps[i] = sc.nextInt();
        }

        int totalPushUps = 0;
        int activeDays = 0;

        //Using for-each loop
        for (int count : pushUps) {

            //Skip the rest days
            if (count == 0) {
                continue;
            }

            totalPushUps += count;
            activeDays++;
        }

        double average = 0;
        if (activeDays > 0) {
            average = (double) totalPushUps / activeDays;
        }

        //Displaying the results
        System.out.println("\nTotal number of Push-ups: " + totalPushUps);
        System.out.println("Average Push-ups: " + average);
	}
}