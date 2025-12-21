import java.util.Scanner;

public class NaturalNumbers { 

    //Creating a method
	public int sum( int number){
	
	int sum = 0;
	for(int i = 1; i <= number; i++){
	sum += i;
	}
	return sum;
	}
	public static void main(String args []) {
	Scanner sc=new Scanner(System.in);
	
	//Taking inputs from user
	System.out.println("Enter a number");
	int number = sc.nextInt();
	
	//Creating object
	NaturalNumbers object = new NaturalNumbers();
	
	//Calling method
	int result = object.sum(number);
	
	//Displaying result
	System.out.println("Sum of n natural numbers : " + result);
	}
	}