package lab_12;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int numSide=input.nextInt();
		double sideA=input.nextDouble();
		double sideB=input.nextDouble();
		double sideC=input.nextDouble();
		
		Triangle triangle=new Triangle(numSide,sideA,sideB,sideC);
		double area=triangle.area();
		double perimeter=triangle.perimeter();
		System.out.println(area);
		System.out.println(perimeter);
		
		
		

	}

}
