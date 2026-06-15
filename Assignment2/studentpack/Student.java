package Assignment2.studentpack;

import java.util.Scanner;

public class Student {
    protected String name;
    protected int roll;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll: ");
        roll = sc.nextInt();
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

