package Ecapsulation;

public class Area {
	
	
	static private double height;
	static private double base;
	static private double return1;
	static private double return2;
	static private double redius;
	
	static void setArms(double h, double b) {
		height=h;
		base=b;
	}
	
	static void Triangle() {
		double area;
		area = (height * base) / 2;
	    return1=area;  	   
	}
	
	static double getTri() {
		return return1;
	}
	
	
	
	
	
	static void setRadius(double r) {
		redius=r;
	}
	
	
	static void Circle() {
		double area;
		area = 3.1416*redius*redius;
	    return2=area;  	   
	}
	
	static double getCir() {
		return return2;
	}
	
}
