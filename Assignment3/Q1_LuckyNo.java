package Assignment3;

import java.util.Scanner;

public class Q1_LuckyNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            System.out.print("Enter your lucky number: ");
            int luckyno=sc.nextInt();

            if (luckyno<0){
                throw new NumberFormatException("Negative numbers are not allowed as lucky numbers!");
            }
            System.out.println("Awesome! Your lucky number is: " + luckyno);
        }
        catch(NumberFormatException e) {
            // Handle the negative number or invalid number format
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle other unexpected inputs (like entering a string instead of an integer)
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
    
}
