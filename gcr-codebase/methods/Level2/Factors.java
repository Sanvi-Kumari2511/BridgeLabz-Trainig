import java.util.Scanner;

 public class Factors { 
    //Creating a method
	public static int [] findFactors(int number){
	
	int count = 0;
	for(int i = 1; i <= number; i++){
	if(number % i == 0){
	count++;
	}
	}
	int factors_arr [] = new int[count];
	int index = 0;
	
	for(int i=1; i <= number; i++){
	if(number % i == 0){
	factors_arr[index] = i;
	index++;
	}
	}
	return factors_arr;
	}
	public static int sums(int [] arr){
	int sum = 0; 
	for(int x : arr){
	sum += x;
	}
	return sum;
	}
	
	public static int products(int [] arr){
	int product = 1;
	for(int x : arr){
	product *= x;
	}
	return product;
	}
	
	public static int squares(int [] arr){
	int sumSquare = 0;
	for(int x : arr){
	sumSquare += Math.pow(x, 2);
	}
	return sumSquare;
	}
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors_arr = findFactors(number);

        System.out.print("Factors are: ");
        for(int x : factors_arr) {
        System.out.print(x + " ");
        }
		System.out.println("\nSum of factors is " + sums(factors_arr));
        System.out.println("Product of factors is " + products(factors_arr));
        System.out.println("Sum of square of factors is " + squares(factors_arr));
       }
       }
	
	
	
	