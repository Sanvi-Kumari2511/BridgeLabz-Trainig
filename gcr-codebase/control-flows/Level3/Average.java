import java.util.Scanner;

// Program to input marks and 3 subjects physics, chemistry and maths

public class Average
{
   public static void  main(String args [])
  {
    Scanner sc=new Scanner(System.in);
    
    //Taking user's input
     System.out.println("Enter subject 1 marks: ");
     int physicsMark = sc.nextInt();
           
     System.out.println("Enter subject 2marks: ");
     int chemistryMark = sc.nextInt();

      System.out.println("Enter subject 3marks: ");
      int mathsMark = sc.nextInt();

       // calculating the percentage
       double percent = (physicsMark + chemistryMark + mathsMark)/3.0;
        
       // Printing the percentage, grade, and remarks
       if (percent >= 80) {
       System.out.println("percentage is " + percent);
       System.out.println("grade is A and remark is Level 4, above agency-normalized standards");
        } 
     
       else if(percent >= 70 && percent <=79){
       System.out.println("percentage is " + percent);
       System.out.println("grade is B and remark is Level 3, at agency-normalized standards");
        } 
        
       else if(percent >= 60 && percent <=69){
       System.out.println("percentage is " + percent);
       System.out.println("grade is C and remark is Level 2, below, but approaching agency-normalized standards");
        } 
        
       else if(percent >= 50 && percent <=59){
       System.out.println("percentage is " + percent);
       System.out.println("grade is D and remark is Level 1, agency-normalized standards");
         }

       else if(percent >= 40 && percent <=49){
       System.out.println("percentage is " + percent);
       System.out.println("grade is E and remark is Level 1- , too below agency-normalized standards");
        }

       else{
       System.out.println("percentage is " + percent);
       System.out.println("grade is R and remark is Remedial standards");

        }
    }
}

