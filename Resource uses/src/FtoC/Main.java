package FtoC;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double fc=input.nextDouble();
		
		FarToCel farTocel=new FarToCel();
		double C=farTocel.convert(fc);
		System.out.println(C);
		
		CelToFar celTofar=new CelToFar();
		double F=celTofar.covert(fc);
		System.out.println(F);
		
		
	

	}

}
