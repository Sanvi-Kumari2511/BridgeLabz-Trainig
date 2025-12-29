import java.util.Scanner;
import java.util.Random;
   public class NumberGuessingGame{
       public static void main(String args []){
	       Scanner sc = new Scanner(System.in);
		      Random random = new Random();
			  int number = random.nextInt(100)+1;
			  int guess;
			  int count = 0;
			  
			  System.out.println("Enter a random number between 1 to 100: ");
			  
			  do{
			     System.out.println("Enter your guessing number: ");
				  guess = sc.nextInt();
				  count++;
				  
				  if(guess > number){
				  System.out.println("Your guessing number is too high");
				  }
				  else if(guess < number){
				  System.out.println("Your guessing number is too low");
				  }
				  else{
				  System.out.println("You guess the correct number and won the game");
				  break;
				  }
				  }
				  while(count < 5);
				      if(count == 5 && guess != number){
					      System.out.println("Your attempt is out of range ," + "the right number is: " + number);
					  }
	           
			      
	    }
   }