package Assignment2;

import Assignment2.studentpack.Test;
import Assignment2.sportspack.Sports;

public class Result extends Test implements Sports {

    public void calculateGrandTotal() {
        int total = mark1 + mark2 + score1 + score2;

        System.out.println("Sports Score 1: " + score1);
        System.out.println("Sports Score 2: " + score2);
        System.out.println("Grand Total: " + total);
    }

    public static void main(String[] args) {

        Result r = new Result();

        r.inputDetails();

        System.out.println("\n----- Student Details -----");
        r.showDetails();

        System.out.println("\n----- Result -----");
        r.calculateGrandTotal();
    }
}
