import java.util.Scanner;

public class MaximumHandshakes { 

    //Creating a method
  
    public int handshakes(int n) {
    return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Taking inputs from user
    System.out.print("Enter number of students: ");
    int numberOfStudents = sc.nextInt();

    //Creating object
    MaximumHandshakes obj = new MaximumHandshakes();

    //Calling method through object
    int count = obj.handshakes(numberOfStudents);

    //Displaying result
    System.out.println("Maximum possible handshakes: " + count);
    }
    }
