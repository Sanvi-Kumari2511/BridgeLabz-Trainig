import java.util.Scanner;

  public class Copy2DInto1D {
     public static void main(String args []) {
	    Scanner sc = new Scanner(System.in);
		
            //Taking inputs from user
	    System.out.print("Enter rows: ");
            int rows = sc.nextInt();

            System.out.print("Enter columns: ");
            int cols = sc.nextInt();
		
            int[][] matrix = new int[rows][cols];          
            int[] array = new int[rows * cols]; 
		
            System.out.println("\nEnter the elements of the matrix:");
		
           //Taking inputs for matrix
           for(int i = 0; i < rows; i++) {
           for(int j = 0; j < cols; j++) {
           System.out.print("Element[" + i + "][" + j + "]: ");
           matrix[i][j] = sc.nextInt();
           }
           }
          System.out.println("\nCopying elements into 1D array ");
	  int index = 0;
		
	 //Copying matrix into 1D array
         for(int i = 0; i < rows; i++) {
         for(int j = 0; j < cols; j++) {
         array[index] = matrix[i][j];
         index++;
         }
         }
		
        System.out.println("\nElements in 1D array:");
        for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
             }	
          }
     }
