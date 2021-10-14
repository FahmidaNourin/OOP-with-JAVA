package lab4_method;

public class Polygon {
	public static double area(int n, double side) {
		double area;
		
		area=(side)/(2*(Math.tan(180/n)));
		return area;
	}

}
