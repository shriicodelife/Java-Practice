package ExceptionHandling;
//7.	Write a program with multiple catch blocks to handle different types of exceptions in a single try block.
public class MixedExceptionHandling{
    public static void main(String[] args) {
        try {
            // Code that may throw multiple types of exceptions
            int[] numbers = {10, 20, 30};
            System.out.println("Number: " + numbers[5]); // ArrayIndexOutOfBoundsException

            int result = 10 / 0; // ArithmeticException

            String str = null;
            System.out.println(str.length()); // NullPointerException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
