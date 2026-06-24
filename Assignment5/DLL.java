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

public class DLL {

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

        System.out.println("\nRegistration No\tMarks");

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

        System.out.println("\nRegistration No\tMarks");

        while (temp != null) {
            System.out.println(temp.regd_no + "\t\t" + temp.mark);
            temp = temp.prev;
        }
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

    // Search by Registration Number and Update Marks
    public static void search() {

        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();

        Node temp = start;

        while (temp != null) {

            if (temp.regd_no == regd) {

                System.out.println("Student Found.");
                System.out.println("Current Mark: " + temp.mark);

                System.out.print("Enter New Mark: ");
                temp.mark = sc.nextFloat();

                System.out.println("Mark Updated Successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Registration Number Not Found.");
    }

        public static void main(String[] args) {

        int choice;

        while (true) {

            System.out.println("\n********** MENU **********");
            System.out.println("1. Create");
            System.out.println("2. Display Forward");
            System.out.println("3. Display Backward");
            System.out.println("4. Insert at Beginning");
            System.out.println("5. Insert at End");
            System.out.println("6. Insert at Any Position");
            System.out.println("7. Delete from Beginning");
            System.out.println("8. Delete from End");
            System.out.println("9. Delete from Any Position");
            System.out.println("10. Search & Update Marks");
            System.out.println("0. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

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

                case 4:
                    insBeg();
                    break;

                case 5:
                    insEnd();
                    break;

                case 6:
                    insAny();
                    break;

                case 7:
                    delBeg();
                    break;

                case 8:
                    delEnd();
                    break;

                case 9:
                    delAny();
                    break;

                case 10:
                    search();
                    break;

                case 0:
                    System.out.println("Program Ended.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}