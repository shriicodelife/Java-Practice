package D02_Polymorphism;
//2. Overloading Calculator
//Create a Calculator class with overloaded methods add(int, int), add(double, double), add(int, int, int).
//Show compile-time polymorphism by calling each.

// Calculator class with overloaded methods

class Calculator {

    // Add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers:");
        return a + b;
    }

    // Add two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles:");
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers:");
        return a + b + c;
    }
}

// Main class
public class CalculatorOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Call overloaded methods
        int sum1 = calc.add(5, 10);               // Calls add(int, int)
        double sum2 = calc.add(4.5, 3.2);         // Calls add(double, double)
        int sum3 = calc.add(1, 2, 3);             // Calls add(int, int, int)

        // Display results
        System.out.println("Result 1: " + sum1);
        System.out.println("Result 2: " + sum2);
        System.out.println("Result 3: " + sum3);
    }
}

