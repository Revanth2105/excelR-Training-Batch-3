package Core_Java;

import java.util.*;

class Demo012{
    void Area(int rad){
        double ca = Math.PI*rad*rad;
        System.out.println("Area of Circle: "+ca);
    }

    public static void main(String[] args) {
        Demo012 obj = new Demo012();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int rad = sc.nextInt();
        obj.Area(rad);
    }
}