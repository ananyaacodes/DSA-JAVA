package Assignment3;

import java.util.Scanner;

public class Q17_RearrangeArray {

    //Recursive method
    public static void rearrange(int[] arr, int left, int right, int k){

        if (left >= right){
            return;
        }
        if (arr[left] <= k){
            rearrange(arr, left + 1, right, k);
        }
        else if (arr[right] > k){
            rearrange(arr, left, right - 1, k);
        }
        else{
            //swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

        rearrange(arr, left + 1, right - 1, k);
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        rearrange(arr, 0, n-1, k);

        System.out.println("Rearranged array: ");

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    } 
}
