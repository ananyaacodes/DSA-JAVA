package Assignment2;

abstract class Shape {
    abstract void area();
}

class Square extends Shape {
    int side;

    Square(int s){
        side=s;
    }
    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

class Triangle extends Shape {
    int b,h;

    Triangle(int b, int h){
        this.b=b;
        this.h=h;
    }
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}
class Circle extends Shape{
    double r;

    Circle(double r){
        this.r=r;
    }
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * r * r));
    }
}

public class Q5_Abstract {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape triangle = new Triangle(4, 6);
        Shape circle = new Circle(3);

        square.area();
        triangle.area();
        circle.area();
    }
}
