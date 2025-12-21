import java.util.*;
import java.util.Arrays;

   public class NumberChecker2 {
   
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
    
	//Creating a method to find sum of digits
    public static int sumDigit(int[] arr) {
    int sum = 0;
    for (int num : arr) {
    sum += num;
    }
    return sum;
    }
	
	//Creating a method to find sum of squares of digits
	public static int squareSum(int[] arr) {
    int sum = 0;
    for (int num : arr) {
    sum += Math.pow(num, 2);
    }
    return sum;
    }
	
	//Creating a method to check the number is Harshad or not
    public static boolean isHarshad(int number) {
    int[] arr = digitStore(number);
    int sum = sumDigit(arr);
    return number % sum == 0;
    }
	
	//Creating a method to find frequency of digits
    public static int[][] frequency(int number) {
    int[] arr = digitStore(number);
    int[][] freq = new int[10][2]; 

    for (int i = 0; i < 10; i++) {
    freq[i][0] = i; 
    }

    for (int num : arr) {
    freq[num][1]++;
    }

    return freq;
    }
	public static void main(String[] args) {
        
		//Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = digitCount(number);
        System.out.println("Digit count are: " + count);

        int[] arr = digitStore(number);
        System.out.println("Digits are: " + Arrays.toString(arr));

        int sum = sumDigit(arr);
        System.out.println("Digit sum : " + sum);

        int sumOfSquare = squareSum(arr);
        System.out.println("Sum of squares: " + sumOfSquare);

        if(isHarshad(number))
        System.out.println(number + " is a Harshad Number");
        else
        System.out.println(number + " is not a Harshad Number");

        int[][] freq = frequency(number);
        System.out.println("\nFrequency of digits:");
        for(int i = 0; i < 10; i++) {
        if(freq[i][1] > 0)
        System.out.println(freq[i][0] + " : " + freq[i][1]);
        }
	    }
        }
		
	
	
	
	
	
	
	
	
	
	
	
	
	
