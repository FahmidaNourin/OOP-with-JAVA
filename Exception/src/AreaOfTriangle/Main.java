package AreaOfTriangle;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double area=0,s;
		try {
			double a=input.nextDouble();
			double b=input.nextDouble();
			double c=input.nextDouble();
			s=(a+b+c)/2;
			area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(area);
		


	}

}
