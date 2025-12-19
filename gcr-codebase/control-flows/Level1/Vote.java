import java.util.Scanner;

//program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18 

public class Vote
{
       public static void main(String args[])
           {
            Scanner sc=new Scanner(System.in);
     
            // Taking input from user
            System.out.print(" Enter age of the person : ");
            int age = sc.nextInt();

            // Checking condition whether a person can vote or not
            if(age>=18)
            {

             //Displaying  If the person's age is greater or equal to 18 then the output is
              System.out.println("The person's age is " + age + " and can vote"); 
              }
              else
              {
              System.out.println("The person's age is " + age + " and cannot vote"); 
             }
       }
}