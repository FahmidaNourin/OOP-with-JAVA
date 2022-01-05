package ex_4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double res=0;
		try{
			double r=input.nextDouble();
		 res=3.1416*r*r;
		}
		catch(Exception e) {
		System.out.println(e);
		}
		System.out.println(res);
		

	}

}
