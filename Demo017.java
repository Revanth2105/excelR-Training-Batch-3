package Core_Java;

import java.util.*;

class Demo017{
    int sum(int a){
        return (a/10)+(a%10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Demo017 obj = new Demo017();
        System.out.print("Enter a 2 digit number: ");
        int a = sc.nextInt();
        System.out.println("Sum of digits: "+obj.sum(a));
    }
}