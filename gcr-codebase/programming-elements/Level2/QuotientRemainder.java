import java.util.Scanner;

public class QuotientRemainder 
{
    public static void main(String[] args) 
   {

        Scanner sc = new Scanner(System.in);

        //Taking input details from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Calculating quotient
        int quotient = num1 / num2;  

        // Calculating remainder 
        int remainder = num1 % num2;  

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + num1 + " and " + num2);
    }
}
