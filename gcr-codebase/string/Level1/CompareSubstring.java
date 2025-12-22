import java.util.*;

public class CompareSubstring {

    //Creating a method to create substring using charAt()
    public static String substringCharAt(String text, int start, int end) {
    String result = "";
    for (int i = start; i < end; i++) {
    result += text.charAt(i);
    }

    return result;
    }

    //reating a method to compare two strings using charAt()
    public static boolean compareCharAt(String s1, String s2) {

    if (s1.length() != s2.length()) {
    return false;
    }

    for (int i = 0; i < s1.length(); i++){
	if (s1.charAt(i) != s2.charAt(i)) {
    return false;
    }
    }

    return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        //Taking input from user
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter the index of start: ");
        int start = sc.nextInt();

        System.out.print("Enter the index of end: ");
        int end = sc.nextInt();

        //Creating a method for substring using charAt() method 
        String resultCharAt = substringCharAt(text, start, end);

        //Creating a method for substring using substring() buil-in method
        String resultSubstring = text.substring(start, end);

        System.out.println("\nSubstring using charAt(): " + resultCharAt);
        System.out.println("Substring using substring(): " + resultSubstring);

        boolean same = compareCharAt(resultCharAt, resultSubstring);
		
        if (same) {
        System.out.println("Both substrings are same");
        } 
		else {
        System.out.println("Both substrings are not same");
        }
    }
}

	