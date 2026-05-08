import java.util.Scanner;

public class Q2_BMI {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter weight: ");
		double wt=sc.nextDouble();
		
		System.out.println("Enter height: ");
		double ht=sc.nextDouble();
		
		double BMI=0;
		
		BMI= wt/(ht * ht);	
		
		if (BMI<=18.5) {
			System.out.println("Underweight");
		}else if (BMI>18.5 && BMI<24.9) {
			System.out.println("NORMAL WEIGHT");
		}else if (BMI>=25.0 && BMI<=29.9) {
			System.out.println("OVERWEIGHT");
		}else {
			System.out.println("OBESE");
		}
        sc.close();
	}

}
