import java.util.Scanner;

public class Coffee{
  public static void main(String args []){
      Scanner sc = new Scanner(System.in);
	  
	  //5% of GST
	  final double GST = 0.05;
	  while(true){
		  System.out.println("Enter types of coffee or exit");
		  String coffeeType = sc.next().toLowerCase();
		  
		  //Condition for exit
		  if(coffeeType.equals("exit")){
			  System.out.println("Thank you to visit!");
			  break;
		  } 
		  
		  double price = 0.0;
	  
	        //Ask the user for coffee types using switch case
            switch (coffeeType) {
                case  "espresso":
                    price = 120.0;
                    break;
					
                case "latte":
                    price = 140.0;
                    break;
					
                case "cappuccino":
                    price = 170.0;
                    break;
					
                default:
                    System.out.println("Invalid coffee type");
                    continue; 
            }
			
			//Taking input for quantity
            System.out.print("Enter the quantity: ");
            int quantity = sc.nextInt();

            //Calculating the price
            double totalPrice = price * quantity;
            double gstAmount = totalPrice * GST;
            double bill = totalPrice + gstAmount;
			
			//Displaying the results
			//System.out.println("Coffee Type : " + coffeeType);
			System.out.println("Quantity : " + quantity);
			System.out.println("Price : " + totalPrice);
			System.out.println("5 % GST : " + gstAmount);
			System.out.println("Total price customer have to pay : " + bill);
      }
   }
}