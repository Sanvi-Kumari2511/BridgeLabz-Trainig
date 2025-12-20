import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking inputs from user
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();
		
        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] percent = new double[number];
        char[] grade = new char[number];

        for(int i = 0; i < number; i++) {

        System.out.print("Physics Marks: ");
        physics[i] = sc.nextDouble();

        System.out.print("Chemistry Marks: ");
        chemistry[i] = sc.nextDouble();

        System.out.print("Maths Marks: ");
        maths[i] = sc.nextDouble();
        
        percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

        // Printing the percentage, grade, and remarks
       if (percent[i] >= 80) {
       System.out.println("Percentage is " + percent[i]);
       System.out.println("Grade is A and remark is Level 4, above agency-normalized standards");
        } 
     
       else if(percent[i] >= 70){
       System.out.println("Percentage is " + percent[i]);
       System.out.println("Grade is B and remark is Level 3, at agency-normalized standards");
        } 
        
       else if(percent[i] >= 60){
       System.out.println("Percentage is " + percent[i]);
       System.out.println("Grade is C and remark is Level 2, below, but approaching agency-normalized standards");
        } 
        
       else if(percent[i] >= 50){
       System.out.println("Percentage is " + percent[i]);
       System.out.println("Grade is D and remark is Level 1, agency-normalized standards");
         }

       else if(percent[i] >= 40){
       System.out.println("Percentage is " + percent[i]);
       System.out.println("Grade is E and remark is Level 1- , too below agency-normalized standards");
        }

       else{
       System.out.println("Percentage is " + percent[i]);
       System.out.println("Grade is R and remark is Remedial standards");
        }
        }
        }
        }