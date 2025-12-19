import java.util.Scanner;
public class LeapYearIf
{
   public static void  main(String args [])
{
    Scanner sc=new Scanner(System.in);
    
    //Taking user's input
     System.out.println("Enter a year: ");
     int year = sc.nextInt();
      
    // checking conditions of leap year
    if(year >= 1582 && (year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0)))
    {
    System.out.println(year + " is a leap year");
    }
    else 
    {
    System.out.println(year + " is not a leap year");
     }
   }
}