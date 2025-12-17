import java.util.Scanner;

public class DiscountedFees
{
 public static void  main(String args [])
   {

    // Taking usesr input details
    Scanner sc=new Scanner(System.in);
    double fee = sc.nextDouble();
    double discountPercent = sc.nextDouble();

    // Calculating discounted amount and final discounted fee 
    double discount = (fee*discountPercent)/100;
    double feePay = fee - discount;

    // Diplaying outputs
    System.out.println("The discount amount is INR  " + discount + " and final discounted fee is INR " + feePay );

   }
}