package assign1;
import java.util.*;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer: ");
		int num=sc.nextInt();
		int count=0;
		
		while (num>=2){
			num=num/2;
			count++;
		}
		System.out.println(count);
	}

}
