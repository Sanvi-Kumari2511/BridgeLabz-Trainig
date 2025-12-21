import java.util.Scanner;
  public class NumberCheck {
  
    //Creating a method to check number is positive or not
    public static boolean isPositive(int number) {
        return number >= 0;
    }
	
	//Creating a method to check positive number is even or odd
	public static boolean isEven(int number) {
    return number % 2 == 0;
    }
	
	//Creating a method to compare two numbers
    public static int compare(int number1, int number2) {
    if (number1 > number2) 
	return 1;
    else if (number1 == number2) 
	return 0;
    else return -1;
    }
	
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr [] = new int[5];
	
	//Taking input for 5 numbers
    for(int i = 0; i < arr.length; i++) {
    System.out.print("Enter numbers: ");
    arr[i] = sc.nextInt();
    }

   //Checking the number is positive or negative and even or odd
    for (int i = 0; i < arr.length; i++) {
    int num = arr[i];
    if (isPositive(num)) {
    System.out.print(num + " is positive");
    if (isEven(num)) {
    System.out.println(" and even.");
    } 
	else {
    System.out.println(" and odd.");
    }
    } 
	else {
    System.out.println(num + " is negative.");
    }
    }
	
	//Comparing the first and the last elements
    int res = compare(arr[0], arr[arr.length - 1]);
    if (res == 1) {
    System.out.println("The first number is greater than the last number");
    } 
	else if (res == 0) {
    System.out.println("The first and last numbers are equal");
    } 
	else {
    System.out.println("The first number is smaller than the last number");
    }
	}
	}
  