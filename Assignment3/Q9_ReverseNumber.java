package Assignment3;

import java.util.Scanner;

public class Q9_ReverseNumber {

    // Recursive method to print digits in reverse
    public static void reverse(int n) {

        if (n == 0)
            return;

        System.out.print(n % 10);
        reverse(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Reversed Number: ");
        reverse(num);

        sc.close();
    }
}