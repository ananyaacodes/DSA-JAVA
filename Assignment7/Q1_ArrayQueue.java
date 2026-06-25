package Assignment7;

import java.util.Scanner;

public class Q1_ArrayQueue {

    static Scanner sc = new Scanner(System.in);

    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;

    // Insert Operation
    public static void insert(int Q[]) {

        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        System.out.print("Enter Element: ");
        int item = sc.nextInt();

        if (front == -1)
            front = 0;

        rear++;
        Q[rear] = item;

        System.out.println("Element Inserted Successfully.");
    }

    // Delete Operation
    public static void delete(int Q[]) {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted Element = " + Q[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

    // Display Queue
    public static void display(int Q[]) {

        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.println("\nQueue Elements:");

        for (int i = front; i <= rear; i++) {
            System.out.println(Q[i]);
        }
    }

    // Check Full
    public static boolean isFull() {
        return rear == MAX - 1;
    }

    // Check Empty
    public static boolean isEmpty() {
        return front == -1;
    }

    public static void main(String[] args) {

        int queue[] = new int[MAX];

        while (true) {

            System.out.println("\n***** MENU *****");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. isFull");
            System.out.println("5. isEmpty");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    insert(queue);
                    break;

                case 2:
                    delete(queue);
                    break;

                case 3:
                    display(queue);
                    break;

                case 4:
                    if (isFull())
                        System.out.println("Queue is Full.");
                    else
                        System.out.println("Queue is Not Full.");
                    break;

                case 5:
                    if (isEmpty())
                        System.out.println("Queue is Empty.");
                    else
                        System.out.println("Queue is Not Empty.");
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