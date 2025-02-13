package Core_Java;

import java.util.Scanner;

public class Demo079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = getArrayInput(scanner);
        int target = getTargetInput(scanner);
        
        if (searchElement(arr, target)) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
        
        scanner.close();
    }
    
    private static int[] getArrayInput(Scanner scanner) {
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        return arr;
    }
    
    private static int getTargetInput(Scanner scanner) {
        System.out.print("Enter the element to search: ");
        return scanner.nextInt();
    }
    
    private static boolean searchElement(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
