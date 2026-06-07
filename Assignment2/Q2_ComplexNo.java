package Assignment2;
import java.util.Scanner;

class Complex{
	int real;
	int imag;
	
	void setData(int r, int i) {
		real=r;
		imag=i;
	}
	void display() {
		System.out.println(real+  " + " +imag+ "i ");
		
	}
	Complex add(Complex c1, Complex c2) {
		Complex temp=new Complex();
		temp.real=c1.real + c2.real;
		temp.imag=c1.imag+c2.imag;
		return temp;
	}
}
public class Q2_ComplexNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        System.out.println("Enter real and imaginary parts of first complex number:");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        c1.setData(r1, i1);

        System.out.println("Enter real and imaginary parts of second complex number:");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        c2.setData(r2, i2);

        c3 = c3.add(c1, c2);
        System.out.print("Sum of complex numbers: ");
        c3.display();
    }
}
