import java.util.Scanner;
public class StudentsPresence {
    public static void main(String args []){
	    Scanner sc = new Scanner(System.in);
		String arr [] = new String[10];
		
		int present = 0;
		int absent = 0;
		
		//Taking input from user
		System.out.println("Name of 10 students: ");
         for(int i = 0; i < arr.length; i++){
			 System.out.println("Name of student " + (i+1) + ": ");
			 arr[i] = sc.nextLine();
		 }
		 
		 //Checking who is present or absent
		for(String name : arr){
		   System.out.println(name + " is present or absent: ");
		   char attendance = sc.next().charAt(0);
		   
		   
		   //Conditions for present and absent
		   if(attendance == 'P' || attendance == 'p'){
		      present++;
		   }
		   else if(attendance == 'A' || attendance == 'a'){
		      absent++;
		   }
		   else{
		      System.out.println("Marked absent");
			  absent++;
		   }
		   
		}
		
		 //Displaying the results
		 System.out.println("Total number of students: " + arr.length);
		 System.out.println("Total number of students present: " + present);
		 System.out.println("Total number of students absent: " + absent);
	}
}