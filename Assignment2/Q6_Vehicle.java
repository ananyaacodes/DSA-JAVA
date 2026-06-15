package Assignment2;

class Vehicle {
    String model;
    int year;

    Vehicle(String model, int year){
        this.model=model;
        this.year=year;
    }
}
class Car extends Vehicle{
    int carID;
    double price;

    Car(String model, int year, int carID, double price) {
        super(model, year);       //Call vehicle constructor
        this.carID = carID;
        this.price = price;
    }
    void carDisplay(){
        System.out.println("Vehicle Details: ");
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

        System.out.println("\nCar Details: ");
        System.out.println("Car ID: " + carID);
        System.out.println("Price: $" + price);
    }
}
public class Q6_Vehicle{
    public static void main(String[] args) {
        Car c1 = new Car("Toyota Camry", 2020, 101, 24000.00);
        c1.carDisplay();
    }
}