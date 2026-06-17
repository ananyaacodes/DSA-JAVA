package Assignment3;

import java.util.Scanner;

public class Q6_CountGeneric {

    // Generic Method
    public static <T> int count(T[] array, T item) {

        int c = 0;

        for (T element : array) {
            if (element.equals(item)) {
                c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Integer array: ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to count: ");
        Integer item = sc.nextInt();

        int result = count(arr, item);

        System.out.println("Occurrence of " + item + " = " + result);

        sc.close();
    }
}