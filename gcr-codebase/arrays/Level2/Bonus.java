import java.util.Scanner;

  public class Bonus {
     public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
		
	//Taking inputs from user for storing salary and years of service
	double salary [] = new double [10];
	double years [] = new double [10];
		
	//Storing bonus and new salary
	double bonus [] = new double [10];
	double newSalary [] =  new double [10];
		
	double totalBonus = 0.0;
	double totalOldSalary = 0.0;
	double totalNewSalary = 0.0;
		
	System.out.println("Enter salary and years of service for 10 employees: ");
		
	for(int i = 0; i < 10; i++) {
	System.out.println("Enter salary for employee " + (i+1) + ": ");
	salary [i] = sc.nextDouble();
		
        System.out.print("Enter years of service for employee " + (i+1) + ": ");
        years [i] = sc.nextDouble();
		
	if(salary [i] <= 0 || years [i] < 0) {
        System.out.println("Invalid number, enter again\n");
        i--;  
        continue;
        }
        }
		
        System.out.println("\nCalculating bonus for each employee...\n");

        //Calculating bonus and totals
        for(int i = 0; i < 10; i++) {

        if(years [i] > 5) {
        bonus [i] = salary [i] * 0.05;  
        } 
        else {
        bonus [i] = salary [i] * 0.02;  
        }

        newSalary [i] = salary [i] + bonus [i];

        totalBonus += bonus [i];
        totalOldSalary += salary [i];
        totalNewSalary += newSalary [i];
        }

        //Displaying outputs
       
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);

       //Closing scanner
        sc.close();
       }
       }