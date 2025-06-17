package D01_CoreJavaBasicQues;

import java.util.Scanner;
// *
//  ***
// *****
//*******

public class question19 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter N: ");
            int N = sc.nextInt();

            for (int i = 1; i <= N; i++) {
                // Print spaces
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


