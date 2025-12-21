import java.util.Scanner;
  public class BmiCalculator {
     
	//Creating a method to calculate BMI and populate the 3rd column
    public static void calculateBMI(double[][] arr) {
    for (int i = 0; i < arr.length; i++) {
    double weight = arr[i][0]; 
    double heightCm = arr[i][1]; 
    double heightM = heightCm / 100; 
    double bmi = weight / (heightM * heightM);
    arr[i][2] = bmi; 
        }
    }
    
	//Creating a method to check the conditions of BMI
    public static String[] checkStatus(double[][] arr) {
	
    String[] status = new String[arr.length];
    for(int i = 0; i < arr.length; i++) {
    double bmi = arr[i][2];
    if (bmi <= 18.4) {
    status[i] = "Underweight";
    } 
	else if (bmi > 18.5 && bmi <= 24.9) {
    status[i] = "Normal";
    } 
	else if (bmi > 25.0 && bmi <= 39.9) {
    status[i] = "Overweight";
    } 
	else {
    status[i] = "Obese";
    }
    }
    return status;
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Creating an array store data of 10 persons ini 3 columns
        double[][] arr2 = new double[10][3];
		
		//Taking input from user
		for (int i = 0; i < 10; i++) {
        System.out.print("Enter weight(kg): ");
        arr2[i][0] = sc.nextDouble();
        System.out.print("Enter height(cm): ");
        arr2[i][1] = sc.nextDouble();
        }
        
		//Calculating BMI
		calculateBMI(arr2);
		
		//Checking status
		String[] currentStatus = checkStatus(arr2);
		
		//Displaying results
		System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
        System.out.println(arr2[i][0] + "\t\t" + arr2[i][1] + "\t\t" + arr2[i][2] + "\t\t" + currentStatus[i]);
		}
		}
		}