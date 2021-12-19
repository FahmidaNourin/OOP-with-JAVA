package FtoC;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double fc=input.nextDouble();
		FtoC ftoc=new FtoC();
		double res=ftoc.convert(fc);
		System.out.println(res);
		

	}

}
