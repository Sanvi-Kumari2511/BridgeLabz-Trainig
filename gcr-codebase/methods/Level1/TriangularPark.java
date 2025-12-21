import java.util.Scanner;

public class TriangularPark { 

    //Creating a method
  
    public double numberOfRounds(double side1, double side2, double side3) {
	
	double perimeter = side1 + side2 + side3;
	
	//Converting distance from km to meter
	double totalDistance = 5000;
	return totalDistance / perimeter;
	}
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Taking inputs from user
	System.out.println("Enter side 1 : ");
	double side1 = sc.nextDouble();
	
	System.out.println("Enter side 2 : ");
	double side2 = sc.nextDouble();
	
	System.out.println("Enter side 3 : ");
	double side3 = sc.nextDouble();
	
	//Creating object
	TriangularPark obj = new TriangularPark();
	
	//Calling method
	double rounds = obj.numberOfRounds(side1, side2, side3);
	
	//Displaying results
	System.out.println("Total number of rounds : " + rounds);
	}
	}
	
	
	