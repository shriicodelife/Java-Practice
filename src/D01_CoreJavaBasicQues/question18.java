package D01_CoreJavaBasicQues;

import java.util.Scanner;
//* * * *
//* * *
//* *
//*

public class question18 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input the number of rows
            System.out.print("Enter N: ");
            int N = sc.nextInt();

            for (int i = N; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            sc.close();
        }
    }

