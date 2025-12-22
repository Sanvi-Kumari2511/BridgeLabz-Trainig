import java.util.*;

public class CharacterCompare {

    //Creating a method to return characters without using toCharArray() method
    public static char[] simpleCharArray(String s) {
    char arr [] = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
    arr[i] = s.charAt(i);
    }

    return arr;
    }

    //Creating a method to compare two string arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {

    if (arr1.length != arr2.length) {
    return false;
    }

    for (int i = 0; i < arr1.length; i++) {
    if (arr1[i] != arr2[i]) {
    return false;
    }
    }

    return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter a String: ");
        String str = sc.next();

        //calling the simple method
        char[] arr1 = simpleCharArray(str);

        //calling the built-in method
        char[] arr2 = str.toCharArray();

        //Comparing the two string arrays arr1 and arr2
        boolean result = compareArrays(arr1, arr2);


        //Displaying the results
        System.out.println("\nCharacters in a string using simple method:");
        System.out.println(Arrays.toString(arr1));

        System.out.println("Characters in  string using toCharArray() method:");
        System.out.println(Arrays.toString(arr2));

        if (result) {
        System.out.println("Both arrays arr1 and arr2 are same");
        } 
		else {
        System.out.println("Both arrays arr1 and arr2 are not same");
        }
    }
}
