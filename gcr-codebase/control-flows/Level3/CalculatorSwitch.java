import java.util.Scanner;

//Program to check if a number is an Abundant Number.

public class CalculatorSwitch
{
   public static void  main(String args [])
  {
    Scanner sc=new Scanner(System.in);
    
     double number1, number2, result = 0;
     int number; 
     String op;

    //Taking user's input
     System.out.println("Enter a first number : ");
     number1 = sc.nextDouble();
       
     System.out.println("Enter a second number : ");
     number2 = sc.nextDouble();
  
     System.out.println("Choose an operator (+, -, *, /): ");
     op = sc.next();
     
     System.out.println("Enter the number of operations to run: ");
     number = sc.nextInt();
    
     for(int i = 1; i < number; i++) {
     switch(op) {
     case "+" :
     result = number1 + number2;
     break;

      case "-" :
      result = number1- number2;
      break;

      case "*" :
      result = number1* number2;
      break;

      case "/" :
      if(number2 ==0) {
      System.out.println("The number is not divided by 0");
      return;
      }

     result = number1 / number2;
     break;

      default : 
      System.out.println("The operator is invalid");
      return;
       }
     }
     if(number <= 1) {
     
     System.out.println("The loop will not be execute");
     }
     else {

     // Printing the result
      System.out.println(number1 + " " + op + " " + number2 + " = " + result);
       }
   }
}


