package input_output;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner nourin=new Scanner(System.in);
		
		int a,b;
		float c,res;
		
		System.out.println("Input the valu of a :");
		a = nourin.nextInt();
		System.out.println("Input the valu of b:");
		b = nourin.nextInt();
		System.out.println("Input the valu of c :");
		c = nourin.nextFloat(); 

		res= (a+b)/c;
		
		System.out.println(" Result: " + res);
		
		
		
	}

}
