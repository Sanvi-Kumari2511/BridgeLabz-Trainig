import java.util.Scanner;
public class TrainReservationQueue{
   public static void main(String args []){
	   Scanner sc = new Scanner(System.in);
       int seats = 5;
	   int choice;
	   
	   while(true){
	   System.out.println("1. Book tickets: ");
	   System.out.println("2. Available tickets: ");
	   System.out.println("3. Exit: ");
	   System.out.println("Enter your choice");
	   choice = sc.nextInt();
	   
	   switch(choice){
	   
	   case 1: 
	      if (seats > 0) {
             seats--;
             System.out.println("Successfully ticekt booked");
             System.out.println("Remaining seats are: " + seats);
             } 
			 else {
             System.out.println("There is no available seats");
             break;
             }
             break;

      case 2:
             System.out.println("Number of available seats: " + seats);
             break;

      case 3:
             System.out.println("Thank you!");
             
             return;

      default:
             System.out.println("Please try again, it's a wrong choice");
	        }
        }  
    }
}