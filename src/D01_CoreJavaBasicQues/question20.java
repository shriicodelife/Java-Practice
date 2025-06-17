package D01_CoreJavaBasicQues;

import java.util.Scanner;
//1
//2 2
//3 3 3
//4 4 4 4

public class question20 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter N: ");
            int N = sc.nextInt();

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }

