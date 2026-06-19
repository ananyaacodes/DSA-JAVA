package Assignment4;

import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }
}

public class Q1_InsertionLinkedList {
    
    static Node start = null;
    static Scanner sc= new Scanner(System.in);

    //Insert at Beginning
    public static void InsBeg(){

        System.out.println("Enter Registration Number: ");
        int regd = sc.nextInt();

        System.out.println("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd, mark);

        newNode.next = start;
        start = newNode;

        System.out.println("Node inserted at beginning.");
    }

    //Insert at End
    public static void InsEnd(){

        System.out.println("Enter Registration Number: ");
        int regd = sc.nextInt();

        System.out.println("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd, mark);

        if (start == null) {
            start = newNode;
        } else {

            Node temp = start;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Node inserted at end.");
    }

    //Insert at Any Position
    public static void InsAny(){

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        System.out.println("Enter Registration Number: ");
        int regd = sc.nextInt();

        System.out.println("Enter Mark: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd, mark);

        if (pos == 1) {
            newNode.next = start;
            start = newNode;
            System.out.println("Node inserted.");
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
        temp.next = newNode;

        System.out.println("Node inserted at position " + pos + ".");
    }

    // Display List
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
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Any Position");
            System.out.println("4. Display");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    InsBeg();
                    break;

                case 2:
                    InsEnd();
                    break;

                case 3:
                    InsAny();
                    break;

                case 4:
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

    