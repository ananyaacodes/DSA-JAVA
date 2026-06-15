package Assignment2;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    int DSA_Mark;

    void getdata(Scanner sc) {
            System.out.print("Enter Roll: ");
            roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name = sc.nextLine();

            System.out.print("Enter DSA Mark: ");
            DSA_Mark = sc.nextInt();
    }
    void showdata() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("DSA Mark: " + DSA_Mark);
    }
}
public class Q11_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Student[] s = new Student[5];

        int maxMark = 0;
        int maxIndex = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));

            s[i] = new Student();
            s[i].getdata(sc);

            if (s[i].DSA_Mark > maxMark) {
                maxMark = s[i].DSA_Mark;
                maxIndex = i;
            }
        }

        System.out.println("\nStudent with Highest DSA Mark:");
        s[maxIndex].showdata();
    }
}
