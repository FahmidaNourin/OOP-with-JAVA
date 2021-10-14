package lab4_method;

public class MyTriangle {
	public static boolean isValid(double side1, double side2, double side3) {
		if((side1+side2)>side3) {
			return true;
		}
		else if((side1+side3)>side2) {
			return true;
		}
		else if((side3+side2)>side1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static double area(double side1, double side2, double side3) {
		double s;
		double area;
		s=(side1+side2+side3);
		area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)); 
		return area;
	}

}
