import java.util.Scanner;

//Conversion of Kilometers to Miles
 public class KilometersToMiles
 {
   public static void  main(String args [])
   {
    
    // Taking input details
    Scanner sc=new Scanner(System.in);
    double kilometer = sc.nextDouble();

     // Conversion of Kilometer to Miles 
     double miles = kilometers/1.6;

     // Diplaying outputs
     System.out.println("The total miles is " + miles + " mile for the given " + kilometer + " km");

   }
}