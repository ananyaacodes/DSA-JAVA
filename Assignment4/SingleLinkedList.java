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

public class SingleLinkedList {

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
    // Insert at Beginning
    public static void InsBeg() {

    System.out.print("Enter Registration Number: ");
    int regd = sc.nextInt();

    System.out.print("Enter Mark: ");
    float mark = sc.nextFloat();

    Node newNode = new Node(regd, mark);

    newNode.next = start;
    start = newNode;

    System.out.println("Node Inserted at Beginning.");
    }

    // Insert at End
    public static void InsEnd() {
        System.out.print("Enter Registration Number: ");
        int regd = sc.nextInt();
        System.out.print("Enter Mark: ");
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
        System.out.println("Node Inserted at End.");
    }


    // Insert at Any Position
    public static void InsAny() {
         System.out.print("Enter Position: ");
         int pos = sc.nextInt();

         System.out.print("Enter Registration Number: ");
         int regd = sc.nextInt();

         System.out.print("Enter Mark: ");
         float mark = sc.nextFloat();

         Node newNode = new Node(regd, mark);

         if (pos == 1) {
             newNode.next = start;
             start = newNode;
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
        temp.next = newNode;
        System.out.println("Node Inserted.");
    }


    // Delete from Beginning
    public static void DelBeg() {
        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }
        start = start.next;
        System.out.println("First Node Deleted.");
    }

    // Delete from End
    public static void DelEnd() {
        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }
        if (start.next == null) {
            start = null;
            System.out.println("Last Node Deleted.");
            return;
        }
         Node temp = start;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        
        System.out.println("Last Node Deleted.");
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
            System.out.println("Node Deleted.");
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
         System.out.println("Node Deleted.");
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
            System.out.println("Node Deleted.");
            return;
        }
        Node temp = start;
        
        while (temp.next != null && temp.next.regd_no != regd) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Registration Number Not Found.");
            return;
        }
        temp.next = temp.next.next;
        
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

    // Sort in Descending Order of Marks
    public static void sort() {
        if (start == null) {
            System.out.println("List is Empty.");
            return;
        }

        Node current = start;
        Node index = null;
        float tempMark;
        int tempRegd;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.mark < index.mark) {

                    // Swap marks
                    tempMark = current.mark;
                    current.mark = index.mark;
                    index.mark = tempMark;

                    // Swap registration numbers
                    tempRegd = current.regd_no;
                    current.regd_no = index.regd_no;
                    index.regd_no = tempRegd;
                }
                index = index.next;
            }
            current = current.next;
        }

        System.out.println("List Sorted Successfully.");
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

   
    public static void main(String[] args) {

    int choice;

    while (true) {

        System.out.println("\n********** MENU **********");
        System.out.println("1. Create");
        System.out.println("2. Display");
        System.out.println("3. Insert at Beginning");
        System.out.println("4. Insert at End");
        System.out.println("5. Insert at Any Position");
        System.out.println("6. Delete from Beginning");
        System.out.println("7. Delete from End");
        System.out.println("8. Delete from Any Position");
        System.out.println("9. Delete by Registration Number");
        System.out.println("10. Search & Update");
        System.out.println("11. Sort");
        System.out.println("12. Count Nodes");
        System.out.println("13. Reverse");
        System.out.println("0. Exit");

        System.out.print("Enter Your Choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                create();
                break;

            case 2:
                display();
                break;

            case 3:
                InsBeg();
                break;

            case 4:
                InsEnd();
                break;

            case 5:
                InsAny();
                break;

            case 6:
                DelBeg();
                break;

            case 7:
                DelEnd();
                break;

            case 8:
                DelAny();
                break;

            case 9:
                DelRegd();
                break;

            case 10:
                search();
                break;

            case 11:
                sort();
                break;

            case 12:
                count();
                break;

            case 13:
                reverse();
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
