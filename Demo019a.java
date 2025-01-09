package Core_Java;

import java.util.*;

class Demo019a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rounded = (((num+2)/5)*5);
        System.out.println("Rounded to the neared multiple of 5: "+rounded);
    }
}