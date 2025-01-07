package Core_Java;

import java.util.*;

class Demo015{
    void swapNumber(int a,int b){
        System.out.println("Before Swapping:\na = "+ a+"\nb = "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping:\na = "+ a+"\nb = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo015 obj = new Demo015();

        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        obj.swapNumber(a, b);
    }
}