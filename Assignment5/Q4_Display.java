package Assignment5;

import java.util.Scanner;

class Node {
    int regd_no;
    float mark;
    Node next;
    Node prev;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        next = null;
        prev = null;
    }
}

public class Q4_Display {

    static Scanner sc = new Scanner(System.in);
    static Node start = null;
    static Node end = null;

    // Create Doubly Linked List
    public static void create() {

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter Registration Number: ");
            int regd = sc.nextInt();

            System.out.print("Enter Mark: ");
            float mark = sc.nextFloat();

            Node newNode = new Node(regd, mark);

            if (start == null) {
                start = end = newNode;
            } else {
                end.next = newNode;
                newNode.prev = end;
                end = newNode;
            }
        }

        System.out.println("Doubly Linked List Created Successfully.");
    }

    // Display Forward
    public static void displayForward() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        Node temp = start;

        System.out.println("\nForward Traversal");
        System.out.println("Registration No\tMarks");

        while (temp != null) {
            System.out.println(temp.regd_no + "\t\t" + temp.mark);
            temp = temp.next;
        }
    }

    // Display Backward
    public static void displayBackward() {

        if (end == null) {
            System.out.println("List is Empty.");
            return;
        }

        Node temp = end;

        System.out.println("\nBackward Traversal");
        System.out.println("Registration No\tMarks");

        while (temp != null) {
            System.out.println(temp.regd_no + "\t\t" + temp.mark);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n***** MENU *****");
            System.out.println("1. Create");
            System.out.println("2. Display Forward");
            System.out.println("3. Display Backward");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    create();
                    break;

                case 2:
                    displayForward();
                    break;

                case 3:
                    displayBackward();
                    break;

                case 0:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Wrong Choice.");
            }
        }
    }
}