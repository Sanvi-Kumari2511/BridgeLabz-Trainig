import java.util.Scanner;

public class SpacesTrim {

    //Creating a method to returns start & end indices
    public static int[] manualTrimIndex(String str) {
        int start = 0;
        int end = str.length() - 1;

        //Triming the leading spaces
        for(;; start++) {
            if(str.charAt(start) != ' ')
                break;
        }

        //Triming the trailing spaces
        for(;; end--) {
            if(str.charAt(end) != ' ')
                break;
        }

        return new int[]{start, end};
    }

    //Creating a method to create a substring using charAt() method
    public static String findSubstring(String str, int start, int end) {
        String substring = "";
        for(int i = start; i <= end; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }

    //Creating a method to compare the two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if(str1.length() != str2.length()) 
		return false;

        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) 
			return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
		//Taking input from user
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int[] arr = manualTrimIndex(str);
        String manualTrim = findSubstring(str, arr[0], arr[1]);

        String builtTrim = str.trim();

        System.out.println("\nTrim result by manual method: " + manualTrim);
        System.out.println("Trim result by buil-in method: " + builtTrim);

        System.out.println("\nComparison result: " + compareStrings(manualTrim, builtTrim));
	}
}
