package Assignment2;

import java.util.Scanner;

class Bank {
    String bankName;
    double depositAmount;
    static double totalAmount = 0;

    void setBankName(String bankName) {
        this.bankName = bankName;
    }

    void setAmount(double depositAmount) {
        if (depositAmount >= 1000) {
            this.depositAmount = depositAmount;
            totalAmount += depositAmount;
        } else {
            System.out.println("Minimum deposit amount is 1000.");
            this.depositAmount = 1000;
            totalAmount += 1000;
        }
    }

    void showData() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Deposit Amount: " + depositAmount);
    }
}

public class Q13_Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank[] b = new Bank[5];

        double minAmount = Double.MAX_VALUE;
        String minBank = "";

        for (int i = 0; i < 5; i++) {

            b[i] = new Bank();

            System.out.println("\nEnter Details of Bank " + (i + 1));

            System.out.print("Enter Bank Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Deposit Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            b[i].setBankName(name);
            b[i].setAmount(amount);

            if (b[i].depositAmount < minAmount) {
                minAmount = b[i].depositAmount;
                minBank = b[i].bankName;
            }
        }

        System.out.println("\n----- Bank Details -----");

        for (int i = 0; i < 5; i++) {
            b[i].showData();
            System.out.println();
        }

        System.out.println("Total Amount Deposited: " + Bank.totalAmount);
        System.out.println("Bank with Minimum Deposit Amount: " + minBank);

        sc.close();
    }
}
