package D01_CoreJavaBasicQues;
// 02.Java Program to implement Bit Manipulation to Find the Sum of two Numbers

// Driver Class
class question02 {
    public static int sum(int num1, int num2)
    {
        if (num2 == 0)
            return num1;
        return sum(num1 ^ num2, (num1 & num2) << 1);
    }

    // main function
    public static void main(String[] args)
    {
        int res = sum(28, 49);
        System.out.println(res);
    }
}

