import java.util.Scanner;

public class TotalPriceCalculator
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // Taking input details from user
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Calculating the total price
        double totalPrice = unitPrice * quantity;

        // Displaying outputs
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

    }
}




