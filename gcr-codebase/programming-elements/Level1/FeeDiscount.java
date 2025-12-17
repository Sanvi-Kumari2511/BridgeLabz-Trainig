public class FeeDiscount
{
 public static void  main(String args [])
   {

    // Taking input details
    double fee = 125000;
    double discountPercent = 10;

    // Calculating discounted amount and final discounted fee 
    double discount = (fee*discountPercent)/100;
    double feePay = fee - discount;

    // Diplaying outputs
    System.out.println("The discount amount is INR  " + discount + " and final discounted fee is INR " + feePay );

   }
}