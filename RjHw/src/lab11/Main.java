package lab11;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name=input.next();
		double length=input.nextDouble();
		double width=input.nextDouble();
		Rectangle rectangle=new Rectangle(name,length,width);
		double area=rectangle.area();
		double perimeter=rectangle.perimeter();
		System.out.println(area);
		System.out.println(perimeter);

	}

}
