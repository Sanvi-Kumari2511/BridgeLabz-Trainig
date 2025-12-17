import java.util.Scanner;

// Operations for basic calculator
public class BasicCalculator
{
 public static void  main(String args [])
   {

    // Taking user input details
    Scanner sc=new Scanner(System.in);
    float num1 = sc.nextFloat();
    float num2 = sc.nextFloat();

    // Performing basic arithmetic operations
     float add = num1 + num2;
     float sub = num1 - num2;
     float mul = num1 * num2;
     float div = num1 / num2;

    // Diplaying outputs
    System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + add + "," + sub + "," + mul +
", and " + div );
   }
}