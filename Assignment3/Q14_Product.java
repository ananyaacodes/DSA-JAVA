package Assignment3;

import java.util.Scanner;

public class Q14_Product {

    public static int product (int a, int b){
        if ( b == 0 ){
            return 0;
        }
        return a + product (a, b-1);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        int result = product(a, b);

        System.out.println("Product: " + result);

        sc.close();
    }
}
