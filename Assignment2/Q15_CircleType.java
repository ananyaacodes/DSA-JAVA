package Assignment2;

class PointType {
    protected double x;
    protected double y;

    PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
}

class CircleType extends PointType {
    private double radius;

    CircleType(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void printRadius() {
        System.out.println("Radius: " + radius);
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    void displayCircle() {
        printPoint();
        printRadius();
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
}

public class Q15_CircleType {
    public static void main(String[] args) {

        CircleType c = new CircleType(3, 4, 7);

        c.displayCircle();

        System.out.println("X Coordinate: " + c.getX());
        System.out.println("Y Coordinate: " + c.getY());
    }
}