package com.hospitalqueue;

public class HospitalQueue {
   public static void bubbleSort(Patient [] patients) {
	   int number  = patients.length;
	   
	   for(int i = 0; i < number - 1; i++) {
		   for(int j = 0; j < number - i - 1; j++) {
			   if(patients[j].critically < patients[j + 1].critically) {
				   Patient temp = patients[j];
				   patients[j] = patients[j + 1];
				   patients[j + 1] = temp;
			   }
		   }
	   }
   }
}
