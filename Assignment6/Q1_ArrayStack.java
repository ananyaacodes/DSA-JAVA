package Assignment6;

import java.util.Scanner;

public class Q1_ArrayStack {

    static Scanner sc= new Scanner(System.in);

    public static final int MAX=10;

    //Push Operation
    public static int push(int S[], int top){

        if (isFull(top)){
            System.out.println("Stack Overflow");
            return top;
        }
        System.out.println("Enter Element: ");
        int item=sc.nextInt();

        top++;
        S[top] = item;

        System.out.println("Element Pushed Successfully.");

        return top;
    }

    //Pop Operation
    public static int pop(int S[], int top){

        if (isEmpty(top)){
            System.out.println("Stack Underflow");
            return top;
        }

        System.out.println("Deleted Element: " +S[top]);
        top--;

        return top;
    }

    //Display Stack
    public static void display(int S[], int top){

        if (isEmpty(top)){
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements: ");

        for (int i=top; i>=0; i--){
            System.out.println(S[i]);
        }
    }

    //Check Empty
    public static boolean isEmpty(int top){
        return top == -1;
    }

    //Check Full
    public static boolean isFull(int top){
        return top == MAX-1;
    }

    public static void main(String[] args) {

        int[] stack = new int[MAX];
        int top = -1;

        while (true) {
            System.out.println("\n***** MENU *****");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    top = push(stack, top);
                    break;

                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                
                case 4:
                    if (isEmpty(top))
                        System.out.println("Stack is Empty.");
                    else
                        System.out.println("Stack is Not Empty.");
                    break;

                case 5:
                    if (isFull(top))
                        System.out.println("Stack is Full.");
                    else
                        System.out.println("Stack is Not Full.");
                    break;

                case 0:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
