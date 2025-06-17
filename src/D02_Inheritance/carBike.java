package D02_Inheritance;

//1. Vehicle Inheritance
//Create a Vehicle class with fields like speed and color.
//Extend it with Car and Bike classes having their specific properties like number of doors or kickstart.
//Write a program to print details using a base class method.


// Base class
class Vehicle {
    int speed;
    String color;

    // Constructor
    public Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    // Method to print common vehicle details
    public void printDetails() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
    }
}

// Derived class: Car
class Car extends Vehicle {
    int numberOfDoors;

    public Car(int speed, String color, int numberOfDoors) {
        super(speed, color); // Call parent constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Method to print car details
    public void printCarDetails() {
        printDetails(); // Call base method
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Derived class: Bike
class Bike extends Vehicle {
    boolean hasKickStart;

    public Bike(int speed, String color, boolean hasKickStart) {
        super(speed, color); // Call parent constructor
        this.hasKickStart = hasKickStart;
    }

    // Method to print bike details
    public void printBikeDetails() {
        printDetails(); // Call base method
        System.out.println("Kick Start: " + (hasKickStart ? "Yes" : "No"));
    }
}

// Main class to test the inheritance
public class carBike {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car(120, "Red", 4);
        System.out.println("Car Details:");
        car.printCarDetails();

        System.out.println();

        // Create a Bike object
        Bike bike = new Bike(80, "Black", true);
        System.out.println("Bike Details:");
        bike.printBikeDetails();
    }
}
