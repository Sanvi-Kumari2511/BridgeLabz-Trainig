import java.util.Scanner;

//program to check if the first number is smallest of the three numbers
public class SmallestNumber
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     
     // Taking input from user
      System.out.print(" Enter first number : ");
      int num1 = sc.nextInt();

      System.out.print(" Enter second number : ");
      int num2 = sc.nextInt();

      System.out.print(" Enter third number : ");
      int num3 = sc.nextInt();

       //check if the first number is smallest of the three numbers
       if((num1<num2) && (num1<num3))
       {
      //Displaying if the first number is smallest to all three numbers
      System.out.println("Is the first number the smallest? Yes");
      }
        else
        {
       System.out.println("Is the first number the smallest? No");
        }
    }
}