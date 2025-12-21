import java.util.*;
import java.util.Arrays;

   public class NumberChecker3 {
   
    //Creating a method to count the digits
	public static int digitCount(int number){
	int count = 0;
    while(number > 0){
    count++;
    number /= 10;
    }
	return count;
	}
	
	//Creating a method to store the digits in an array
	public static int[] digitStore(int number) {
    int count = digitCount(number);
    int[] arr = new int[count];

    for (int i = count - 1; i >= 0; i--) {
    arr[i] = number % 10;
    number /= 10;
    }
    return arr;
    }
	
	//Creating a method to reverse the digits
	public static int[] reverseDigits(int[] arr) {
    int number = arr.length;
    int[] reverse = new int[number];

    for (int i = 0; i < number; i++) {
    reverse[i] = arr[number - 1 - i];
    }
    return reverse;
    }
	
	//Creating a method to compare two arrays
    public static boolean arraysCompare(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length)
    return false;

    for (int i = 0; i < arr1.length; i++) {
    if (arr1[i] != arr2[i])
    return false;
    }
    return true;
    }

    //Creating a method to check the number is palindrome or not
    public static boolean isPalindrome(int number) {
    int[] digits = digitStore(number);
    int[] rev = reverseDigits(digits);
	
    return arraysCompare(digits, rev);
    }
	
    //Creatin a method to check the number is duck or not
    public static boolean isDuck(int number) {
    int[] digits = digitStore(number);

    for(int num : digits) {
    if (num == 0)  
    return true;
    }
    return false;
    }
	
	 public static void main(String[] args) {
         
	    //taking input from user and displaying results
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = digitStore(number);
        int[] rev = reverseDigits(digits);

        System.out.println("Digit count: " + digitCount(number));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed: " + Arrays.toString(rev));

        if (arraysCompare(digits, rev))
        System.out.println("Both arrays are equal");
        else
        System.out.println("Both arrays are not equal");

        if (isPalindrome(number))
        System.out.println(number + " is a Palindrome number");
        else
        System.out.println(number + " is not a Palindrome number");

        if (isDuck(number))
        System.out.println(number + " is a Duck number");
        else
        System.out.println(number + " is not a Duck number");
        }
        }