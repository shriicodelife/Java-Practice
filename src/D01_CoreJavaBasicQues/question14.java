package D01_CoreJavaBasicQues;

import java.util.Scanner;

//element present or not in an array
public class question14 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input: size of array
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Input: elements of array
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Input: number to check
            System.out.print("Enter number to search: ");
            int key = sc.nextInt();

            boolean found = false;

            // Linear search
            for (int i = 0; i < n; i++) {
                if (arr[i] == key) {
                    found = true;
                    break;
                }
            }

            // Output result
            if (found) {
                System.out.println(key + " is present in the array.");
            } else {
                System.out.println(key + " is NOT present in the array.");
            }
            sc.close();
        }
    }


