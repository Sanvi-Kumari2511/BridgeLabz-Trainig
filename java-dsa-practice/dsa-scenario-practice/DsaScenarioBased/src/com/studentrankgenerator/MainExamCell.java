package com.studentrankgenerator;
import java.util.*;

public class MainExamCell {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        //Taking input student details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Score: ");
            int score = sc.nextInt();

            students[i] = new Student(roll, name, score);
        }

        //Displaying before sorting
        System.out.println("\nBefore Sorting: ");
        
        for (Student s : students) {
            s.display();
        }

        //Applying Merge Sort
        ExamCell.mergeSort(students, 0, n - 1);

        //Displaying rank list
        System.out.println("\nState-Level Rank List: ");
        for (int i = 0; i < students.length; i++) {
        	
            System.out.print("Rank " + (i + 1) + " -> ");
            students[i].display();
        }
    }
}
