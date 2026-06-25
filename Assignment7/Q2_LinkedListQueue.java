package Assignment7;

import java.util.Scanner;

class Node {

    int info;
    Node next;

    Node(int info) {
        this.info = info;
        next = null;
    }
}

public class Q2_LinkedListQueue {

    static Scanner sc = new Scanner(System.in);

    static Node front = null;
    static Node rear = null;

    // Insert Operation
    public static void insert() {

        System.out.print("Enter Element: ");
        int item = sc.nextInt();

        Node newNode = new Node(item);

        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Element Inserted Successfully.");
    }

    // Delete Operation
    public static void delete() {

        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted Element = " + front.info);

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Display Queue
    public static void display() {

        if (front == null) {
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.println("\nQueue Elements:");

        Node temp = front;

        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n***** MENU *****");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    insert();
                    break;

                case 2:
                    delete();
                    break;

                case 3:
                    display();
                    break;

                case 0:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}