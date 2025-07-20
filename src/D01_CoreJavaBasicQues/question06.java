package D01_CoreJavaBasicQues;//7. Write a Program to Calculate Simple Interest in Java

import java.util.Scanner;

public class question06 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        float principal = sc.nextFloat();

        System.out.print("Enter Principal (R): ");
        float rate = sc.nextFloat();

        System.out.print("Enter Principal (T): ");
        float time = sc.nextFloat();

        float interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest is " +interest);
        sc.close();

    }
}
