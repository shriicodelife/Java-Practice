package D01_CoreJavaBasicQues;//12. Write a Java Program to Find the Largest Element in Array

import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];// Assume first element is largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];  // Update if current element is greater
            }
        }
        System.out.println("The largest element in the array is: " + largest);
        sc.close();
    }
}

