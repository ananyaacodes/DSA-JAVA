import java.util.Scanner;

public class Q6_isOdd {

    public static boolean isOdd(int n){
        return ((n & 1 )== 1) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.err.println(num+ " is Odd: " +isOdd(num));

        sc.close();
    }
    
}
