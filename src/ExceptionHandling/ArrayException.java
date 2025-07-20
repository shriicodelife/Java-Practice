package ExceptionHandling;
//4.	Access an array element using index input by the user.
// Handle ArrayIndexOutOfBoundsException.

public class ArrayException {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};  // Array of size 5

        try {
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You are trying to access an index that is out of bounds!");
        }

        System.out.println("Program continues after exception handling...");
    }
}