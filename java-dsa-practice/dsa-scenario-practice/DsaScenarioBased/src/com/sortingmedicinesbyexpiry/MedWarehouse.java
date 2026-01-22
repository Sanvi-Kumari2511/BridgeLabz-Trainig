package com.sortingmedicinesbyexpiry;

public class MedWarehouse {
    public static void mergeSort(Medicine[] med, int left, int right) {
    	if(left < right) {
    		int mid = (left + right) / 2;
    		
    		//Recursively sort the left half
    		mergeSort(med, left, mid);
    		
    		//Recursively sort the right half
    		mergeSort(med, mid + 1, right);
    		
    		//Merge the two sorted halves
    		merge(med, left, mid, right);
    	}
    }
    
    //Merge two sorted sublists
    private static void merge(Medicine[] med, int left, int mid, int right) {
    	
    	//Size of left and right sublist
    	int num1 = mid - left +1;
    	int num2 = right - mid;
    	
    	//Temporary arrays to store left and right sublists
    	Medicine[] Left = new Medicine[num1];
    	Medicine[] Right = new Medicine[num2];
    	
    	//Copy data into left sublist
    	for(int i = 0; i < num1; i++) 
    		Left[i] = med[left + i];
    		
        //Copy data into right sublist
    		for(int j = 0; j < num2; j++) 
    			Right[j] = med[mid + 1 + j];
    			
    			int i = 0, j = 0, k =left;
    			
    			while(i < num1 && j < num2) {
    				if(Left[i].expiryDate <= Right[j].expiryDate) {
    					med[k++] = Left[i++];
    				}
    				
    					else {
    						med[k++] = Right[j++];
    					}
    				}
    				
    				//Copy remaining elements from left sublist
    				while(i < num1) 
    					med[k++] = Left[i++];
    					
    					
    			    //Copy remaining elements from right sublist
    				while(j < num2) 
    					med[k++] = Right[j++];
    					}
    				
    				public static void main(String args []) {
    					
    					//Creating medicine objects with expiry date
    					Medicine[] medicines = {
    							              
    							 new Medicine("Paracetamol", 100),
    							 new Medicine("Dolo", 90),
    							 new Medicine("Antibiotic", 80),
    							 new Medicine("Cough Syrup", 50)
  
    							 
    					};
    			
    					
    					//Applying merge sort based on expiry dates
    					mergeSort(medicines, 0, medicines.length - 1);
    					
    					
    					//Displaying sorted medicine
    					for(int i = 0; i < medicines.length; i++) {
    						System.out.println(medicines[i] + " ");
    					}
    	
          }
}
