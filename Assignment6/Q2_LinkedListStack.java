package Assignment6;

import  java.util.Scanner;

class Node{
    int info;
    Node next;

    Node(int info){
        this.info=info;
        next=null;
    }
}
public class Q2_LinkedListStack {

    static Scanner sc = new Scanner (System.in);

    //Push operation
    public static Node push(Node top) {
        System.out.print("Enter Element: ");
        int item = sc.nextInt();

        Node newNode = new Node(item);

        newNode.next = top;
        top = newNode;

        System.out.println("Element Pushed Successfully.");

        return top;
    }

    //Pop Operation
    public static Node pop(Node top){

        if (top == null){
            System.out.println("Stack Underflow");
            return top;
        }

        System.out.println("Deleted Element = " +top.info);

        top = top.next;

        return top;
    }

    //Display Stack
    public static void display(Node top){

        if (top == null){
            System.out.println("Stack is Empty.");
            return;
        }

        System.out.println("\nStack Elements: ");

        Node temp = top;

        while (temp != null){
            System.out.println(temp.info);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        
        Node top = null;

        while (true){

            System.out.println("\n***** MENU *****");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    top = push(top);
                    break;

                case 2:
                    top = pop(top);
                    break;
                    
                case 3:
                    display(top);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
