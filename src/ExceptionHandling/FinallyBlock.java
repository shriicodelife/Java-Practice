package ExceptionHandling;
//8.Demonstrate the use of a finally block that executes even when an exception is thrown.

public class FinallyBlock {
        public static void main(String[] args) {
            try {
                // This will throw an ArithmeticException
                int result = 10 / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero.");
            } finally {
                System.out.println("This is the finally block. It always executes.");
            }

            System.out.println("Program continues after try-catch-finally.");
        }


}