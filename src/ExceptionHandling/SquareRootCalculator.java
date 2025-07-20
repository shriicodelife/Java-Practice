package ExceptionHandling;
//9.	Create a method to calculate the square root of a number.
// Throw IllegalArgumentException if the number is negative.

public class SquareRootCalculator {

    // Method to calculate square root
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative number not allowed: " + number);
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        try {
            double result = calculateSquareRoot(-25);  // Try changing this to positive number
            System.out.println("Square root: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
