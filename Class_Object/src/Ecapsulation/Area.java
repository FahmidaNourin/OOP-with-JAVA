package Ecapsulation;

public class Area {
	
	static private double height;
	static private double base;
	
	
	Area(double h, double b){
		height=h;
		base=b;
	}
	
	
	
	static double Triangle() {
		double area;
		area = (height * base) / 2;
		return (area);
	}


	
}
