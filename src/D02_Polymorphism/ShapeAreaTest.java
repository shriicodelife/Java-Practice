package D02_Polymorphism;

//1. Runtime Polymorphism: Shape Area
//Same setup as in inheritance: Shape → Circle, Rectangle.
//Use a Shape reference to call overridden area() methods from different object types.
// Base class
class Shape {
    public void area() {
        System.out.println("Calculating area of a shape...");
    }
}

// Subclass: Circle
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class to demonstrate runtime polymorphism
public class ShapeAreaTest {
    public static void main(String[] args) {
        // Base class reference pointing to Circle object
        Shape shape1 = new Circle(5.0);
        // Base class reference pointing to Rectangle object
        Shape shape2 = new Rectangle(4.0, 6.0);

        // Polymorphic method calls
        shape1.area(); // Calls Circle's area()
        shape2.area(); // Calls Rectangle's area()
    }
}
