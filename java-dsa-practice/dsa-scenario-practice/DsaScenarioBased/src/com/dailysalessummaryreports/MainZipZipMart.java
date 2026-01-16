package com.dailysalessummaryreports;
import java.util.*;

public class MainZipZipMart {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Taking input from user
    System.out.print("Enter number of transactions: ");
    int n = sc.nextInt();
    sc.nextLine(); 

    //Creating array to store transactions
    Transaction[] transactions = new Transaction[n];

    //Taking input for each transaction
    for (int i = 0; i < n; i++) {

        System.out.println("\nEnter details for Transaction " + (i + 1));

        System.out.print("Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); 

        transactions[i] = new Transaction(date, amount);
    }

    //Displaying transactions before sorting
    System.out.println("\nBefore Sorting:");
    
    for (Transaction t : transactions) {
        t.display();
    }

    //Applying Merge Sort
    ZipZipMart.mergeSort(transactions, 0, n - 1);

    //Displaying transactions after sorting
    System.out.println("\nAfter Sorting (By Date & Amount):");
    
    for (Transaction t : transactions) {
        t.display();
    }
  }
}