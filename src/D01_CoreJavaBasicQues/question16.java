package D01_CoreJavaBasicQues;
// Check if a Number is Palindrome using Recursion

import java.util.Scanner;

public class question16 {

    // Recursive function to reverse the number
        public static int reverse(int num, int rev) {
            if (num == 0) return rev;
            return reverse(num / 10, rev * 10 + (num % 10));
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // Step 1: Scanner for input

            System.out.print("Enter a number to check if it's a palindrome: ");
            int number = sc.nextInt(); // Step 2: Read number from user

            int reversed = reverse(number, 0); // Step 3: Reverse the number

            // Step 4: Check if number is same as reversed
            if (number == reversed) {
                System.out.println(number + " is a Palindrome Number.");
            } else {
                System.out.println(number + " is NOT a Palindrome Number.");
            }

            sc.close(); // Step 5: Close Scanner
        }
    }


