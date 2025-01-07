package Core_Java;
import java.util.*;

class TriangleAreaDemo1 {

	double getTriangleArea(int s1,int s2,int s3){
		double s = (s1 + s2 + s3) / 2;
		double ta = Math.sqrt(s * (s - s1) * (s - s2) * (s-s3));
		return ta;
	}
	
}
public class Demo013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of the triangle: ");
		int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();		
        TriangleAreaDemo1 ta = new TriangleAreaDemo1();
        
		
		System.out.println("The triangle area is : " + ta.getTriangleArea(s1, s2, s3));
	}
}