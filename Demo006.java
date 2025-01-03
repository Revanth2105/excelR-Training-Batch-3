package Core_Java;

import java.util.*;

class Demo006{
    public static void main(String[] args) {
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter username: ");
            String id = sc.next();
            System.out.print("Enter password: ");
            String pass = sc.next();
            if((id.equals("Revanth")) && (pass.equals("Revanth_123"))){
                System.out.println("Hello Revanth, You are welcome ");
                break;
            }else{
                System.out.println("credentials does not match. Please try again.");
            }
        }
    }
}