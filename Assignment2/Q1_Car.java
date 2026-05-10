package Assignment2;

import java.util.Scanner;

public class Q1_Car{

    String model;
    int year;

    void setDetails(String m, int y){
        model = m;
        year = y;
    }
    void displayDetails(){
        System.out.println("Model: " +model);
        System.out.println("Year:" +year);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Q1_Car car1 = new Q1_Car();
        Q1_Car car2 = new Q1_Car();

        car1.model = "Toyota Camry";
        car1.year = 2020;

        System.out.println("Enter model of 2nd Car: ");
        String model2 = sc.nextLine();

        System.out.println("Enter year of 2nd Car: ");
        int year2 = sc.nextInt();

        car2.setDetails(model2, year2);

        System.out.println("Details of 1st Car:");
        car1.displayDetails();

        System.out.println("Details of 2nd Car:");
        car2.displayDetails();

        if (car1.year > car2.year){
            System.out.println("Car1 is newer");
        }
        else if (car1.year < car2.year){
            System.out.println("Car2 is newer");
        }else{
            System.out.println("Both cars are of same year");
        }
        sc.close();
    }
}