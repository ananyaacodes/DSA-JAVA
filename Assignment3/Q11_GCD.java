package Assignment3;

import java.util.Scanner;

public class Q11_GCD {
    public static int Q11_GCD(int m, int n){
        if (n==0){
            return m;
        }
        else{
            return Q11_GCD(n, m % n);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " = " + Q11_GCD(a, b));

        sc.close();
    }
}
