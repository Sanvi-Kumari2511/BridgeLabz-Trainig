import java.util.Scanner;

 public class TrignometricFunctions { 
    //Creating a method
	public double[] calculateTrigonometricFunctions(double angle){
	
	//Converting angle into radians
    double radians = Math.toRadians(angle);
	double [] result = new double[3];
	
	//Finding sine, cosine, and tangent by using Math function
	result[0] = Math.sin(radians);
	result[1] = Math.cos(radians);
	result[2] = Math.tan(radians);
	
	return result;
	}
	
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	//Taking input form user
	System.out.println("Enter angle in degrees : ");
	double angle = sc.nextDouble();
	
	TrignometricFunctions object = new TrignometricFunctions();
	
	//Displaying results
	double result [] = object.calculateTrigonometricFunctions(angle);
	System.out.println("Sine: " + result[0]);
    System.out.println("Cosine: " + result[1]);
    System.out.println("Tangent: " + result[2]);
    }
    }