package D01_CoreJavaBasicQues;//7. Write a Program to Find Sum of Fibonacci Series Number

import java.util.Scanner;

public class question07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            sum += a;//sum=sum+a

            int next = a + b;
            a = b;

            b = next;
        }

            System.out.println("Sum of first " + n + " Fibonacci numbers is: " + sum);
            sc.close();

        }
    }



        //  LOGIC :- Print a
        //Add a to sum
        //Calculate next Fibonacci number
        //Move a → b
        //Move b → next


