import java.util.Scanner;

public class DoubleOperation 
{
    public static void main(String[] args) 
   {

        Scanner sc = new Scanner(System.in);

        // Taking input details from user
        System.out.print("Enter value for a: ");
        double a = sc.nextInt();

        System.out.print("Enter value for b: ");
        double b = sc.nextInt();

        System.out.print("Enter value for c: ");
        double c = sc.nextInt();

        // Compute operations using precedence rules

        // Multiplication first
        double result1 = a + b * c;  
    
        // Multiplication first then adding c
        double result2 = a * b + c;    

        // Division before addition
        double result3 = c + a / b;     
 
        // Modulus before addition
        double result4 = a % b + c;       
      
       System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

    }
}