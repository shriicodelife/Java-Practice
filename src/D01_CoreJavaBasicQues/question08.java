package D01_CoreJavaBasicQues;//10. Write a Program to Print Pyramid Number Pattern in Java.
import java.util.Scanner;

public class question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in row
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Newline after each row
            System.out.println();
        }

        sc.close();
    }
}
