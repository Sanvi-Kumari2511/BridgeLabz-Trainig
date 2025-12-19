import java.util.Scanner;

 //Program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.

  public class AgeForVote {
    public static void main(String args []) {
	  Scanner sc=new Scanner(System.in);
	  //Taking inputs
      int age [] = new int [10];
	  System.out.println("Enter the age of 10 students:");
	
      for(int i = 0; i < age.length; i++){
	      System.out.print("Enter age " + (i+1) + ": ");
          age[i] = sc.nextInt();
        }
		  System.out.println("Voting Results: ");
	      
		  for(int i = 0; i < age.length; i++) {
		      if(age[i] < 0) {
			  System.out.println("Invalid age: " + age[i]);
            }
			else if(age[i]>=18) {
			  System.out.println("The student whose age: " + age[i] + " can vote");
			 }
			 else {
			  System.out.println("The student whose age: " + age[i] + " cannot vote");
			 }
		    }
		}
	 }