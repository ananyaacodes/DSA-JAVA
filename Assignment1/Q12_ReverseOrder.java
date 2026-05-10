import java.util.Scanner;

public class Q12_ReverseOrder{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a lines: ");

        String lines=sc.nextLine();

        for (int i=lines.length()-1; i>=0; i--){
            System.out.print(lines.charAt(i));
        }
        sc.close();
    
    }
}

