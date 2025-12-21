import java.util.Scanner;

 public class ChocolateNumbers { 

    //Creating a method

    public static int[] findRemainderAndQuotient(int chocolate, int children) {
        int[] result = new int[2];
        result[0] = chocolate / children;  
        result[1] = chocolate % children;  

        return result;
        }

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
		
        System.out.print("Enter number of children : ");
        int numberOfChildren = sc.nextInt();

        //Calling method
        int result [] = findRemainderAndQuotient (numberOfChocolates, numberOfChildren);
        System.out.println("Chocolate: " + result[0]);
        System.out.println("Children: " + result[1]);
    }
}

	