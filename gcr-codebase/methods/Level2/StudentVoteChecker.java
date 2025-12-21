import java.util.Scanner;
 public class StudentVoteChecker { 
   
    //Creating a method and checking conditions for vote
	public boolean canStudentVote(int age){
	 if(age < 0) {
	 return false;
	 }
	 else if(age >= 18){
	 return true;
	 }
	 else{
	 return false;
	 }
	 }
	 
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Creating object of class
		StudentVoteChecker object = new StudentVoteChecker();
		int age [] = new int [10];
		
		for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age: ");
            age[i] = sc.nextInt();
			
			boolean canVote = object.canStudentVote(age[i]);
			
			//Displaying result
			if(canVote){
			System.out.println("Student can vote");
            } 
			else {
            System.out.println("Student cannot vote");
			}
			}
			}
			}