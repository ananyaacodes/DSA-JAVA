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

public class Q2_DeletionDLL {

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

    // Delete from Beginning
    public static void delBeg() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        if (start == end) {
            start = end = null;
        } else {
            start = start.next;
            start.prev = null;
        }

        System.out.println("First Node Deleted.");
    }

    // Delete from End
    public static void delEnd() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        if (start == end) {
            start = end = null;
        } else {
            end = end.prev;
            end.next = null;
        }

        System.out.println("Last Node Deleted.");
    }

    // Delete from Any Position
    public static void delAny() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            delBeg();
            return;
        }

        Node temp = start;

        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position.");
            return;
        }

        if (temp == end) {
            delEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        System.out.println("Node Deleted.");
    }

    // Display
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

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n***** MENU *****");
            System.out.println("1. Create");
            System.out.println("2. Delete from Beginning");
            System.out.println("3. Delete from End");
            System.out.println("4. Delete from Any Position");
            System.out.println("5. Display");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    create();
                    break;

                case 2:
                    delBeg();
                    break;

                case 3:
                    delEnd();
                    break;

                case 4:
                    delAny();
                    break;

                case 5:
                    display();
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