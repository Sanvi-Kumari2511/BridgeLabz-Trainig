import java.util.Scanner;

  public class DigitsDynamic {
     public static void main(String args []) {
	    Scanner sc = new Scanner(System.in);
		
	        //Taking input from user
		System.out.print("Enter a number : ");
                int num = sc.nextInt();
		
		int maxDigit = 10;
		int digits [] = new int [maxDigit];

		int index = 0;

		while(num != 0) {

                if(index == maxDigit) {
                
                maxDigit += 10;

	       int temp [] = new int [maxDigit];

                // Copying the old digits to temp array
                for(int i = 0; i < digits.length; i++) {
                temp [i] = digits [i];
                }

                //Assigning new expanded array
                digits = temp;
                }

               digits[index] = num % 10;
               num = num / 10;
               index++;
               }
		
		//Initializing largest and second largest digit
		int largest = 0;
                int secondLargest = 0;
		
		//Finding largest & second largest digit
                for(int i = 0; i < index; i++) {
                if(digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
                }
               else if(digits[i] > secondLargest && digits[i] != largest) {
               secondLargest = digits[i];
                }
                }
		System.out.println("Largest digit is " + largest);
                System.out.println("Second largest digit is " + secondLargest);
		}
		}
		
