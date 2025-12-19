import java.util.Scanner;

  public class FizzBuzzProgram {
     public static void main(String args []) {
	    Scanner sc = new Scanner(System.in);
		
            //Taking inputs from user
	    System.out.print("Enter a number: ");
            int number = sc.nextInt();
		
	    //Checking the number is positive or not
	    if(number <= 0) {
	    System.out.println(number + " is not a positive number");
            return;
            }
		
	    String result [] = new String[number + 1];
		
            //Logic for FizzBuzz
	    for(int i = 0; i <= number; i++){
            if(i % 3 == 0 && i % 5 == 0){
            result[i] = "FizzBuzz";
            }
            else if(i % 3 == 0){
            result[i] = "Fizz";
            }
           else if(i % 5 == 0){
           result[i] = "Buzz";
           }
           else{
           result[i] = String.valueOf(i);
           }
           }
		
	  //Displaying result
	  System.out.println("\nFizzBuzz Output is: ");
          for(int i = 0; i <= number; i++){
          System.out.println("Position " + i + " = " + result[i]);
          } 
	  }    
          }
		