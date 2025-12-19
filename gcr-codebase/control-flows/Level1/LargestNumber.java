import java.util.Scanner;

//program to check if the first, second, or third number is the largest of the three
public class LargestNumber
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

      //check if the first, second, or third number is the largest of the three

      if((num1>num2) && (num1>num3))
          {
      //Displaying if the first number is largest to all three numbers
      System.out.println("Is the first number the largest? Yes");
         }
      else if((num2>num3) && (num2>num3))
             {

      //Displaying if the second number is largest to all three numbers
      System.out.println("Is the second number the largest? Yes");
            }
       else
            {
      //Displaying if the first number is largest to all three numbers
      System.out.println("Is the third number the largest? Yes"); 
            }
       }
}