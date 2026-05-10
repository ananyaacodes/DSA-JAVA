import java.util.Scanner;;

public class Q11_ArithmeticFormula{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter values of a, b and c: ");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int c=sc.nextInt();
		
		if (a+b == c) {
			System.out.println(a+ " + " +b+ " = " +c);
		}
		else if (a-b == c) {
			System.out.println(a+ " - " +b+ " = " +c);
		}
		else if (a*b == c) {
			System.out.println(a+ " * " +b+ " = " +c);
		}
		else {
			System.out.println("Invalid Formula");
		}
        sc.close();
		
    }
    
}