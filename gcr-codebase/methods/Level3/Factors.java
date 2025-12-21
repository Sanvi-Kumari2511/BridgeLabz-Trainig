import java.util.Scanner;
   public class Factors{
   
   //Creating a method to find factors of a number
   public static int [] findFactors(int number){
   int count = 0;
   
    //loop for count the factors
    for (int i = 1; i <= number; i++) {
    if (number % i == 0)
    count++;
    }

    int[] factors = new int[count];
    int index = 0;

    //loop for storing the factors
    for (int i = 1; i <= number; i++) {
    if (number % i == 0) {
    factors[index] = i;
    index++;
    }
    }
    return factors;
    }
	
	//Creating a method to find greatest factor
    public static int greatest(int[] factors) {
    int maximum = Integer.MIN_VALUE;

    for (int fact : factors) {
    if (fact > maximum)
    maximum = fact;
    }
    return maximum;
    }
	
	//Creating a  method to find sum of factors
    public static int factorSum(int[] factors) {
    int sum = 0;
    for (int fact : factors) 
    sum += fact;
    return sum;
    }

    //Creating a method to find product of factors
    public static long factorsProduct(int[] factors) {
    long product = 1;
    for (int fact : factors) 
	product *= fact;
    return product;
    }
	
	//Creating a method to find product of cubes of factors
    public static long cubesProduct(int[] factors) {
    long product = 1;
    for (int fact : factors) 
	product *= Math.pow(fact, 3);
    return product;
    }

	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Taking user's input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.println("\nFactors of " + number + " is");
        for (int fact : factors)
        System.out.println(fact + " ");

        int greatest = greatest(factors);
        System.out.println("Greatest factor is: " + greatest);
		
		System.out.println("Sum of factors: " + factorSum(factors));
        System.out.println("Product of factors: " + factorsProduct(factors));
        System.out.println("Product of cubes of factors: " + cubesProduct(factors));
        }
        }