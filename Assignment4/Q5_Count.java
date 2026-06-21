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

public class Q5_Count {

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

    // Count Nodes
    public static void count() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        int count = 0;
        Node temp = start;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Number of Nodes = " + count);
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
            System.out.println("2. Count Nodes");
            System.out.println("3. Display");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    create();
                    break;

                case 2:
                    count();
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