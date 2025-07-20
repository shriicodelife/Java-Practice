package ExceptionHandling;
import java.io.*;
//11.	Write a program that catches both checked and unchecked exceptions in the same code.

public class CheckedUncheckedExample {

    public static void main(String[] args) {
        try {
            // ✅ Unchecked Exception: Division by zero
            int a = 10, b = 0;
            int result = a / b;  // ArithmeticException

            // ✅ Checked Exception: Trying to read a file that doesn't exist
            FileReader file = new FileReader("non_existing_file.txt"); // FileNotFoundException
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();
        }
        catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception (ArithmeticException): " + e.getMessage());
        }
        catch (FileNotFoundException e) {
            System.out.println("Caught Checked Exception (FileNotFoundException): " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Caught IOException while reading file: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling both types of exceptions.");
    }
}
