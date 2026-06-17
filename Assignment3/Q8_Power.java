package Assignment3;

import java.util.Scanner;

public class Q8_Power {

    // Recursive method to calculate x^n
    public static double power(double x, int n) {

        if (n == 0)
            return 1;

        return x * power(x, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(x + " raised to the power " + n + " = " + power(x, n));

        sc.close();
    }
}
    

