package ExceptionHandling;

//7.	Write a program with multiple catch blocks to handle different
// types of exceptions in a single try block.
public class MultipleCatch {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int result = 10 / 0;

            // ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);

            // NullPointerException
            String str = null;
            System.out.println(str.length());

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null object access.");
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
