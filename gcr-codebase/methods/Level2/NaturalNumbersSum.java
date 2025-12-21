import java.util.Scanner;

 public class NaturalNumbersSum { 
 
    //Creating a recursive method
	public static int sumRecursion(int number){
	if(number == 1)
	return 1;
	return number + sumRecursion(number-1);
	}
	
	//Creating a method using formula
	public static int sumFormula(int number){
	return number * (number + 1)/2;
	}
	
	public static void main(String args []){
	Scanner sc=new Scanner(System.in);
	
	//Taking input from users
	System.out.print("Enter a number: ");
    int number = sc.nextInt();
	
	//Checking conditions for natural number
	if(number <= 0){
	System.out.println("The number is not natural");
	return;
	}
	
	int sum1 = sumRecursion(number);
	int sum2 = sumFormula(number);
	
	//Displaying sums
	System.out.println("Sum using recursion = " + sum1 + " and Sum using formula = " +sum2);
    
	//Displaying comparison
	if(sum1 == sum2){
	System.out.println("Both sums are equal ");
	}
	else{
	System.out.println("Sums are not equal");
	}
	}
	}