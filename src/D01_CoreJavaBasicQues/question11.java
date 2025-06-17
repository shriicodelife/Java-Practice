package D01_CoreJavaBasicQues;//11. Write a Java Program to Compute the Sum of Array Elements.

import java.util.Scanner;

public class question11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum =0;
        System.out.print("enter "+n+" elements in arrays");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];

        }
System.out.println("sum of arrays elements: " +sum);
        sc.close();


        }
}
