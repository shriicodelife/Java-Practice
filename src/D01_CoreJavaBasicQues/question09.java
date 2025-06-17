package D01_CoreJavaBasicQues;

import java.util.Scanner;

//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *

/*public class question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the square: ");
        int n = sc.nextInt();
//nested loop
        for (int i = 0; i < n; i++) {  // Use i = 0 to i < n
            for (int j = 0; j < n; j++) {
                // Check if it's a border
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  "); // double space for alignment
            }
            System.out.println();
        }

        sc.close(); // Close scanner outside the loop
    }
}*/


public class question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {          // Loop for rows
            for (int j = 1; j <= N; j++) {      // Loop for columns
                System.out.print("* ");
            }
            System.out.println();               // Move to next line
            sc.close();
        }
    }
}
