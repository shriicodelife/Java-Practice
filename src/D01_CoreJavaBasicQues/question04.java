package D01_CoreJavaBasicQues;//3. Write a Program to Swap Two Numbers


import java.util.Scanner;

/*public class question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter your first number a:");
            int a = sc.nextInt();

            System.out.println("Enter your first number b:");
            int b = sc.nextInt();

            System.out.println("Before swap: a = " + a + ", b = " + b);

            int temp = a;
            a = b;
            b = temp;

            System.out.println("After swap: a = " + a + ", b = " + b);
            sc.close();
        }
    }
}*/





// without using temp var

public class question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter your first number a:");
            int a = sc.nextInt();

            System.out.println("Enter your first number b:");
            int b = sc.nextInt();

            System.out.println("Before swap: a = " + a + ", b = " + b);

           a=a+b;
           b=a-b;
           a=b-a;

            System.out.println("After swap: a = " + a + ", b = " + b);
            sc.close();
        }
    }
}



