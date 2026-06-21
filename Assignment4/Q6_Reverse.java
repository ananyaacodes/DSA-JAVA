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

public class Q6_Reverse {

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

            if (start == null)
                start = newNode;
            else
                temp.next = newNode;

            temp = newNode;
        }

        System.out.println("Linked List Created Successfully.");
    }

    // Reverse Linked List
    public static void reverse() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        Node prev = null;
        Node current = start;
        Node next;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        start = prev;

        System.out.println("Linked List Reversed Successfully.");
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

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n***** MENU *****");
            System.out.println("1. Create");
            System.out.println("2. Reverse");
            System.out.println("3. Display");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    create();
                    break;

                case 2:
                    reverse();
                    break;

                case 3:
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