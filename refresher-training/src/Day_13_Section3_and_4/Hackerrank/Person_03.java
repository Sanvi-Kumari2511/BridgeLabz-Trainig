package Day_13_Section3_and_4.Hackerrank;

import java.util.*;
public class Person_03 {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person_03(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	" ID: " + idNumber);
        }

    }

    class Student extends Person_03{
        private int[] testScores;

        Student(String firstName, String lastName, int identification, int[] scores){
            super(firstName, lastName, identification);

            this.testScores = scores;

        }

        char calculate(){
            int sum = 0;
            for(int i = 0; i<testScores.length; i++){
                sum += testScores[i];
            }

            int average = sum/testScores.length;

            if(average >= 90){
                return 'O';
            }

            else if(average >= 80){
                return 'E';
            }
            else if(average >= 70){
                return 'A';
            }

            else if(average >= 55){
                return 'P';
            }
            else if(average >= 40){
                return 'D';
            }
            else{
                return 'T';
            }
        }

    }

    class Solution1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String firstName = sc.next();
            String lastName = sc.next();
            int id = sc.nextInt();
            int numScores = sc.nextInt();

            int[] testScores = new int[numScores];
            for(int i = 0; i < numScores; i++){
                testScores[i] = sc.nextInt();
            }

            Student s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate() );
        }
}
