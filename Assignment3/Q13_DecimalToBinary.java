package Assignment3;

import java.util.Scanner;

public class Q13_DecimalToBinary {

    public static void binary(int n){
        if (n==0){
            return;
        }
        else{
            binary (n/2);

            System.out.print(n%2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a positive decimal number: ");
        int num=sc.nextInt();

        System.out.println("Binary Equivalent: ");

        if (num==0){
            System.out.println(0);
        }else{
            binary(num);
        }
        sc.close();
    }  
}
