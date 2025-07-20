package ExceptionHandling;
//2.	Read an integer from the user.
// Use try-catch to handle InputMismatchException if the input is not a valid number.
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInteger {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();  // May throw InputMismatchException
                System.out.println("You entered: " + number);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            } finally {
                scanner.close();
            }
        }
    }

