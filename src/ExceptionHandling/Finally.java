package ExceptionHandling;
//8.	Demonstrate the use of a finally block that executes even when an exception is thrown
public class Finally {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed: Cleaning up resources.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
