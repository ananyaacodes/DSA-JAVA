import java.util.Scanner;

public class Q5_SumOfDigits {

    public static int sumOfDigits(int n){
        while (n > 10) {
            int sum = 0;

            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
            
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = sumOfDigits(num);
        System.out.println("Sum of digits: " + num + " until the number is a single digit is " + result);
    }
}
