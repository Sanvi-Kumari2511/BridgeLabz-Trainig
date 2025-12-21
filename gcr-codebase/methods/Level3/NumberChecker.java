import java.util.*;

   public class NumberChecker {
   
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
    
	//Checking the number is duck or not 
    public static boolean isDuck(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 0) 
	return true;
    }
    return false;
	
	//Checking the number is Armstrong or not
	public static boolean isArmstrong(int[] arr) {
    int power = arr.length;
    int sum = 0;

    for (int num : arr) {
    sum += Math.pow(num, power);
    }

    int number = 0;
    for (int num : arr) {
    number = number * 10 + num;
    }
    return sum == number;
    }
	
	//Creating a method to find largest and second largest digits
    public static int[] largest(int[] arr) {
    int maximum1 = Integer.MIN_VALUE;
    int maximum2 = Integer.MIN_VALUE;

    for(int num : arr) {
    if(num > maximum1) {
    maximum2 = maximum1;
	maximum1 = num;
    }
	else if(num > maximum2 && num != maximum1) {
    maximum2 = num;
    }
    }
    return new int[]{maximum1, maximum2};
    }
	
	//Creating a method to find smallest and second smallest digits
    public static int[] smallest(int[] arr) {
    int minimum1 = Integer.MAX_VALUE;
    int minimum2 = Integer.MAX_VALUE;

    for (int num : arr) {
    if (num < minimum1) {
	minimum2 = minimum1;
    minimum1 = num;
    } 
	else if (num < minimum2 && num != minimum1) {
	minimum2 = num;
    }
    }
    return new int[]{minimum1, minimum2};
    }

	public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = digitCount(number);
        int[] arr = digitStore(number);

        System.out.println("\nDigit count are: " + count);

        System.out.print("Digits are: ");
        for (int num : arr) 
		System.out.print(num + " ");

        System.out.println("\nDuck Number? " + isDuck(arr));
        System.out.println("Armstrong Number? " + isArmstrong(arr));

        int[] large = largest(arr);
        int[] small = smallest(arr);

        System.out.println("Largest digit = " + large[0]);
        System.out.println("Second largest digit = " + large[1]);

        System.out.println("Smallest digit = " + small[0]);
        System.out.println("Second smallest digit = " + small[1]);
    }
}

	