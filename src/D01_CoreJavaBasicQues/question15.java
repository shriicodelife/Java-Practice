package D01_CoreJavaBasicQues;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//15. Java Array Program to Remove Duplicate Elements From an Array
public class question15 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input size
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Input elements
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // LinkedHashSet to remove duplicates and maintain order
            Set<Integer> set = new LinkedHashSet<>();
            for (int num : arr) {
                set.add(num);
            }

            // Output
            System.out.print("Array after removing duplicates: ");
            for (int num : set) {
                System.out.print(num + " ");
            }

            sc.close();
        }
    }

