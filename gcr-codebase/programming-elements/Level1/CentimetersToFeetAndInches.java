import java.util.Scanner;

//Conversion of centimeters into feet and inches
public class CentimetersToFeetAndInches
{
 public static void  main(String args [])
   {

    // Taking user input details
    Scanner sc=new Scanner(System.in);
    double heightInCm = sc.nextDouble();

    // converting centimeters into feet and inches
       double inches = heightInCm/2.54;
       double feet = inches/12;

    // Diplaying outputs
    System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);

   }
}