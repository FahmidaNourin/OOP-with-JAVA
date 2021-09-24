package triangle_area;
import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		Scanner raf=new Scanner(System.in);
		int a,b,c;
		double s,area;
		System.out.println("Enter the value of a");
		a=raf.nextInt();
		System.out.println("Enter the value of b");
		b=raf.nextInt();
		System.out.println("Enter the value of c");
		c=raf.nextInt();
		s=(a+b+c)/2;
		area=Math.pow((s*(s-a)*(s-b)*(s-c)),(.5));
		System.out.println("result "+area);
		
	}

}
