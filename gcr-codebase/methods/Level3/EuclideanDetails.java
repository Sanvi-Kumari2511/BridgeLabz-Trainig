import java.util.Scanner;

public class EuclideanDetails {

    //Creating a method to compute Euclidean distance
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    //Crating a method to compute slope
    public static double slope(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    //Creating a method to compute y-intercept b
    public static double intercept(double x1, double y1, double m) {
        return y1 - m * x1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
		//Taking input from user
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        //Distance
        double d = distance(x1, y1, x2, y2);

        //Slope
        double m = slope(x1, y1, x2, y2);

        //y-intercept
        double b = intercept(x1, y1, m);
		
		//Displaying results
        System.out.println("Distance = " + d);
        System.out.println("Slope (m) = " + m);
        System.out.println("Equation of line:  y = " + m + "x + " + b);
    }
}