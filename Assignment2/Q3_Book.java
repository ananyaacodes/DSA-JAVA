package Assignment2;
import java.util.*;

class Book{
	int bookID;
	double price;
	int quantity;
	static double totalAmount=0;
	
	Book(int ID, double p, int q){
		this.bookID=ID;
		this.price=p;
		this.quantity=q;
	}
	double totalCost() {
		return price * quantity;
	}
	void displayDetails() {
		System.out.println("Book ID: "+bookID);
		System.out.println("Price: "+price);
		System.out.println("Quantity: " +quantity);
		System.out.println("Total Cost: " +totalCost());
	}
	void updateTotal() {
		totalAmount += totalCost();
	}
}
public class Q3_Book {
	public static void main(String[] args) {
        
       // Creating 5 book objects
        Book b1 = new Book(101, 100, 2);
        Book b2 = new Book(102, 200, 1);
        Book b3 = new Book(103, 150, 3);
        Book b4 = new Book(104, 80, 5);
        Book b5 = new Book(105, 120, 2);

        // Array of Book objects
        Book[] books = {b1, b2, b3, b4, b5};

        System.out.println("BOOK DETAILS:\n");

        // Display each book + update total amount
        for (int i = 0; i < books.length; i++) {
            books[i].displayDetails();
            books[i].updateTotal();
        }

        // Final total amount spent
        System.out.println("TOTAL AMOUNT SPENT = " + Book.totalAmount);
    }
}
