import java.util.Scanner;

public class Q13_DotProduct{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of a,b and c: ");
        int n=sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        
        System.out.println("Enter the elements of a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of b: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            c[i]= a[i] * b[i];
        }

        System.out.println("Dot product array: ");

        for(int i=0; i<n; i++){
            System.out.print(c[i]+ " ");
        }
        sc.close();
    }
}