import java.util.*;

  public class BmiCalculator {
    public static void main(String args []) {
      Scanner sc=new Scanner (System.in);
	  
	  //Taking user's input
	  System.out.print("Enter number of persons: ");
	  int number = sc.nextInt();
	  
	  double height [] = new double [number];
	  double weight [] = new double [number];
	  double bmi [] = new double [number];
	  String status [] = new String [number];
	  
	  for(int i = 0; i < number; i++) {
	  System.out.print("\nPerson " + (i+1));
	  System.out.print("Enter height: ");
	  height [i] = sc.nextDouble();
	  System.out.print("Enter weight: ");
	  weight [i] =sc.nextDouble();
	  
          //Calculating BMI using formula
	  bmi[i] = weight [i] / (height [i] * height [i]);

          //Checking conditions for BMI
	  if(bmi [i] < 18.4)
	  status [i] = "Underweight";
	  else if(bmi [i] >= 18.5 && bmi [i] <= 24.9)
	  status [i] = " Normal";
	  else if(bmi [i] >= 25.0 && bmi [i] <=39.9)
	  status [i] = " Overwight";
	  else 
	  status [i] = "Obese";
	  }
          //Displaying outputs
          for(int i = 0; i < number; i++) {

	  System.out.println("Height: " +  height[i] + "," + " Weight: " + weight[i] + "," + " BMI: " + bmi[i] + "," + " Status: " + status[i]);
	  }
          }
	  }