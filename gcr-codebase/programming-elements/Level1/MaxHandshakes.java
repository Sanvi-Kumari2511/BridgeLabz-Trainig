import java.util.Scanner;

public class MaxHandshakes 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        
        // Taking inputs from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculating maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum possible handshakes are " + maxHandshakes);
    }
}



