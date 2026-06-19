package Assignment3;

import java.util.Scanner;

public class Q16_Palindrome {

    //Recursive Method
    public static boolean isPalindrome(String s){

        if (s.length() <= 1){
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        System.out.println("Enter a String: ");
        String str=sc.nextLine();

        if (isPalindrome(str)){
            System.out.println(str + " is a Palindrome.");
        }else{
            System.out.println(str+ " is not a Palindrome.");
        }
        sc.close();
    }
}
