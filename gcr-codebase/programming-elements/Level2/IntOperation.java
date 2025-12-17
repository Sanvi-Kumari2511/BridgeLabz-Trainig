import java.util.Scanner;

public class IntOperation 
{
    public static void main(String[] args) 
   {

        Scanner sc = new Scanner(System.in);

        // Taking input details from user
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // Compute operations using precedence rules

        // Multiplication first
        int result1 = a + b * c;  
    
        // Multiplication first then adding c
        int result2 = a * b + c;    

        // Division before addition
        int result3 = c + a / b;     
 
        // Modulus before addition
        int result4 = a % b + c;       
      
       System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

    }
}