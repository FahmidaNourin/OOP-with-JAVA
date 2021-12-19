package Task2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String Name=input.next();
		double Side1=input.nextDouble();
		double Side2=input.nextDouble();
		
		Square square=new Square(Name, Side1, Side2);
		System.out.println(square.area());
		System.out.println(square.perimeter());		

	}

}
