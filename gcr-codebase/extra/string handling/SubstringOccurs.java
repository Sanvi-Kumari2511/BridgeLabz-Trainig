import java.util.Scanner;

public class SubstringOccurs {

    //Creating a method to count substring occurrences
    public static int occurenceCount(String str, String sub) {
		if(sub.length() == 0){
			return 0;
		}
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length(); 
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a substring: ");
        String sub = sc.nextLine();

        //Calling the method
        int result = occurenceCount(str, sub);

        //Displaying the result
        System.out.println("Substring occuring times: " + result);
    }
}
