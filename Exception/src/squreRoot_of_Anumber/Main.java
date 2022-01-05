package squreRoot_of_Anumber;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Double squareroot=(double) 0;
		try {
			double num =input.nextDouble();
			squareroot = Math.pow(num, 0.5);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(squareroot);
	}

	}


