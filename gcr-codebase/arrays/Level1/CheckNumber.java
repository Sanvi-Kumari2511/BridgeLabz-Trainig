import java.util.Scanner;

// Program to take user input for 5 numbers and check whether a number is positive,  negative, or zero and then odd and even.

  public class CheckNumber {
     public static void main(String args []) {
	    Scanner sc=new Scanner(System.in);

	    //Taking array of 5 elements.
	    int [] arr = new int [5];
	    System.out.println("Enter 5 numbers:");
	  
	    for(int i=0; i<arr.length; i++) {
	        System.out.println("Enter number " + (i+1) + ": ");
		arr[i] = sc.nextInt();
		}
		System.out.println("\nNumber analysis: ");
		
		//checking conditions for positive, negative, odd, and even numbers.

		for(int i=0; i<arr.length; i++){
		if(arr[i] > 0) {
		System.out.print(arr[i] + " is a positive");
		if(arr[i]%2==0) {
		System.out.println(" and even number");
		}
		else {
		System.out.println(" and odd number");
		}
		}
		else if(arr[i]<0) {
		System.out.println(arr[i] + " is a negative number");
		 }
		else {
		System.out.println(arr[i] + " is zero");
		  }
		  }
		  
		 //printing the results after comparing first and last element
		 System.out.println("\nComparing first and last element: ");
		 if(arr[0] == arr[arr.length-1]) {
		 System.out.println("First and last elements are equal");
		 }
		 else if(arr[0]> arr[arr.length-1]) {
		 System.out.println("First element is greater than last element");
		 }
		 else {
		 System.out.println("First element is less than last element");
		 }
		 }
		 }
