import java.util.Scanner;

public class FirstNonRepeating {

    //Creating a method to find first non repeating character in a string
    public static char firstNonRepeat(String str) {

        int[] frequency = new int[256];  

        //1St loop for counting the frequency of characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;         
        }

        //2nd loop for finding the 1st non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] == 1) {
                return ch;      
            }
        }
      
        return '#'; // return a special char if none exists
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
		//Taking input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = firstNonRepeat(str);

        if (result == '#') {
            System.out.println("No repeating character");
        } 
		else {
            System.out.println("First non-repeating character: " + result);
        }
    }
}
