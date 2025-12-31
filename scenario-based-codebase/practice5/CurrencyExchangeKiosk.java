import java.util.Scanner;
public class CurrencyExchangeKiosk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variable to store user's choice to continue
        char choice;

        do {

            //Taking amount in INR from user
            System.out.print("Enter amount in INR: ");
            double amount = sc.nextDouble();

            //Displaying currency options
            System.out.println("Select target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            System.out.println("4. JPY");

            //Reading currency option as character
            char option = sc.next().charAt(0);

            //Variable to store converted amount
            double convertedAmount = 0;

            switch (option) {

                //Converting INR to USD
                case '1':
                    convertedAmount = amount * 0.011;
                    System.out.println("Amount after converted in USD: " + convertedAmount);
                    break;

                //Converting INR to EUR
                case '2':
                    convertedAmount = amount * 0.0095;
                    System.out.println("Amount after converted in EUR: " + convertedAmount);
                    break;

                //Converting INR to GBP
                case '3':
                    convertedAmount = amount * 0.0083;
                    System.out.println("Amount after converted in GBP: " + convertedAmount);
                    break;

                //Converting INR to JPY
                case '4':
                    convertedAmount = amount * 1.8;
                    System.out.println("Amount after converted in JPY: " + convertedAmount);
                    break;

                default:
                    System.out.println("Invalid selection of currency");
            }

                //Asking user whether to perform another conversion or not
               System.out.print("Do you want another conversion? (y/n): ");
               choice = sc.next().charAt(0);
 
        }
              while (choice == 'y' || choice == 'Y');
			  
             //Displaying exit message
             System.out.println("Thank you!");
    }
}