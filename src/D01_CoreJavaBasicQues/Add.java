package D01_CoreJavaBasicQues;//1. Write a Program in Java to Add two Numbers.

class Add {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Add obj=new Add();
        int ans=sum(10,10);
                System.out.println(ans);
    }
}