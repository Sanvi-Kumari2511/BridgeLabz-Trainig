import java.util.*;

public class VotingAge {

    //Creating a method to generate random 2-digit ages
    public static int[] generateAge(int n) {
        int[] age = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            age[i] = random.nextInt(90) + 10; 
		}
        return age;
    }
  
    //Creating a method to return 2D String array of age
    public static String[][] checkVote(int[] age) {
        String[][] result = new String[age.length][2];

        for (int i = 0; i < age.length; i++) {

            result[i][0] = String.valueOf(age[i]);

            if (age[i] < 0) {
                result[i][1] = "false"; 
            } 
			else if (age[i] >= 18) {
                result[i][1] = "true";  
            } 
			else {
                result[i][1] = "false"; 
            }
        }
        return result;
    }

    //Creating a method to display the 2D array in a tabular format
    public static void show(String[][] arr) {
        System.out.println("\nAge\tCan Vote?");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter students number: ");
        int n = sc.nextInt();

        int[] age = generateAge(n);

        String[][] result = checkVote(age);

        System.out.println("\nWho can vote:");
        show(result);
    }
}
