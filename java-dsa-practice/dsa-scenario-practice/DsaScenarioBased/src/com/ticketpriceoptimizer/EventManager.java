package com.ticketpriceoptimizer;

public class EventManager {
      
	//Quick sort method
	static void quickSort(Ticket[] tickets, int low, int high) {
	if(low < high) {
		
		//Partition the array and get pivot index
		int pivotIndex = partition(tickets, low, high);
		
		//Recursively sort left part
		quickSort(tickets, low, pivotIndex - 1);
		
		//Recursively sort right part
		quickSort(tickets, pivotIndex + 1, high);
		
	  }
	}
	
	//Partition method using last element as pivot
	static int partition(Ticket[] tickets, int low, int high) {
		double pivot = tickets[high].price;
		int i = low - 1;
		
		//Rearrange elements based on pivot
		for(int j = low; j < high; j++) {
			if(tickets[j].price <= pivot) {
				i++;
				
				//Swap tickets[i] and tickets[j]
				Ticket temp = tickets[i];
				tickets[i] = tickets[j];
				tickets[j] = temp;
			}
		}
		
		//Place pivot in correct position
	    Ticket temp = tickets[i + 1];
	    tickets[i + 1] = tickets[high];
	    tickets[high] = temp;
	    
	    return i + 1;
	}
}
