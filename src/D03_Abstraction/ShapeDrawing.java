package D03_Abstraction;
//4. Shape Drawing
//Interface Drawable with method draw().
//Implement it in Circle, Square, Line.
//Write a method that accepts a Drawable and calls draw().

// Interface
interface Drawable {
    void draw();
}

// Circle class
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Square class
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

// Line class
class Line implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Line");
    }
}

public class ShapeDrawing {

    public static void renderShape(Drawable shape) {
        shape.draw();  // Polymorphic behavior
    }

    public static void main(String[] args) {
        // Creating objects
        Drawable circle = new Circle();
        Drawable square = new Square();
        Drawable line = new Line();

        // Passing each to renderShape
        renderShape(circle);
        renderShape(square);
        renderShape(line);
    }
}
