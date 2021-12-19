package Function_1;

public class Trigono {
	static private double return1;
	 static private double return2;
	 static private double return3;
	 static private double degree;
	 static void setTan(double d) {
		 degree=d;
	 }
	static void tan() {
		double radians = Math.toRadians(degree);
		return1= Math.tan(radians);
	}
	static double getTan() {
		return return1;
	}
	static void setSin(double d) {
		degree=d;
	}
	

	static void sin() {
		double radians = Math.toRadians(degree);
		return2=Math.sin(radians);
	}
	static double getSin() {
		return return2;
	}
	 static void setCos(double d) {
		 degree=d;
	 }
	static void Cos() {
		double radians = Math.toRadians(degree);
		return3= Math.tan(radians);
	}
	static double getCos() {
		return return3;
	}

}
