import java.util.*;
  public class CompareString{
  
    //Creating a method to compare two strings using charAt method
    public static boolean compareCharAt(String s1, String s2) {
    if (s1.length() != s2.length()) {
    return false;
    }

    for (int i = 0; i < s1.length(); i++) {
    if (s1.charAt(i) != s2.charAt(i)) {
    return false;
    }
    }

    return true;
    }

    //Creating a method to compare two strings using equals method
    public static boolean compareEquals(String s1, String s2) {
    return s1.equals(s2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean resultCharAt = compareCharAt(s1, s2);
        boolean resultEquals = compareEquals(s1, s2);

        System.out.println("\nResult using charAt() method: " + resultCharAt);
        System.out.println("Result using equals() method: " + resultEquals);

        if (resultCharAt) {
        System.out.println("Both strings are same");
        } 
		else {
        System.out.println("Both strings are not same");
        }
    }
}