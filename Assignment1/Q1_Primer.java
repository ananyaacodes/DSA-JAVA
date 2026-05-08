import java.util.Scanner;

public class Q1_Primer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer greater than 2: ");
        int num = sc.nextInt();

        int count = 0;

        // Repeatedly divide by 2
        while (num >= 2) {
            num = num / 2;
            count++;
        }

        // Display result
        System.out.println("Number of times divided by 2: " + count);

        sc.close();
    }
}