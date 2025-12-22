import java.util.Scanner;

public class UniqueCharacters {

    //Creating a method to find the length of the string without using length() method
    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
           
        }
        return count;
    }

    //Creating a method to find unique characters using charAt() method
    public static char[] findUnique(String str) {

        int length = stringLength(str);
        char[] temp = new char[length];  
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {

            char ch = str.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        //Creating an array of unique size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Taking input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] unique = findUnique(str);

        System.out.println("\nUnique characters:");
        for (char ch : unique) {
            System.out.print(ch + " ");
        }
    }
}
