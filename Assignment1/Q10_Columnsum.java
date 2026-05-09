import java.util.Scanner;

public class Q10_Columnsum {

    public static double sumColumn(double[][]m, int columnIndex){

        double sum = 0;

        for (int i=0; i<m.length; i++){
            sum+=m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double[][] matrix = new double[3][4];

        // Input matrix elements
        System.out.println("Enter a 3-by-4 matrix row by row:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        // Display sum of each column
        for (int j = 0; j < 4; j++) {
            System.out.println("Sum of column " + j + " is: " + sumColumn(matrix, j));
        }
        sc.close();
    }
    
}
