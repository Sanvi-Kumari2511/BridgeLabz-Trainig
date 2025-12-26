import java.util.Scanner;

public class CollinearPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user for points
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        //Slope
        boolean slopeCollinear = false
        if ((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)) {
            slopeCollinear = true;
        }

        //Area
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        boolean areaCollinear = (area == 0);

        //Displaying results
        System.out.println("Slope Method: " + (slopeCollinear ? "Collinear" : "Not Collinear"));

        System.out.println("Area Method:  " + (areaCollinear ? "Collinear" : "Not Collinear"));
    }
}