package Ecapsulation;

public class Area {

	static private double height;  // instence variable for height
	static private double base;    // instence variable for base
	static private double return1; // instence variable for returning area of triangle
	static private double return2; // instence variable for returning area of circle
	static private double redius;  // instence variable for radius
    static private double arms;//instence
    static private double return3;
    
	static void setArms(double h, double b) { 
		height = h;
		base = b;
	}

	static void Triangle() {
		double area;
		area = (height * base) / 2;
		return1 = area;
	}

	static double getTri() {
		return return1;
	}

	static void setRadius(double r) {
		redius = r;
	}

	static void Circle() {
		double area;
		area = 3.1416 * redius * redius;
		return2 = area;
	}

	static double getCir() {
		return return2;
	}
	
     static void setArms(double a) {
    	 arms=a;
    	 
     }
     static void Square() {
    	 double area;
    	 area=arms*arms;
    	 return3=area;
     }
     static double getSqr() {
    	 return return3;
     
     }
}
