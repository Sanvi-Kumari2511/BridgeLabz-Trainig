import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    //Creating a method for random matrix
    public static double[][] createRandomMatrix(int rows, int column) {
        double[][] matrix = new double[rows][column];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = random.nextInt(10); 
            }
        }
        return matrix;
    }

    //Displaying matrix
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + "  ");
            }
            System.out.println();
        }
    }

    //Creating a method for transpose of matrix
    public static double[][] methodTranspose(double[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;

        double[][] transpose = new double[column][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    //Creating a method for determinant of matrix 
    public static double methodDeterminant(double[][] matrix) {
        int n = matrix.length;

        if (n == 2) {   
            return  matrix[0][0] * matrix[1][1]
                  - matrix[0][1] * matrix[1][0];
        }

        if (n == 3) { 
            return matrix[0][0] * (matrix[1][1] * matrix[2][2]
                                 - matrix[2][1] * matrix[1][2])
                 - matrix[0][1] * (matrix[1][0] * matrix[2][2]
                                 - matrix[1][2] * matrix[2][0])
                 + matrix[0][2] * (matrix[1][0] * matrix[2][1]
                                 - matrix[1][1] * matrix[2][0]);
        }

        return 0;  
    }

    //Creating a method for inverse of matrix 
    public static double[][] methodInverse(double[][] matrix) {
        int n = matrix.length;
        double determinant = methodDeterminant(matrix);

        if (determinant == 0) {
            System.out.println("Matrix has no inverse.");
            return null;
        }

        double[][] inverse = new double[n][n];

        if (n == 2) {   
            inverse[0][0] =  matrix[1][1] / determinant;
            inverse[0][1] = -matrix[0][1] / determinant;
            inverse[1][0] = -matrix[1][0] / determinant;
            inverse[1][1] =  matrix[0][0] / determinant;
            return inverse;
        }

        if (n == 3) {  
            inverse[0][0] =  (matrix[1][1] * matrix[2][2]
                            - matrix[2][1] * matrix[1][2]) / determinant;
            inverse[0][1] = -(matrix[0][1] * matrix[2][2]
                            - matrix[0][2] * matrix[2][1]) / determinant;
            inverse[0][2] =  (matrix[0][1] * matrix[1][2]
                            - matrix[0][2] * matrix[1][1]) / determinant;

            inverse[1][0] = -(matrix[1][0] * matrix[2][2]
                            - matrix[1][2] * matrix[2][0]) / determinant;
            inverse[1][1] =  (matrix[0][0] * matrix[2][2]
                            - matrix[0][2] * matrix[2][0]) / determinant;
            inverse[1][2] = -(matrix[0][0] * matrix[1][2]
                            - matrix[1][0] * matrix[0][2]) / determinant;

            inverse[2][0] =  (matrix[1][0] * matrix[2][1]
                            - matrix[2][0] * matrix[1][1]) / determinant;
            inverse[2][1] = -(matrix[0][0] * matrix[2][1]
                            - matrix[2][0] * matrix[0][1]) / determinant;
            inverse[2][2] =  (matrix[0][0] * matrix[1][1]
                            - matrix[1][0] * matrix[0][1]) / determinant;

            return inverse;
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
		//Taking input from user
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int column = scanner.nextInt();

        double[][] matrix = createRandomMatrix(rows, column);

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose:");
        printMatrix(methodTranspose(matrix));

        if (rows == column) {   
            System.out.println("\nDeterminant: " + methodDeterminant(matrix));

            double[][] inverse = methodInverse(matrix);

            if (inverse != null) {
                System.out.println("\nInverse Matrix:");
                printMatrix(inverse);
            }
        } 
		else {
            System.out.println("\nDeterminant & Inverse not possible for non-square matrix");
        }
    }
}
