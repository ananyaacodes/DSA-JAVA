package Assignment3;

import java.util.Scanner;

public class Q15_ReverseString {

    public static String reverse(String s){
        if (s.isEmpty()){
            return " ";
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Reversed String: " +reverse(str));

        sc.close();
    }
    
}
