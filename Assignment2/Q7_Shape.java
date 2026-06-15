package Assignment2;

class Shape{
    String color;

    Shape(String color){
        this.color=color;
    }
}
class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Circle Details:");
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    void display() {
        System.out.println("\nRectangle Details:");
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
    }
}


public class Q7_Shape {
    public static void main(String[] args) {
        
        Circle c = new Circle("Red", 5.0);
        Rectangle r = new Rectangle("Blue", 4.0, 6.0);

        c.display();
        r.display();
    }
}
