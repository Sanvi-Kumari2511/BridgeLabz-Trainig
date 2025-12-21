import java.util.Scanner;

 public class QuotientRemainder { 

    //Creating a method

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  
        result[1] = number % divisor;  

        return result;
        }

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        //Calling method
        int result [] = findRemainderAndQuotient (number, divisor);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}

	