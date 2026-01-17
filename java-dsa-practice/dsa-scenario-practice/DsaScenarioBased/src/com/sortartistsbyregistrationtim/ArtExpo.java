package com.sortartistsbyregistrationtim;
import java.util.Scanner;

public class ArtExpo {

	    //Insertion Sort method
	    public static void insertionSort(Artist[] artists) {
	        for (int i = 1; i < artists.length; i++) {
	            Artist key = artists[i];
	            int j = i - 1;

	            while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
	                artists[j + 1] = artists[j];
	                j--;
	            }
	            
	            artists[j + 1] = key;
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of artists: ");
	        int n = sc.nextInt();
	        
	        sc.nextLine(); 
	        
	        Artist[] artists = new Artist[n];

	        //Taking input from user
	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details of artist " + (i + 1));

	            System.out.print("Name: ");
	            String name = sc.nextLine();

	            System.out.print("Registration Time (in minutes): ");
	            int time = sc.nextInt();
	            
	            sc.nextLine(); 

	            artists[i] = new Artist(name, time);
	        }

	        //Sorting artists by registration time
	        insertionSort(artists);

	        // Display result
	        System.out.println("\nArtists sorted by registration time:");
	        for (Artist a : artists) {
	            System.out.println(a.name + " - " + a.registrationTime);
	        }

	    
	  }

}
