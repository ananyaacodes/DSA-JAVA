package Assignment2;

class Distance {
    int feet; 
    int inches;

    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    void displayDistance() {
        System.out.println("Distance: " + feet + "' " + inches + "\"");
    }
}

class Measurement extends Distance {
    double centimetres;

    Measurement(int feet, int inches, double centimetres) {
        super(feet, inches);
        this.centimetres = centimetres;
    }

    void displayMeasurement() {
        super.displayDistance();
        System.out.println("Distance in Centimetres: " + centimetres);
    }
}

public class Q14_Distance {
    public static void main(String[] args) {

        Measurement m = new Measurement(5, 8, 172.72);

        m.displayMeasurement();
    }
}