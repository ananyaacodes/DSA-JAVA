package Assignment2.studentpack;

import java.util.Scanner;

public class Test extends Student {
    protected int mark1;
    protected int mark2;

    @Override
    public void inputDetails() {
        super.inputDetails();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();

        sc.close();
    }

    @Override
    public void showDetails() {
        super.showDetails();

        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
    
}
