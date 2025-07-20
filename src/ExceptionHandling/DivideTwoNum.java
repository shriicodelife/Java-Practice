package ExceptionHandling;

//Write a program to divide two numbers.
// Handle ArithmeticException when the denominator is 0.

import java.util.Scanner;

public class DivideTwoNum {
    public static void main (String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        scanner.close();
    }
}