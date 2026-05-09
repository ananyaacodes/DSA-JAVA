import java.util.Scanner;

public class Q8_SumMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number of rows and columns of 2D-Array: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] matrix = new int [rows][cols];

        System.out.println("Enter elements of the 2D Array: ");
        for (int i=0; i<rows;i++)  {
            for(int j=0; j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }  
        int sum = 0;

        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                sum+= matrix[i][j];
            }
        }

        System.out.println("Sum of the elements of the 2D Array is: " + sum);
    }

}
