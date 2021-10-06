package Calculator;

public class Measurment {
	static private double radius;
	static private double height;
	static private double base;
	static private double arm;
	static private double return3;
	static private double return1;
	static private double return2;
	
	static void setRed(double r) {
		radius=r;
	}
	
	static void Circale() {

		double pi = 3.142, area;

		area = pi * radius * radius;

		return1= area;
	}
	static double getCircale() {
		return return1;
		
	}

	static void setArms(double h, double b) {
		height=h;
		base=b;
	}
	static void Triangle() {
		double area;
		area = (height * base) / 2;
		return2= area;
	}

	static double getTriangle() {
		return return2;
		
	}
	static void setArms(double a) {
		arm=a;
	}
	static void Square() {
		double area = arm * arm;
		return3 =area;
	}
	static double getSquare() {
		return return3;
		
	}

}
