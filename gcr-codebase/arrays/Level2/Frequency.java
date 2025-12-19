import java.util.*;

  public class Frequency {
    public static void main(String args []) {
      Scanner sc=new Scanner (System.in);
	  
	  //Taking user's input
	  System.out.print("Enter a number ");
	  int number = sc.nextInt();
	  int temp = number;
	  
	  //Counting digits
	  int count  = 0;
	  while(temp != 0) {
	  temp = temp / 10;
	  count++;
	  }
	  int digit [] = new int [count];
	  temp = number;
	  
	  //Extracting digits and storing in an array
	  for (int i = count - 1; i >= 0; i--) {
          digit[i] = (temp % 10);
          temp = temp / 10;
          }
	  int[] frequency = new int[10];

          //Counting the frequency
          for(int i = 0; i < count; i++) {
          frequency[digit[i]]++;
          }
	  //Displaying results
	  System.out.println("\nTotal frequency " + number + ":");
          for (int i = 0; i < 10; i++) {
          if (frequency[i] > 0) {
          System.out.println("Digit " + i + " = " + frequency[i] + " times");
          }
          }
	  }
	  }