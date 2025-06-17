package D01_CoreJavaBasicQues;

import java.util.Scanner;

//positions  rotate kth position
public class question13 {


    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // Step 1: Store first k elements

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        // Step 2: Shift remaining elements to the front
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        // Step 3: Put stored elements at the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int val : arr) { //for each loop
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];


// Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

            // Input number of rotations
            System.out.print("Enter number of positions to rotate: ");
            int k = sc.nextInt();
            // Rotate and print result
            leftRotate(arr, k);
            System.out.println("Array after rotation:");
            printArray(arr);
            sc.close();
        }

}




