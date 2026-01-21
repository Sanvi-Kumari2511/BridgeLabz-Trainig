package com.sortingordersbydeliverydeadline;

public class TailorShop {
   public static void insertionSort(Orders[] orders) {
	   for(int i = 1; i < orders.length; i++) {
		   Orders temp = orders[i];
		   int j = i - 1;
		   
		   while(j >= 0 && orders[j].deadline > temp.deadline) {
			     orders[j+1] = orders[j];
			     j--;
		   }
		   
		   orders[j+1] = temp;
	   }
		   
    }
     public static void main(String args []) {
    	 Orders orders [] = {
    			 
    			 new Orders ("Shirt", 5),
    			 new Orders ("Trouser", 4),
          		 new Orders ("Kurta", 3)	 
    	 };
    	 
    	 insertionSort(orders);
    	 
    	 for(int i = 0; i < orders.length; i++) {
    		 System.out.println(orders[i]);
    	 }
     }
}
