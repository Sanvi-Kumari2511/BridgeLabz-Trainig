import java.util.Scanner;

//program to check a number is divisible by 5 or not
public class DivisibleByFive
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     
     // Taking input from user
      System.out.print(" Enter a number : ");
      int num = sc.nextInt();
      
       //Displaying if the number is divisible by 5 or not
      System.out.println("Is the number " + num + " divisible by 5? " + (num%5==0));

    }
}