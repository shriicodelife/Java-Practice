package ExceptionHandling;

import java.util.Scanner;

//5.Access a character of a string using index.
// Handle StringIndexOutOfBoundsException.
public class StringCharAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input index
        System.out.print("Enter the index you want to access: ");
        int index = scanner.nextInt();

        try {
            // Try to access character at given index
            char ch = input.charAt(index);
            System.out.println("Character at index " + index + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds. Valid range is 0 to " + (input.length() - 1));
        }

        scanner.close();
    }
}
