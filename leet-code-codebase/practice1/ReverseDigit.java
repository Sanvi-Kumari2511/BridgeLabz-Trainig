import java.util.Scanner;

class ReverseDigit {
    public static int reverse(int number) {
        int result=0;
        while(number!=0){
            int lastDigit=number%10;
            if(result<Integer.MIN_VALUE/10 || result>Integer.MAX_VALUE/10)
            {
                return 0;
            }
            result=result*10+lastDigit;
            number=number/10;
        }
        return result;
    }
	
	public static void main(String args []){
	   Scanner sc = new Scanner(System.in);
	   //Taking input from user
	   System.out.println("Enter a number: ");
	   int number = sc.nextInt();
	   
	   //Calling the method
	   int result = reverse(number);
	   System.out.println("Number afetr reverse: " + result);
	 
	}
} 