package Core_Java;

import java.util.*;
class Demo020{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n=sc.nextInt();
        Demo020 d = new Demo020();
        d.getFibonacciSeries(n);
    }
    void getFibonacciSeries(int n){
        System.out.println("Fibonacci series: ");
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}