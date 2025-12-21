import java.util.Scanner;

 public class SpringSeason { 
    //Creating a method
	public boolean checkSpringSeason(int month, int day){
	return (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >=1 && day <= 20);
	}
	
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	
	//Taking inputs from user
	System.out.print("Enter month : ");
	int month = sc.nextInt();
	
	System.out.print("Enter day : ");
	int day = sc.nextInt();
	
	SpringSeason object = new SpringSeason();
	
	if(object.checkSpringSeason(month, day)){
	System.out.print("Its a Spring Season");
	}
	else{
	System.out.print("Not a Spring Season");
	}
	}
	}
	
	
	