package ExceptionHandling;
//3.	Parse a string to integer using Integer.parseInt(). Handle NumberFormatException.

import java.util.Scanner;

public class ParseInteger {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number (as string): ");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);  // May throw NumberFormatException
                System.out.println("Parsed integer: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! '" + input + "' is not a valid integer.");
            } finally {
                scanner.close();
            }
        }

}
