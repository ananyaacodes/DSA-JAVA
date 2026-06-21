package Assignment4;

import java.util.Scanner;

class Node {
    int regd_no;
    float mark;
    Node next;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        next = null;
    }
}

public class Q2_DeletionSLL {
    static Scanner sc = new Scanner(System.in);
    static Node start = null;

    // Create Linked List
    public static void create() {

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Node temp = null;

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter Registration Number: ");
            int regd = sc.nextInt();

            System.out.print("Enter Mark: ");
            float mark = sc.nextFloat();

            Node newNode = new Node(regd, mark);

            if (start == null) {
                start = newNode;
            } else {
                temp.next = newNode;
            }
            temp = newNode;
        }
    }

    // Display Linked List
    public static void display() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        Node temp = start;

        System.out.println("\nRegistration No\tMarks");

        while (temp != null) {
            System.out.println(temp.regd_no + "\t\t" + temp.mark);
            temp = temp.next;
        }
    }

    // Delete from Beginning
    public static void DelBeg() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        start = start.next;

        System.out.println("First node deleted.");
    }

    //Delete from End
    public static void DelEnd() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        if (start.next == null) {
            start = null;
            System.out.println("Last node deleted.");
            return;
        }

        Node temp = start;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        System.out.println("Last node deleted.");
    }

     // Delete from Any Position
    public static void DelAny() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            start = start.next;
            System.out.println("Node deleted.");
            return;
        }

        Node temp = start;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid Position.");
            return;
        }

        temp.next = temp.next.next;
        System.out.println("Node deleted.");
    }

    // Delete by Registration Number
    public static void DelRegd() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        if (start.regd_no == regd) {
            start = start.next;
            System.out.println("Node deleted.");
            return;
        }

        Node temp = start;

        while (temp.next != null && temp.next.regd_no != regd) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Registration Number not found.");
            return;
        }

        temp.next = temp.next.next;

        System.out.println("Node deleted.");
    }

     public static void main(String[] args) {

        int choice;

        while (true) {

            System.out.println("\n***** MENU *****");
            System.out.println("1. Create");
            System.out.println("2. Delete from Beginning");
            System.out.println("3. Delete from End");
            System.out.println("4. Delete from Any Position");
            System.out.println("5. Delete by Registration Number");
            System.out.println("6. Display");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    create();
                    break;

                case 2:
                    DelBeg();
                    break;

                case 3:
                    DelEnd();
                    break;

                case 4:
                    DelAny();
                    break;

                case 5:
                    DelRegd();
                    break;

                case 6:
                    display();
                    break;

                case 0:
                    System.out.println("Program Ended.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}
