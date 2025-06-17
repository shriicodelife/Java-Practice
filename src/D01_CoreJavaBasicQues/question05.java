package D01_CoreJavaBasicQues;

//5. Write a Program to Find Factorial of a Number in Java.

/*public class question05 {
//using loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
        sc.close();
    }
}
*/


//using Recursion

public class question05 {
    public int factorial(int n) {
        if (n == 0 || n == 1)
        return 1;
        return n * factorial(n - 1);

    }
    public static void main(String[] args) {
        question05 fact = new question05();
        int result = fact.factorial(5);
        System.out.println("Factorial of 5 is: " +result);

    }

}
