import java.util.Scanner;

public class NumberChecking { 

    //Creating a method
	public int check( int number){
	if(number < 0)
	return -1;
	else if(number > 0)
	return 1;
	else
	return 0;
	}
	public static void main(String args []) {
	Scanner sc=new Scanner(System.in);
	
	//Taking inputs from user
	System.out.println("Enter a number");
	int number = sc.nextInt();
	
	//Creating object
	NumberChecking obj = new NumberChecking();
	
	//Calling method
	int result = obj.check(number);
	
	//Displaying results
	if(result == 1)
	System.out.println( number + " is a positive number");
	
	else if(result == -1)
	System.out.println(number + " is a negative number");
	
	else
	System.out.println(number + " is a Zero");
	
	}
	}