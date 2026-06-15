package Assignment2;
import java.util.Scanner;

class Deposit{
	long Principal;
	int time;
	double rate;
	double total_amt;
	
	 Deposit() {
		Principal = 0;
        time = 0;
        rate = 0;
	}
	Deposit(long p, int t, double r) {
		Principal=p;
		time=t;
		rate=r;
	}
	Deposit(long p, int t) {
		Principal=p;
		time=t;
		rate=5.0;
	}
	Deposit(long p, double r){
		Principal=p;
		rate=r;
		time=1;
	}
	void calc_amt() {
        total_amt = Principal + (Principal * rate * time) / 100;
    }

    void display() {
        System.out.println("Principal: " + Principal);
        System.out.println("Time: " + time);
        System.out.println("Rate: " + rate);
        System.out.println("Total Amount: " + total_amt);
    }
}

public class Q4_Deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal, Time and Rate:");
        long principal = sc.nextLong();
        int time = sc.nextInt();
        double rate = sc.nextDouble();

        Deposit deposit = new Deposit(principal, time, rate);
        deposit.calc_amt();
        deposit.display();

		sc.close();
    }
}
