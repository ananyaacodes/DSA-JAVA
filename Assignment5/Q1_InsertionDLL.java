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

public class Q1_InsertionDLL {

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

    // Insert at Beginning
    public static void insBeg() {

        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd, mark);

        if (start == null) {
            start = end = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }

        System.out.println("Node Inserted at Beginning.");
    }

    // Insert at End
    public static void insEnd() {

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

        System.out.println("Node Inserted at End.");
    }

    // Insert at Any Position
    public static void insAny() {

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        System.out.print("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd, mark);

        if (pos == 1) {

            if (start == null) {
                start = end = newNode;
            } else {
                newNode.next = start;
                start.prev = newNode;
                start = newNode;
            }

            System.out.println("Node Inserted.");
            return;
        }

        Node temp = start;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position.");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            end = newNode;
        }

        temp.next = newNode;

        System.out.println("Node Inserted.");
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
            System.out.println("2. Insert at Beginning");
            System.out.println("3. Insert at End");
            System.out.println("4. Insert at Any Position");
            System.out.println("5. Display");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    create();
                    break;

                case 2:
                    insBeg();
                    break;

                case 3:
                    insEnd();
                    break;

                case 4:
                    insAny();
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