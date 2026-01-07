package com.binarysearch;

public class SearchTargetValue {

	    //Method to search target value in matrix
	    public static boolean searchMatrix(int[][] matrix, int target) {

	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        int left = 0;
	        int right = rows * cols - 1;

	        while (left <= right) {

	            int mid = left + (right - left) / 2;

	            //Converting 1D index to 2D index
	            int row = mid / cols;
	            int col = mid % cols;

	            int midElement = matrix[row][col];

	            //Checking if target found
	            if (midElement == target) {
	                return true;
	            }
	            //Searching left half
	            else if (target < midElement) {
	                right = mid - 1;
	            }
	            //Searching right half
	            else {
	                left = mid + 1;
	            }
	        }

	        return false; 
	    }

	    public static void main(String[] args) {

	        int[][] matrix = {
	                {1, 2, 4, 6},
	                {10, 11, 5, 9},
	                {19, 16, 14, 25}
	        };

	        int target = 2;

	        System.out.println(searchMatrix(matrix, target));
	    }
	}

