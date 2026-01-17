package com.sortingflavorsbypopularity;
import java.util.*;

public class IceCreamRush {
	
	//Bubble Sort method to sort flavors by sales
    public static void bubbleSort(Flavor[] flavors) {

        int n = flavors.length;

        //Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {

            //Inner loop for adjacent comparison
            for (int j = 0; j < n - 1 - i; j++) {

                //Comparing current flavor with next flavor
                if (flavors[j].sales > flavors[j + 1].sales) {

                    //Swap if current has more sales than next
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 8; 
        Flavor[] flavors = new Flavor[n];

        //Taking input from user
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of flavor " + (i + 1));

            System.out.print("Flavor Name: ");
            String name = sc.nextLine();

            System.out.print("Weekly Sales Count: ");
            int sales = sc.nextInt();
            sc.nextLine(); 

            //Storing flavor data
            flavors[i] = new Flavor(name, sales);
        }

        //Applying Bubble Sort
        bubbleSort(flavors);

        //Displaying sorted flavors
        System.out.println("\nFlavors sorted by popularity: ");
        
        for (Flavor f : flavors) {
            System.out.println(f.name + " - " + f.sales);
        }
    }
}
