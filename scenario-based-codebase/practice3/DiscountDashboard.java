import java.util.Scanner;
   public class DiscountDashboard {
       public static void main(String args []){
	       Scanner sc = new Scanner(System.in);
		   
		      //Taking input from user
		      System.out.println("Enter a number: ");
			  int number = sc.nextInt();
			  double totalPrice = 0;
			  
			  for(int i = 1; i <= number; i++){
			     System.out.println("Price of item " + i + ": ");
				 double price = sc.nextInt();
				 totalPrice += price;
				 
				 double discount = 0;
				 //Discount of 10% if total price is greater than 2000
				 if(totalPrice >= 2000){
				 discount = totalPrice * 0.10;
				 }
				 else{
					 discount = 0;
				 }
				 double finalPrice = totalPrice - discount;
				 
				 System.out.println("Total Price is: " + totalPrice);
				 System.out.println("Final Price is: " + finalPrice);
				 
			  }
	   }
  }