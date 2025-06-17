package D01_CoreJavaBasicQues;
// prime or not
import java.util.Scanner;

public class question17 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input from user
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            boolean isPrime = true;

            // Prime check logic
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Output
            if (isPrime)
                System.out.println(num + " is a Prime Number.");
            else
                System.out.println(num + " is NOT a Prime Number.");

            sc.close();
        }
    }


