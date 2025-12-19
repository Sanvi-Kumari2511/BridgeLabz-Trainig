import java.util.Scanner;

//Program to find the BMI of a person

public class BmiCalculator
{
   public static void  main(String args [])
  {
    Scanner sc=new Scanner(System.in);
    
    //Taking user's input
     System.out.println("Enter a weight : ");
     double weightKg = sc.nextInt();

      System.out.println("Enter a height : ");
      double heightCm = sc.nextInt();
           
       double heightInMeter = heightCm/100;

        // calculating BMI using formula
       double bmi = weightKg/(heightCm * heightCm);
       

        // checking the conditions and printing the outputs
        if(bmi <= 18.4){
        System.out.println("The status is underweight");
          }

        else if(bmi > 18.5 && bmi <= 24.9){
        System.out.println("The status is normal");
          }
       
        else if(bmi > 25.0 && bmi <= 39.9){
        System.out.println("The status is overweight");
          }

         else{
        System.out.println("The status is obese");
          }

         } 
            
      }

