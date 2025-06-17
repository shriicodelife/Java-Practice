package D02_Inheritance;

//4. Shape Area Calculator
//Base class Shape, derived classes Circle, Rectangle, Triangle.
//Each subclass has its own method to calculate area.
//Use method calls to compute areas from main class using inherited structure


//Base class
abstract class Shape {
    String shapeName;


    // Constructor
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
}
