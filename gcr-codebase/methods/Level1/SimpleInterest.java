import java.util.Scanner;

public class SimpleInterest { 

  //Creating a method
  public double calculator(double principal, double rate, double time) {
	return (principal * rate * time)/100;
	}
	
	public static void main (String args []){

    Scanner sc = new Scanner(System.in);
	
	//Taking inputs from users
	System.out.println("Enter Principal : ");
	double principal = sc.nextDouble();
	
	System.out.println("Enter Rate : ");
	double rate = sc.nextDouble();
	
	System.out.println("Enter Time : ");
	double time = sc.nextDouble();
	
	//Calling method
	SimpleInterest obj = new SimpleInterest();
	double simpleInterest = obj.calculator(principal, rate, time);
	
	//Displaying results
	System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	}
	}
	