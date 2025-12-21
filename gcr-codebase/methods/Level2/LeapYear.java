import java.util.Scanner;
 public class LeapYear { 
 
   //Creating a method
   public static boolean checkLeapYear(int year){
   
   //Checking conditions for a Leap Year
   if(year % 4 == 0 && year % 100 != 0){
   return true;
   }
   else if(year % 400 == 0){
   return true;
   }
   else{
   return false;
   }
   }
   
   public static void main(String args []){
   Scanner sc = new Scanner(System.in);
   
   //Taking input from user
   System.out.print("Enter a year: ");
   int year = sc.nextInt();
   
   //Displaying results
   if(checkLeapYear(year)){
   System.out.println(year + " is a Leap Year");
   }
   else{
   System.out.println(year + " is not a Leap Year");
   }
   }
   }
   
 