package Assignment3;

import java.util.Scanner;

class MarksOutOfBoundException extends Exception {

    MarksOutOfBoundException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int mark;

    void getData() throws MarksOutOfBoundException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        mark = sc.nextInt();

        if (mark > 100) {
            throw new MarksOutOfBoundException("ERROR: Marks cannot be greater than 100.");
        }

        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + mark);
    }
}

public class Q3_MarksException {
    public static void main(String[] args) {

        Student s = new Student();

        try {
            s.getData();

        } catch (MarksOutOfBoundException e) {
            System.out.println(e.getMessage());
        }
    }
}