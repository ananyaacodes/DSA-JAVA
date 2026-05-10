import java.util.Scanner;

public class Q14_SumMatrix {

    public static double[][] addMatrix(double[][] a, double[][] b) {

	        int rows = a.length;
	        int cols = a[0].length;

	        double[][] sum = new double[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sum[i][j] = a[i][j] + b[i][j];
	            }
	        }

	        return sum;
	    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	        double[][] a = new double[3][3];
	        double[][] b = new double[3][3];

	        // Input first matrix
	        System.out.println("Enter elements of first matrix:");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                a[i][j] = sc.nextDouble();
	            }
	        }

	        // Input second matrix
	        System.out.println("Enter elements of second matrix:");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                b[i][j] = sc.nextDouble();
	            }
	        }

	        // Add matrices
	        double[][] result = addMatrix(a, b);

	        // Display result
	        System.out.println("Sum of matrices:");

	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[0].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}
