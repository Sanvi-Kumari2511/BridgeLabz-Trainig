import java.util.Scanner;

public class StudentGrades2DArray {  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        //Taking inputs from user
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        //Storing marks of all students in 2D array
        double[][] marks = new double[number][3];
        double[] percent = new double[number];

        for(int i = 0; i < number; i++) {

        System.out.print("Physics Marks: ");
        marks[i][0] = sc.nextDouble();

        System.out.print("Chemistry Marks: ");
        marks[i][1] = sc.nextDouble();

        System.out.print("Maths Marks: ");
        marks[i][2] = sc.nextDouble();

        //Calculating percentage
        percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

         //Displaying the percentage, grade, and remarks
        System.out.println("\nPercentage is " + percent[i]);

        if (percent[i] >= 80) {
        System.out.println("Grade is A and remark is Level 4, above agency-normalized standards\n");
        }
        else if (percent[i] >= 70) {
        System.out.println("Grade is B and remark is Level 3, at agency-normalized standards\n");
        }
        else if (percent[i] >= 60) {
        System.out.println("Grade is C and remark is Level 2, below, but approaching agency-normalized standards\n");
        }
        else if (percent[i] >= 50) {
        System.out.println("Grade is D and remark is Level 1, agency-normalized standards\n");
        }
        else if (percent[i] >= 40) {
        System.out.println("Grade is E and remark is Level 1-, too below agency-normalized standards\n");
        }
        else {
        System.out.println("Grade is R and remark is Remedial standards\n");
        }
        }
        }
        }